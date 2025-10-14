package org.CreadoresProgram.Oasis.nukkit.process;
import cn.nukkit.command.CommandSender;

import org.CreadoresProgram.Oasis.nukkit.process.JsonIaInter;
import org.CreadoresProgram.Oasis.nukkit.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
public class PromtIa {
    private static final ExecutorService iaExecutor = Executors.newFixedThreadPool(2);
    private static List<Integer> intentsId = new ArrayList<>();
    private static String infoForIa = "";
    private static final String[] modelsId = {};
    private static String promptIa(String prompt, CommandSender sender){}
    public static void processPrompt(String prompt, CommandSender sender){
        iaExecutor.submit(() -> {
            String json;
            try{
                json = promptIa(prompt, sender);
                JsonIaInter.parcher(json, sender);
            }catch(Exception e){
                intentId = intentsId.size();
                intentsId.set(intentId, 0);
                try{
                    this.fixJson(json, intentId, sender, e.getMessage());
                }catch(Exception ex){
                    sender.sendMessage(Main.getInstance().getConfiguration().getString("prefix") + "§c" + ex.getMessage());
                }
            }
        });
    }
    private static void fixJson(String json, int intentId, CommandSender sender, String errorO){
        if(intentsId.get(intentId) != null && intentsId.get(intentId) > 2){
            intentsId.remove(intentId);
            throw new RuntimeException(Main.getInstance().getLanguajeString("errorPromtIa"));
        }
        try{
            //fix json
            JsonIaInter.parcher(json, sender);
        }catch(Exception e){
            intentsId.set(intentId, intentsId.get(intentId) + 1);
            this.fixJson(json, intentId, sender, e.getMessage());
        }
    }
    public static void shutdownExecutor() {
        iaExecutor.shutdown();
    }
    public static void init(){
        infoForIa = readResourceAsString("/dataIA/GeneralDocJsonAPI.md");
    }
    public static String readResourceAsString(String resourcePath){
        try(InputStream in = Main.class.getResourceAsStream(resourcePath)){
            if(in == null) {
                throw new FileNotFoundException("Resource not found: " + resourcePath);
                try(BufferedReader r = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))){
                    return r.lines().collect(Collectors.joining("\n"));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
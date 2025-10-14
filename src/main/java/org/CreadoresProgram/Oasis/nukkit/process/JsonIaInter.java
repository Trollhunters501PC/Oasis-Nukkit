package org.CreadoresProgram.Oasis.nukkit.process;
import cn.nukkit.command.CommandSender;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.CreadoresProgram.Oasis.nukkit.Main;
public class JsonIaInter {
    public static void parcher(String json, CommandSender sender){
        try{
            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
package org.CreadoresProgram.Oasis.nukkit;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import cn.nukkit.command.Command;

import java.io.File;

import org.CreadoresProgram.Oasis.nukkit.process.PromtIa;
public class Main extends PluginBase {
    private Config config;
    public Config getConfiguration() {
        return this.config;
    }
    private Config languaje;
    public Config getLanguaje() {
        return this.languaje;
    }
    public String getLanguajeString(String path, String... replace) {
        String respo = this.languaje.getString(path);
        if(respo == null) {
            return path;
        }
        for (int i = 0; i < replace.length; i++) {
            String placeholder = "%" + (i + 1);
            String value = replace[i] == null ? "" : replace[i];
            respo = respo.replace(placeholder, value);
        }
        return respo;
    }
    public String getLanguajeString(String path) {
        return this.languaje.getString(path);
    }
    private static Main instance;
    public static Main getInstance() {
        return instance;
    }
    @Override
    public void onLoad() {
        instance = this;
        this.saveResource("config.yml");
        this.config = new Config(this.getDataFolder() + "/config.yml", Config.YAML);
        if(!new File(this.getDataFolder() + "/languaje").exists()){
            new File(this.getDataFolder() + "/languaje").mkdirs();
        }
        switch(this.config.getString("languaje").toLowerCase()){
            case "es":
            case "es_es":
            case "es-mx":
            case "es_ar":
                if(!new File(this.getDataFolder() + "/languaje/es.yml").exists()) {
                    this.saveResource("languaje/es.yml");
                }
                this.languaje = new Config(this.getDataFolder() + "/languaje/es.yml", Config.YAML);
                break;
            case "en":
            case "en_us":
            case "en-gb":
            case "en_au":
                if(!new File(this.getDataFolder() + "/languaje/en.yml").exists()) {
                    this.saveResource("languaje/en.yml");
                }
                this.languaje = new Config(this.getDataFolder() + "/languaje/en.yml", Config.YAML);
                break;
            case "pt":
            case "pt_br":
            case "pt_pt":
                if(!new File(this.getDataFolder() + "/languaje/pt.yml").exists()) {
                    this.saveResource("languaje/pt.yml");
                }
                this.languaje = new Config(this.getDataFolder() + "/languaje/pt.yml", Config.YAML);
                break;
            case "ru":
            case "ru_ru":
                if(!new File(this.getDataFolder() + "/languaje/ru.yml").exists()) {
                    this.saveResource("languaje/ru.yml");
                }
                this.languaje = new Config(this.getDataFolder() + "/languaje/ru.yml", Config.YAML);
                break;
            case "zh":
            case "zh_cn":
            case "zh_tw":
                if(!new File(this.getDataFolder() + "/languaje/zh.yml").exists()) {
                    this.saveResource("languaje/zh.yml");
                }
                this.languaje = new Config(this.getDataFolder() + "/languaje/zh.yml", Config.YAML);
                break;
            default:
                this.getLogger().warning("Languaje not found, defaulting to Español");
                if(!new File(this.getDataFolder() + "/languaje/es.yml").exists()) {
                    this.saveResource("languaje/es.yml");
                }
                this.languaje = new Config(this.getDataFolder() + "/languaje/es.yml", Config.YAML);
                break;
        }
        this.getLogger().info(this.getLanguajeString("cargando"));
    }
    @Override
    public void onEnable() {
        PromtIa.init();
        this.getServer().getCommandMap().register("", new CommandOasis());
    }
    public static class CommandOasis extends Command {
        CommandOasis() {
            super(getLanguajeString("nombreComando"), getLanguajeString("descripcionComando"), getLanguajeString("usoComando"), new String[]{});
            this.setPermission("oasis.nukit.command");
        }
        @Override
        public boolean execute(CommandSender sender, String commandLabel, String[] args) {
            if(!this.testPermission(sender)){
                sender.sendMessage(getConfiguration().getString("prefix") + getLanguajeString("noPermiso"));
                return true;
            }
            if(args.length == 0){
                sender.sendMessage(getConfiguration().getString("prefix") + getLanguajeString("usoComando"));
                return true;
            }
            PromtIa.processPrompt(String.join(" ", args), sender);
            return true;
        }
    }
}
package org.CreadoresProgram.Oasis.nukkit.process;
import cn.nukkit.command.RemoteConsoleCommandSender;
import cn.nukkit.lang.TextContainer;

import org.CreadoresProgram.Oasis.nukkit.Main;
public class OasisIAConsole extends RemoteConsoleCommandSender {
    private static final String prefix = "§b[OasisIA Nukkit Console] §r§l";
    @Override
    public boolean isOp() {
        return true;
    }
    @Override
    public void sendMessage(String message) {
        String messaget = this.getServer().getLanguage().translateString(message);
        Main.getInstance().getLogger().info(Main.getInstance().getConfiguration().getString("prefix")+prefix+messaget);
        super.sendMessage(message);
    }
    @Override
    public void sendMessage(TextContainer message) {
        String messaget = this.getServer().getLanguage().translateString(message);
        Main.getInstance().getLogger().info(Main.getInstance().getConfiguration().getString("prefix")+prefix+messaget);
        super.sendMessage(message);
    }
    @Override
    public String getName() {
        return "OasisIA Nukkit";
    }
}
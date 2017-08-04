package strormtrooper.newmods.commands;


import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;

public class CommandDay extends CommandBase{
	private static final String __OBFID = "CL_00001183";

    public String getCommandName()
    {
        return "day";
    }

    /**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel()
    {
        return 0;
    }

    public String getCommandUsage(ICommandSender sender)
    {
        return "day";
    }

    public void processCommand(ICommandSender sender, String[] commandtext)
    {
    	this.setTime(sender, 1000);
    	sender.addChatMessage(new ChatComponentTranslation("Time set to Day", new Object[0]));
    }
    /**
     * Set the time in the server object.
     */
    protected void setTime(ICommandSender p_71552_1_, int p_71552_2_)
    {
        for (int j = 0; j < MinecraftServer.getServer().worldServers.length; ++j)
        {
            MinecraftServer.getServer().worldServers[j].setWorldTime((long)p_71552_2_);
        }
    }
}

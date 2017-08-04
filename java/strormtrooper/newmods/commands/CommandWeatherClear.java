package strormtrooper.newmods.commands;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.WorldInfo;



public class CommandWeatherClear extends CommandBase {
	private static final String __OBFID = "CL_00001185";
	private final List aliases;
	
	public CommandWeatherClear() 
	{ 
		aliases = new ArrayList(); 
		aliases.add("wc");
		aliases.add("wclear");
	} 
	
    public String getCommandName()
    {
        return "weatherclear";
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
        return "weatherclear";
    }
    @Override 
	public List getCommandAliases() 
	{ 
		return this.aliases;
	} 
    public void processCommand(ICommandSender sender, String[] commandtext)
    {
    	WorldServer worldserver = MinecraftServer.getServer().worldServers[0];
    	WorldInfo worldinfo = worldserver.getWorldInfo();
    	
    	 worldinfo.setRainTime(0);
         worldinfo.setThunderTime(0);
         worldinfo.setRaining(false);
         worldinfo.setThundering(false);
         sender.addChatMessage(new ChatComponentTranslation("Cleared the Weather", new Object[0]));
    }

}

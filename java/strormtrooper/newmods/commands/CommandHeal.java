package strormtrooper.newmods.commands;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class CommandHeal extends CommandBase{

	private final List aliases;


		public CommandHeal() 
		{ 
			aliases = new ArrayList(); 
			aliases.add("heal");
		} 

		@Override 
		public int compareTo(Object o)
		{ 
			return 0; 
		} 

		@Override 
		public String getCommandName() 
		{ 
			return "heal"; 
		} 

		@Override         
		public String getCommandUsage(ICommandSender var1) 
		{ 
			return "heal <text>"; 
		} 

		@Override 
		public List getCommandAliases() 
		{ 
			return this.aliases;
		} 

		@Override 
		public void processCommand(ICommandSender sender, String[] argString)
		{ 
			World world = sender.getEntityWorld(); 
	    
			if (world.isRemote) 
			{ 
				System.out.println("Not processing on Client side"); 
			} 
			else 
			{ 
				System.out.println("Processing on Server side"); 
				if(argString.length > 0) 
				{ 
					sender.addChatMessage(new ChatComponentText("Does not work for other players")); 
					return; 
				} 
				EntityPlayerMP entityplayermp = getCommandSenderAsPlayer(sender);
				entityplayermp.heal(20.0F);
				sender.addChatMessage(new ChatComponentTranslation("Heal Success", new Object[0]));
				
				
			} 
		} 

		@Override 
		public boolean canCommandSenderUseCommand(ICommandSender var1) 
		{ 
		return true;
		} 

		@Override  
		public List addTabCompletionOptions(ICommandSender var1, String[] var2) 
		{ 
			return null; 
		} 

		@Override 
		public boolean isUsernameIndex(String[] var1, int var2) 
		{ 
			return false;
		}
}

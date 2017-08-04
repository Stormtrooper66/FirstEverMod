package strormtrooper.newmods.commands;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.PlayerNotFoundException;
import net.minecraft.command.PlayerSelector;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class CommandIgive extends CommandBase{

	
	


    public String getCommandName()
    {
        return "i";
    }

    /**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel()
    {
        return 0;
    }

    public String getCommandUsage(ICommandSender p_71518_1_)
    {
        return "i";
    }

    public void processCommand(ICommandSender sender, String[] commandtext)
    {

    	Item item = getItemByText(sender, commandtext[0]);
    	EntityPlayerMP entityplayermp = commandtext.length >= 4 ? getPlayer(sender, commandtext[3]) : getCommandSenderAsPlayer(sender);
    	int i = 64;
    	int j = 0;
    	
    	if (commandtext.length >= 2)
        {
            i = parseIntBounded(sender, commandtext[1], 1, 2304);
        }

        if (commandtext.length >= 3)
        {
            j = parseInt(sender, commandtext[2]);
        }
        
        ItemStack itemstack = new ItemStack(item, i, j);
        
        EntityItem entityitem = entityplayermp.dropPlayerItemWithRandomChoice(itemstack, false);   
        entityitem.delayBeforeCanPickup = 0;
        entityitem.func_145797_a(entityplayermp.getCommandSenderName());
        func_152373_a(sender, this, "commands.give.success", new Object[] {itemstack.func_151000_E(), Integer.valueOf(i), entityplayermp.getCommandSenderName()});
    }

    
    /**
     * Return whether the specified command parameter index is a username parameter.
     */
    public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_)
    {
        return p_82358_2_ == 0;
    }
}

package strormtrooper.newmods.commands;

import net.minecraft.block.Block;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class CommandPlatform extends CommandBase{
	private static final String __OBFID = "CL_00000949";

    public String getCommandName()
    {
        return "platform";
    }

    /**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel()
    {
        return 2;
    }

    public String getCommandUsage(ICommandSender p_71518_1_)
    {
        return "platform";
    }

    public void processCommand(ICommandSender sender, String[] commandtext)
    {
        
            int i = sender.getPlayerCoordinates().posX;
            int j = sender.getPlayerCoordinates().posY;
            int k = sender.getPlayerCoordinates().posZ;
            j--;
            
            Block block = Blocks.glass;
            int l = 0;

            World world = sender.getEntityWorld();

            if (!world.blockExists(i, j, k))
            {
                throw new CommandException("commands.setblock.outOfWorld", new Object[0]);
            }
            else
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                boolean flag = false;

                if (commandtext.length >= 7 && block.hasTileEntity())
                {
                    String s = func_147178_a(sender, commandtext, 6).getUnformattedText();

                    try
                    {
                        NBTBase nbtbase = JsonToNBT.func_150315_a(s);

                        if (!(nbtbase instanceof NBTTagCompound))
                        {
                            throw new CommandException("commands.setblock.tagError", new Object[] {"Not a valid tag"});
                        }

                        nbttagcompound = (NBTTagCompound)nbtbase;
                        flag = true;
                    }
                    catch (NBTException nbtexception)
                    {
                        throw new CommandException("commands.setblock.tagError", new Object[] {nbtexception.getMessage()});
                    }
                }


                if (!world.setBlock(i, j, k, block, l, 3))
                {
                    throw new CommandException("commands.setblock.noChange", new Object[0]);
                }
                else
                {
                    if (flag)
                    {
                        TileEntity tileentity = world.getTileEntity(i, j, k);

                        if (tileentity != null)
                        {
                            nbttagcompound.setInteger("x", i);
                            nbttagcompound.setInteger("y", j);
                            nbttagcompound.setInteger("z", k);
                            tileentity.readFromNBT(nbttagcompound);
                        }
                    }

                    func_152373_a(sender, this, "commands.setblock.success", new Object[0]);
                }
            }
    	}
}

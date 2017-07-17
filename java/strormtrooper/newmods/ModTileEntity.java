package strormtrooper.newmods;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ModTileEntity extends TileEntity  {
	
	public static void init() {
	    GameRegistry.registerTileEntity(ModTileEntity.class, "tutorial_tile_entity");
	   
	}
	private void dropBlockAsItem(World world, int x, int y, int z,
			ItemStack stackInSlot) {
		
		
	}
    @Override
    public void updateEntity() {
    	if (this.worldObj.isRemote);
    		//System.out.println("Hello, I'm a TileEntity!");
    }
    
    
}

package strormtrooper.newmods;

import strormtrooper.newmods.gui.GuiTest;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class guitest extends Item{
	public guitest() {
		this.setMaxStackSize(1);
		this.setFull3D();
	}
	
	
	
	
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world,EntityPlayer player) {
		if(!world.isRemote){
			Minecraft.getMinecraft().displayGuiScreen(new GuiTest());
		}
		return super.onItemRightClick(item, world, player);
	}
}

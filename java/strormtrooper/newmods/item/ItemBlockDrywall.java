package strormtrooper.newmods.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockDrywall extends ItemBlockWithMetadata{

	public ItemBlockDrywall(Block block) {
		super(block, block);
		// TODO Auto-generated constructor stub
	}
	
	public String getUnlocalizedName(ItemStack item){
		return this.getUnlocalizedName() + "_" + item.getItemDamage();
	}

}

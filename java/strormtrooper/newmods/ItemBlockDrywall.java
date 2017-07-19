package strormtrooper.newmods;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockDrywall extends ItemBlockWithMetadata {

    public ItemBlockDrywall(Block block) {
		super(block, block);
		// TODO Auto-generated constructor stub
	}
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }
}

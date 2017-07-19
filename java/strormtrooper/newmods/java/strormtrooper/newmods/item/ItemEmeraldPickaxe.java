package strormtrooper.newmods.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEmeraldPickaxe extends ItemPickaxe {

	public ItemEmeraldPickaxe(ToolMaterial material) {
		super(material);
		
	}
	public void onCreated(ItemStack stack, World world, EntityPlayer player)
	{
		stack.addEnchantment(Enchantment.efficiency, 1);
	}
}

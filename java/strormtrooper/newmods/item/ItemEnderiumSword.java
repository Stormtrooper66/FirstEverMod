package strormtrooper.newmods.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemEnderiumSword extends ItemSword {

	public ItemEnderiumSword(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	public boolean hitEntity(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player)
		{
			stack.damageItem(2, player);

			enemy.addPotionEffect(new PotionEffect(Potion.wither.id, 20*5, 1));
			
			return true;
		}

}

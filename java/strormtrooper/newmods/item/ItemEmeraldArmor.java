package strormtrooper.newmods.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemEmeraldArmor extends ItemArmor {

	public ItemEmeraldArmor(ArmorMaterial armormaterial,int renderIndex,
			int armortype) {
		super(armormaterial, renderIndex, armortype);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getArmorTexture(ItemStack stack,Entity entity, int slot, String type)
	{	
		if(this.armorType == 2)
		{
			return "frst:textures/models/armor/emerald_layer_2.png";
		}
		return "frst:textures/models/armor/emerald_layer_1.png";
		
	}
}

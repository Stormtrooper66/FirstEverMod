package strormtrooper.newmods.item;

import strormtrooper.newmods.Newmod_firstever;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemEnderiumArmor extends ItemArmor {

	public ItemEnderiumArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getArmorTexture(ItemStack stack,Entity entity, int slot, String type)
	{	
		if(this.armorType == 2)
		{
			return "frst:textures/models/armor/enderium_layer_2.png";
		}
		return "frst:textures/models/armor/enderium_layer_1.png";
		
	}
	@Override
		public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack)
	{ 
			if(player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(Newmod_firstever.EnderiumHelmet) 
			&& player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(Newmod_firstever.EnderiumChestplate) 
			&& player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(Newmod_firstever.EnderiumLeggings) 
			&& player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(Newmod_firstever.EnderiumBoots))
	{
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 1));
	}
	}
}

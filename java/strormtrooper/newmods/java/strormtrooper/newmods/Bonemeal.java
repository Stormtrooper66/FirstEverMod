package strormtrooper.newmods;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class Bonemeal extends Item{
	 
	public IIcon[] icons = new IIcon[6];
	
	public Bonemeal() {
         super();
         this.setHasSubtypes(true);
         this.getUnlocalizedName();
         this.setCreativeTab(Newmod_firstever.tabFirstEver);
         this.setTextureName("frst:"+this.getUnlocalizedName().substring(5));
	
	
	}
	@Override
	public void registerIcons(IIconRegister reg) {
	    for (int count = 0; count < 6; count ++) {
	        this.icons[count] = reg.registerIcon("frst:Bonemeal"+ "_" + count);
	    }
	}
	@Override
	public IIcon getIconFromDamage(int meta) {
	    if (meta > 5)
	        meta = 0;

	    return this.icons[meta];
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for (int count = 0; count < 6; count ++) {
	        list.add(new ItemStack(item, 1, count));
	    }
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
}

package strormtrooper.newmods;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;



public class Drywall extends Block {

	public IIcon[] textures = new IIcon[6];

	protected Drywall(Material material, String name) {
		super(material);

		

		this.setBlockName(name);
		this.setBlockTextureName("frst:drywall"); // tutmod:tutorialMetaBlock
		this.setCreativeTab(Newmod_firstever.tabFirstEver);
	
		this.setHardness(1F); // stone: 1.5F // obsidian: 50.0F
		this.setLightLevel(0F); // glowstone: 1.0F // stone: 0.0F
		
		this.setResistance(1F); // stone: 10.0F // obsidian: 2000.0F
		this.setStepSound(soundTypeCloth);

	}	
	public void registerBlockIcons( IIconRegister reg ){
		for ( int count = 0; count < 6; count++ ){			
			this.textures[count] = reg.registerIcon(this.textureName+"_"+count);			
		}
	}
	public IIcon getIcon ( int side, int meta ){
		if ( meta > 5 ) meta = 0;
		return this.textures[meta];
	}

	public int damageDropped( int oldMeta ){
		return oldMeta;
	}

	public void getSubBlocks(Item item, CreativeTabs tab, List list){
		for ( int count = 0; count < 6; count++ ){
			list.add(new ItemStack(item, 1, count));
		}
	}
}
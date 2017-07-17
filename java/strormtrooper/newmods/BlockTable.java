package strormtrooper.newmods;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockTable extends Block {

	public IIcon[] textures = new IIcon[6];
	
	protected BlockTable(Material material) {
		super(material);
		
		this.setBlockTextureName("frst:Table");
		
		
		this.setResistance(10);
		this.setHardness(1.0F);
		this.setLightOpacity(11);
		this.setStepSound(this.soundTypeWood);
		
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
		//disable X-ray junk`
	}
	
	public void registerBlockIcons(IIconRegister reg){
		
		for(int count = 0; count < 6; count++){
			this.textures[count] = reg.registerIcon("frst:Table"+"_"+count);
		}
		
	}
	
	public IIcon getIcon(int side, int meta){
		return this.textures[side];
	}
	
}

package strormtrooper.newmods;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityTest extends BlockContainer {

	protected TileEntityTest(Material material) {
		super(material);
	
		this.setBlockName("TileEntityTest");
		this.setBlockTextureName("frst:TileEntityTest");
	}
	@Override
	public boolean isOpaqueCube() {
		return false;
		//disable X-ray junk`
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int Meta) {
		
		return new ModTileEntity();
	}
	
}

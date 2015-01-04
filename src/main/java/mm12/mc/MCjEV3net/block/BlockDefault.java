package mm12.mc.MCjEV3net.block;

import mm12.mc.MCjEV3net.core.EV3TAB;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockDefault extends BlockContainer{

	private String blks;
	private Boolean powers;
	
	protected BlockDefault(String block, Boolean power) {
		super(Material.iron);
		this.setCreativeTab(EV3TAB.INSTANCE);
		this.setHardness(2.0F);
		blks = block;
		powers = power;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return getTileClass();
	}
	
	private TileEntity getTileClass(){
		try {
			Class tester = Class.forName("TE" + blks);
			return (TileEntity) tester.newInstance();
		} catch (ClassNotFoundException e) {} catch (InstantiationException e) {} catch (IllegalAccessException e) {}
		return null;
	}
	
    public boolean canProvidePower()
    {
        return powers;
    }

}

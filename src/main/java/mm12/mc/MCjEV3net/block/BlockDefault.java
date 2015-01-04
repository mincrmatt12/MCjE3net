package mm12.mc.MCjEV3net.block;

import mm12.mc.MCjEV3net.MCjEV3net;
import mm12.mc.MCjEV3net.block.tileEntity.TEGenInterface;
import mm12.mc.MCjEV3net.core.EV3TAB;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
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
		System.out.println("mm12.mc.MCjEV3net.block.tileEntity.TE" + blks);
		return new TEGenInterface();
	}
	
	private TileEntity getTileClass(){
		try {
			Class tester = Class.forName("mm12.mc.MCjEV3net.block.tileEntity.TE" + blks);
			System.out.println(tester);
			return (TileEntity) tester.newInstance();
		} catch (ClassNotFoundException e) {} catch (InstantiationException e) {} catch (IllegalAccessException e) {}
		return null;
	}
	
    public boolean canProvidePower()
    {
        return powers;
    }
    
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ){
    	 TileEntity tileEntity = world.getTileEntity(pos); 
    	  System.out.println(tileEntity);
    	              if (tileEntity == null || player.isSneaking()) { 
    	                      return false; 
    	              } 
    	      //code to open gui explained later 
    	      player.openGui(MCjEV3net.instance, 1, world, pos.getX(), pos.getY(), pos.getZ()); 
    	              return true; 
    	      } 
    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean isFullCube()
    {
        return false;
    }

    public int getRenderType()
    {
        return 3;
    }

}

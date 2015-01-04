package mm12.mc.MCjEV3net.block;

import mm12.mc.MCjEV3net.block.tileEntity.TEGenInterface;
import mm12.mc.MCjEV3net.block.tileEntity.TEGyroSensorAngle;
import mm12.mc.MCjEV3net.block.tileEntity.TEGyroSensorRate;
import mm12.mc.MCjEV3net.block.tileEntity.TEMotor;
import mm12.mc.MCjEV3net.block.tileEntity.TEProximitySensor;
import mm12.mc.MCjEV3net.block.tileEntity.TETouchSensor;
import mm12.mc.MCjEV3net.core.ELIB;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockLoader {
	
	public static Boolean Registered = false;
	
	public static Block motorBlock;
	public static Block touchSensor;
	public static Block proxSensor;
	public static Block gyroR;
	public static Block gyroA;
	public static Block generic;
	
	public static void registerBlocks(){
		motorBlock = new BlockDefault(ELIB.motor, false).setUnlocalizedName(ELIB.motor);
		touchSensor = new BlockDefault(ELIB.touch, true).setUnlocalizedName(ELIB.touch);
		proxSensor = new BlockDefault(ELIB.prox, true).setUnlocalizedName(ELIB.prox);
		gyroR = new BlockDefault(ELIB.gyroR, true).setUnlocalizedName(ELIB.gyroR);
		gyroA = new BlockDefault(ELIB.gryoA, true).setUnlocalizedName(ELIB.gryoA);
		generic = new BlockDefault(ELIB.generic, false).setUnlocalizedName(ELIB.generic);
		
		setToGame();
	}
	
	private static void setToGame(){
		if(!Registered){
			
			GameRegistry.registerBlock(motorBlock, ELIB.motor);
			GameRegistry.registerBlock(touchSensor, ELIB.touch);
			GameRegistry.registerBlock(proxSensor, ELIB.prox);
			GameRegistry.registerBlock(gyroR, ELIB.gyroR);
			GameRegistry.registerBlock(gyroA, ELIB.gryoA);
			GameRegistry.registerBlock(generic, ELIB.generic);
		}
		Registered = true;
	}
	
	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(TEGenInterface.class, ELIB.generic);
		GameRegistry.registerTileEntity(TEGyroSensorAngle.class, ELIB.gryoA);
		GameRegistry.registerTileEntity(TEGyroSensorRate.class, ELIB.gyroR);
		GameRegistry.registerTileEntity(TEMotor.class, ELIB.motor);
		GameRegistry.registerTileEntity(TEProximitySensor.class, ELIB.prox);
		GameRegistry.registerTileEntity(TETouchSensor.class, ELIB.touch);
	}

}

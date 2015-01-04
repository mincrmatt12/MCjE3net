package mm12.mc.MCjEV3net.core;

import mm12.mc.MCjEV3net.block.container.GenInterfaceContainer;
import mm12.mc.MCjEV3net.block.container.GyroSensorAngleContainer;
import mm12.mc.MCjEV3net.block.container.GyroSensorRateContainer;
import mm12.mc.MCjEV3net.block.container.MotorContainer;
import mm12.mc.MCjEV3net.block.container.ProximitySensorContainer;
import mm12.mc.MCjEV3net.block.container.TouchSensorContainer;
import mm12.mc.MCjEV3net.block.tileEntity.TEGenInterface;
import mm12.mc.MCjEV3net.block.tileEntity.TEGyroSensorAngle;
import mm12.mc.MCjEV3net.block.tileEntity.TEGyroSensorRate;
import mm12.mc.MCjEV3net.block.tileEntity.TEMotor;
import mm12.mc.MCjEV3net.block.tileEntity.TEProximitySensor;
import mm12.mc.MCjEV3net.block.tileEntity.TETouchSensor;
import mm12.mc.MCjEV3net.gui.CardGUI;
import mm12.mc.MCjEV3net.gui.GenInterfaceGUI;
import mm12.mc.MCjEV3net.gui.GyroSensorAngleGUI;
import mm12.mc.MCjEV3net.gui.GyroSensorRateGUI;
import mm12.mc.MCjEV3net.gui.MotorGUI;
import mm12.mc.MCjEV3net.gui.ProximitySensorGUI;
import mm12.mc.MCjEV3net.gui.TouchSensorGUI;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIhandler implements IGuiHandler {
    //returns an instance of the Container you made earlier
	public void registerKeyBindings () {}
	
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) 
    {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x,y,z));
            if(tileEntity instanceof TEGenInterface){  	
                 return new GenInterfaceContainer(player.inventory, (TEGenInterface) tileEntity);
            } else if(tileEntity instanceof TEGyroSensorAngle){
            	return new GyroSensorAngleContainer(player.inventory, (TEGyroSensorAngle) tileEntity);
            } else if (tileEntity instanceof TEGyroSensorRate){                	
                return new GyroSensorRateContainer( player.inventory, (TEGyroSensorRate) tileEntity);
            } else if(tileEntity instanceof TEMotor){
            	return new MotorContainer(player.inventory, (TEMotor) tileEntity);
            }else if(tileEntity instanceof TEProximitySensor){
            	return new ProximitySensorContainer(player.inventory, (TEProximitySensor) tileEntity);
            }else if(tileEntity instanceof TETouchSensor){
            	return new TouchSensorContainer(player.inventory, (TETouchSensor) tileEntity);
            }else if(id == 7){
            		return null;
            }                            
            return null;
    }
       

    

    //returns an instance of the Gui you made earlier
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
            
            if(id == 7){
            	//System.out.println("CALLED");       	
            	return new CardGUI();           	
            } else{
            if(tileEntity instanceof TEGenInterface){
            	return new GenInterfaceGUI(player.inventory, (TEGenInterface) tileEntity);
            } else if(tileEntity instanceof TEGyroSensorAngle){            
                return new GyroSensorAngleGUI(player.inventory, (TEGyroSensorAngle) tileEntity);
            	} else if (tileEntity instanceof TEGyroSensorRate){
            	return new GyroSensorRateGUI(player.inventory, (TEGyroSensorRate) tileEntity);
            	} else if(tileEntity instanceof TEMotor){
            		return new MotorGUI(player.inventory, (TEMotor) tileEntity);
            	}else if(tileEntity instanceof TEProximitySensor){
            		return new ProximitySensorGUI(player.inventory, (TEProximitySensor) tileEntity);
                }else if(tileEntity instanceof TETouchSensor){
                	return new TouchSensorGUI(player.inventory, (TETouchSensor) tileEntity);
            }



            }
            
            return null;
      	}
    }

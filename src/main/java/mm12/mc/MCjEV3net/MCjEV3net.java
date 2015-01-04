package mm12.mc.MCjEV3net;

import mm12.mc.MCjEV3net.block.BlockLoader;
import mm12.mc.MCjEV3net.core.GUIhandler;
import mm12.mc.MCjEV3net.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;



@Mod(modid = "MCjEV3net", name = "MC jEV3net", version = "1.0.1")
public class MCjEV3net {
	
	
	@Instance(value = "MCjEV3net")
	public static MCjEV3net instance;
	
	@SidedProxy(clientSide = "mm12.mc.MCjEV3net.proxies.ClientProxy", serverSide = "mm12.mc.MCjEV3net.proxies.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		BlockLoader.registerBlocks();
		BlockLoader.registerTileEntities();
		
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GUIhandler());
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}

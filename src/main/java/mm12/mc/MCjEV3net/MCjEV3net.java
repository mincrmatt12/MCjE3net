package mm12.mc.MCjEV3net;

import mm12.mc.MCjEV3net.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = "MCjEV3net", name = "MC jEV3net", version = "1.0.1")
public class MCjEV3net {
	
	
	@Instance(value = "MCjEV3net")
	public static MCjEV3net instance;
	
	@SidedProxy(clientSide = "mm12.mc.MCjEV3net.proxies.ClientProxy", serverSide = "mm12.mc.MCjEV3net.proxies.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}

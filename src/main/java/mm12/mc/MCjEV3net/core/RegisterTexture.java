package mm12.mc.MCjEV3net.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RegisterTexture {
	
	
	@SideOnly(Side.CLIENT)
	public static void registerTextures(){
		registerBlock(ELIB.generic, 0);
		registerBlock(ELIB.gryoA, 0);
		registerBlock(ELIB.gyroR, 0);
		registerBlock(ELIB.motor, 0);
		registerBlock(ELIB.prox, 0);
		registerBlock(ELIB.touch, 0);
		
	}
	
	
	private static void registerBlock(String blockName, int meta){
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		Item itemB = GameRegistry.findItem("MCjEV3net", blockName);
		renderItem.getItemModelMesher().register(itemB, meta, new ModelResourceLocation("MCjEV3net:"+ blockName, "inventory"));
	}
	private static void register(String blockName, int meta){
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		Item itemB = GameRegistry.findItem("MCjEV3net", blockName);
		renderItem.getItemModelMesher().register(itemB, meta, new ModelResourceLocation("MCjEV3net:"+ blockName, "inventory"));
	}

}

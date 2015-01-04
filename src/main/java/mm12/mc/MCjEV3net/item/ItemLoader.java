package mm12.mc.MCjEV3net.item;

import mm12.mc.MCjEV3net.core.ELIB;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemLoader {
public static Boolean Registered = false;
	
	public static Item cardItem;
	
	public static void registerBlocks(){
		
		cardItem = new CardItem().setUnlocalizedName(ELIB.cardItem);
		
		setToGame();
	}
	
	private static void setToGame(){
		if(!Registered){
			
			GameRegistry.registerItem(cardItem, ELIB.cardItem);
		}
		Registered = true;
	}
	



}

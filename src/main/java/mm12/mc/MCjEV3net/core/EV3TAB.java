package mm12.mc.MCjEV3net.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class EV3TAB extends CreativeTabs{
	public static EV3TAB INSTANCE = new EV3TAB();
	public EV3TAB() {
		super("EV3Tabs");
	}

	@Override
	public Item getTabIconItem() {
		return Items.redstone;
	}
	
}

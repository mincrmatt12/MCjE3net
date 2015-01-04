package mm12.mc.MCjEV3net.item;

import mm12.mc.MCjEV3net.MCjEV3net;
import mm12.mc.MCjEV3net.core.EV3TAB;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CardItem extends Item{
	
	public CardItem(){
		super();
		this.setCreativeTab(EV3TAB.INSTANCE);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		player.openGui(MCjEV3net.instance, 7, world, 0, 0, 0);
		return stack;
	}

}

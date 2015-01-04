package mm12.mc.MCjEV3net.block.container;

import mm12.mc.MCjEV3net.block.tileEntity.TEProximitySensor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ProximitySensorContainer extends Container{

    protected TEProximitySensor tileEntity;

    public ProximitySensorContainer (InventoryPlayer inventoryPlayer, TEProximitySensor te){
            tileEntity = te;

            //the Slot constructor takes the IInventory and the slot number in that it binds to
            //and the x-y coordinates it resides on-screen
            	// this.addSlotToContainer(new Slot(te, 0, 80, 24));
            	//this.addSlotToContainer(new Slot(te, 1, 80, 56));
            	//this.addSlotToContainer(new SlotFilter(te, 2, 147, 24, ItemLoader.knife));
			
            //commonly used vanilla code that adds the player's inventory
            bindPlayerInventory(inventoryPlayer);
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
            return true;
    }


    protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
            for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 9; j++) {
                            addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9,
                                            8 + j * 18, 84 + i * 18));
                    }
            }

            for (int i = 0; i < 9; i++) {
                    addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
            }
    }
}

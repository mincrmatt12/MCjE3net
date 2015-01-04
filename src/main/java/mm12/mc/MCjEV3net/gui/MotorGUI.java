package mm12.mc.MCjEV3net.gui;

import mm12.mc.MCjEV3net.block.container.MotorContainer;
import mm12.mc.MCjEV3net.block.tileEntity.TEMotor;
import mm12.mc.MCjEV3net.core.ELIB;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class MotorGUI extends GuiContainer {
	TEMotor te;
    public MotorGUI (InventoryPlayer inventoryPlayer, TEMotor tileEntity) {
            //the container is instanciated and passed to the superclass for handling
            super(new MotorContainer(inventoryPlayer, tileEntity));
            te = tileEntity;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int param1, int param2) {
            //draw text and stuff here
            //the parameters for drawString are: string, x, y, color
            fontRendererObj.drawString(StatCollector.translateToLocal("INTERFACE_NAME"), 8, 6, 4210752);
            //draws "Inventory" or your regional equivalent
            fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2,
                    int par3) {
            //draw your Gui here, only thing you need to change is the path

    	GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    		this.mc.renderEngine.bindTexture(ELIB.guiDefault);            
    		int x = (width - xSize) / 2;
    		int y = (height - ySize) / 2;
    		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);


    }
}

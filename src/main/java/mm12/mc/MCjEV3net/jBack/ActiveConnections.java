package mm12.mc.MCjEV3net.jBack;

import java.util.HashMap;
import java.util.Map;

import mm12.jEV3net.Connection;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ActiveConnections {
	 public Map<Integer, Connection> connections = new HashMap<Integer, Connection>();
	 
	 public Connection getConn(ItemStack card){
		 if (card.getTagCompound() != null){
			 
			 NBTTagCompound data = card.getTagCompound();
			 
			 int toId = data.getInteger("id");
			 
			 if (connections.containsKey(toId)){
				 return connections.get(toId);
			 }
			 else{
				 // add connection code here....
				 
			 }
			 
		 }
		 return null;
	 }
	
}
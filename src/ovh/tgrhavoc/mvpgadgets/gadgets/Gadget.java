package ovh.tgrhavoc.mvpgadgets.gadgets;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import ovh.tgrhavoc.mvpgadgets.MVPGadgets;

public abstract class Gadget {
	
	protected ItemStack gadgetItem;
	
	public Gadget(){
		MVPGadgets.addGadgetStatic(this);
	}
	
	public boolean isGUI = false;
	
	public abstract void execute(Player player);
	
	public ItemStack getItemStack(){
		return gadgetItem;
	}
	
	public void setItemStack(String name, ItemStack gadgetItem){
		ItemMeta m = gadgetItem.getItemMeta();
		m.setDisplayName(name + " (Gadget)");
		gadgetItem.setItemMeta(m);
		this.gadgetItem = gadgetItem;
	}
	
}

package blazecraft.mod.tabs;

import blazecraft.mod.util.handlers.MainRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlazeTab extends CreativeTabs{

	public BlazeTab(String label) {
		super("blazetab");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return new ItemStack(MainRegistry.BlazeSword);
	}

}

package blazecraft.mod.item;

import blazecraft.mod.init.ItemInit;
import blazecraft.mod.util.handlers.MainRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ItemToxicball extends Item{
	public 	ItemToxicball()
	{
		this.maxStackSize=64;
		this.setCreativeTab(MainRegistry.blazetab);
		this.setRegistryName("itemtoxicball");
		this.setUnlocalizedName("itemtoxicball");
		ItemInit.ITEMS.add(this);
	}
}
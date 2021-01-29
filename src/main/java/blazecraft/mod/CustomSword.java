package blazecraft.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;


public class CustomSword extends ItemSword {

	public CustomSword(ToolMaterial material) {
		super(ExampleMod.BlazeSwordMat);
		this.setRegistryName("blaze_sword");
		this.setUnlocalizedName("blaze_sword");
		this.setCreativeTab(CreativeTabs.COMBAT);
	}

}

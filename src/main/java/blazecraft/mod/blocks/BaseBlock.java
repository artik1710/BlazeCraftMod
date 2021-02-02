package blazecraft.mod.blocks;

import blazecraft.mod.init.BlockInit;
import blazecraft.mod.init.ItemInit;
import blazecraft.mod.util.handlers.CommonProxy;
import blazecraft.mod.util.handlers.IHasModel;
import blazecraft.mod.util.handlers.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
												/* вот этот имплемент был в туториале, но я обошелся без него*/
public class BaseBlock extends Block implements IHasModel{

	public BaseBlock(String name,Material materialIn) {
		super(materialIn);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(MainRegistry.blazetab);		//тут всё интуитивно понятно
		//BlockInit.registerBlocks();
		BlockInit.BLOCKS.add(this); //добавляем в массивы блоков и массив итемов 
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

	}

	@Override
	public void registerModels() {
	//тут ничего нет и не планируется
	}

}

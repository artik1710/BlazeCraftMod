package blazecraft.mod.init;

import java.util.ArrayList;
import java.util.List;

import blazecraft.mod.blocks.BaseBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block CUM_BLOCK = new BaseBlock("cum_block", Material.IRON);
	public static final Block TOXIC_BLOCK = new BaseBlock("toxic_block", Material.CLAY);
	public static final Block BLAZE_FURNANCE = new BaseBlock("blaze_furnance", Material.IRON);
	//этот класс довольно бесполезный и просто выступает как массив всех блоков, ну и тут можно быстро инициализировать базовый блок с другой текстуркой как строкой выше
}

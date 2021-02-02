package blazecraft.mod.util.handlers;

import blazecraft.mod.init.BlockInit;
import blazecraft.mod.init.EntityInit;
import blazecraft.mod.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber
public class CommonProxy {

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
	registerRender(MainRegistry.BlazeSword);
	registerRender(MainRegistry.ItemCumball);
	for(Block block : BlockInit.BLOCKS) {
	registerRender(Item.getItemFromBlock(block)); //тут регаю все рендеры блоков, которые хранятся в BlockInit и добавляются они туда из BaseBlock
	}
	}
	
	
	private static void registerRender(Item item) 
	{
	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) 
	{
	event.getRegistry().register(MainRegistry.BlazeSword);
	event.getRegistry().register(MainRegistry.ItemCumball);
	event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0])); //регистр итемов
	//
	}
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0])); //регистр блоков
		
	}
public static void preInitRegistries() {

}
}




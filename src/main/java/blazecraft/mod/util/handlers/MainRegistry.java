package blazecraft.mod.util.handlers;
import net.minecraftforge.fml.common.Mod.Instance;
import blazecraft.mod.CustomSword;
import blazecraft.mod.init.EntityInit;
import blazecraft.mod.item.ItemCumball;
import blazecraft.mod.tabs.BlazeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = MainRegistry.MODID, name = MainRegistry.NAME, version = MainRegistry.VERSION)
public class MainRegistry
{
	@Instance 
	public static MainRegistry instance;
	 
    public static final String MODID = "blazecraft";
    public static final String NAME = "Blazecraft";
    public static final String VERSION = "0.1";
    public static final CreativeTabs blazetab = new BlazeTab("blazetab");
    public static ToolMaterial BlazeSwordMat;
    public static Item BlazeSword;	//пример того как НЕ надо делать
    public static Item ItemCumball;
 
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // это быдлокод
    	BlazeSwordMat = EnumHelper.addToolMaterial("MATERIAL NAME", 1, 500, 3F, 10.0F, 30);
    	BlazeSword = new CustomSword(BlazeSwordMat);
        ItemCumball = new ItemCumball();
        
        //это профи программеров за 100КК/наносек код
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
        RenderHandler.registerIntemEntityRenders();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code какой сом?...
    }
}

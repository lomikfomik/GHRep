package lomikfomik.helloworld.init;

import lomikfomik.helloworld.HelloWorld;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(HelloWorld.MODID)
public class ModItems {

	public static final Item FIRST_ITEM = null;

	@EventBusSubscriber(modid = HelloWorld.MODID)
	public static class RegistryHandler {
		
		@SubscribeEvent
		public static void registerItems(Register<Item> event) {
			final Item[] items = {
					new Item().setRegistryName(HelloWorld.MODID, "holy_ingot").setUnlocalizedName(HelloWorld.MODID + "." + "holy_ingot").setCreativeTab(CreativeTabs.MISC)
			};

			event.getRegistry().registerAll(items);
		}
		
	}
	
}
package lomikfomik.helloworld;

import lomikfomik.helloworld.block.BlockHolyBlock;
import lomikfomik.helloworld.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = HelloWorld.MODID)
public class EventSubscriber {
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
			new BlockHolyBlock().setRegistryName("holy_block").setUnlocalizedName(HelloWorld.MODID + "." + "holy_block"),	
		};
		
		event.getRegistry().registerAll(blocks);
	}
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new Item().setRegistryName("holy_item").setUnlocalizedName(HelloWorld.MODID + "."+ "holy_item")
		};
		final Item[] itemBlocks = {
				new ItemBlock(ModBlocks.HOLY_BLOCK).setRegistryName(ModBlocks.HOLY_BLOCK.getRegistryName()),
		
	};
	event.getRegistry().registerAll(items);
	event.getRegistry().registerAll(itemBlocks);
	}
}

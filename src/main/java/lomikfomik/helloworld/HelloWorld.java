package lomikfomik.helloworld;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = HelloWorld.MODID, name = HelloWorld.NAME, version = HelloWorld.VERSION, acceptedMinecraftVersions = HelloWorld.MC_VERSION)
public class HelloWorld {
	public static final String MODID = "hwml";
	public static final String NAME = "Hello World Mod";
	public static final String VERSION = "1.0.0";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final Logger LOGGER = LogManager.getLogger(HelloWorld.MODID);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(HelloWorld.NAME + " is loaded!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        
	}

}

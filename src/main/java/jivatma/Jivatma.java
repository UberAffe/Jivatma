package jivatma;

import jivatma.utils.CommonProxy;
import jivatma.utils.RefS;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=RefS.MODID, version=RefS.VERSION)
public class Jivatma {

	@Instance(RefS.MODID)
	public static Jivatma instance;

	@SidedProxy(clientSide="jivatma.utils.ClientProxy", serverSide="jivatma.utils.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit (FMLPreInitializationEvent event){
	proxy.preInit(event);
	}
		
	@EventHandler
	public void init (FMLInitializationEvent event){
	proxy.init(event);
	}
		
	@EventHandler
	public void postInit (FMLPostInitializationEvent event){
	proxy.postInit(event);
	}

}

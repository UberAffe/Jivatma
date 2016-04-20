package jivatma.utils;

import jivatma.blocks.BlockAnvil;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public static SimpleNetworkWrapper network;
	
	public void preInit(FMLPreInitializationEvent event) {
		registerBlocks();
		registerItems();
		registerMessages();
	}

	public void init(FMLInitializationEvent event) {
		registerRecipes();
	}

	public void postInit(FMLPostInitializationEvent event) {
		registerEvents();
	}

	private void registerBlocks(){
		GameRegistry.register(BlockAnvil.instanceBlock);
		GameRegistry.register(BlockAnvil.instanceItemBlock);
	}
	
	private void registerItems(){
		
	}
	
	private void registerRecipes(){
		
	}
	
	private void registerEvents(){
		
	}
	
	private void registerMessages(){
		int messageCount = 0;
		network = NetworkRegistry.INSTANCE.newSimpleChannel(RefS.MODID);
		//this is for messages that get processed server side
		//example: network.registerMessage(MessageDraftSelection.DraftSelectionHandler.class, MessageDraftSelection.class, messageCount++, Side.SERVER);
		//this is for messages that get processed client side
	}
}

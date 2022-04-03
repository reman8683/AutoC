package com.reman8683.nanocrafteroo;

import fi.dy.masa.malilib.event.InitializationHandler;
import net.fabricmc.api.ClientModInitializer;

public class Nanocrafteroo implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		InitializationHandler.getInstance().registerInitializationHandler(new InitHandler());
	}
}

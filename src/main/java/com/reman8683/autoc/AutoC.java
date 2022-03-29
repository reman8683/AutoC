package com.reman8683.autoc;

import fi.dy.masa.malilib.event.InitializationHandler;
import net.fabricmc.api.ClientModInitializer;

public class AutoC implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		InitializationHandler.getInstance().registerInitializationHandler(new InitHandler());
	}
}

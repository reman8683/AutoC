package com.reman8683.autoc;

import com.reman8683.autoc.config.Configs;
import fi.dy.masa.malilib.config.ConfigManager;
import net.minecraft.client.MinecraftClient;
import fi.dy.masa.malilib.event.InputEventHandler;
import fi.dy.masa.malilib.interfaces.IInitializationHandler;
import com.reman8683.autoc.config.Callbacks;
import com.reman8683.autoc.event.InputHandler;

public class InitHandler implements IInitializationHandler
{
    @Override
    public void registerModHandlers() {
        ConfigManager.getInstance().registerConfigHandler(Reference.MOD_ID, new Configs());

        InputEventHandler.getKeybindManager().registerKeybindProvider(InputHandler.getInstance());
        InputEventHandler.getInputManager().registerKeyboardInputHandler(InputHandler.getInstance());
        InputEventHandler.getInputManager().registerMouseInputHandler(InputHandler.getInstance());

        Callbacks.init(MinecraftClient.getInstance());
    }
}
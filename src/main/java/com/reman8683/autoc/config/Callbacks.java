package com.reman8683.autoc.config;

import net.minecraft.client.MinecraftClient;
import fi.dy.masa.malilib.gui.GuiBase;
import fi.dy.masa.malilib.hotkeys.IHotkeyCallback;
import fi.dy.masa.malilib.hotkeys.IKeybind;
import fi.dy.masa.malilib.hotkeys.KeyAction;
import com.reman8683.autoc.gui.GuiConfigs;;

public class Callbacks {

    public static void init(MinecraftClient mc) {
        IHotkeyCallback callbackGeneric = new KeyCallbackHotkeysGeneric(mc);

        Hotkeys.AUTO_C.getKeybind().setCallback(callbackGeneric);
        Hotkeys.OPEN_CONFIG_GUI.getKeybind().setCallback(callbackGeneric);

    }

    private static class KeyCallbackHotkeysGeneric implements IHotkeyCallback {
        private final MinecraftClient client;

        public KeyCallbackHotkeysGeneric(MinecraftClient client) {
            this.client = client;
        }

        @Override
        public boolean onKeyAction(KeyAction action, IKeybind key) {
            if (key == Hotkeys.AUTO_C.getKeybind()) {
                client.player.sendChatMessage("/c");
            }
            if (key == Hotkeys.OPEN_CONFIG_GUI.getKeybind()) {
                GuiBase.openGui(new GuiConfigs());
                return true;
            }
            return false;
        }
    }
}
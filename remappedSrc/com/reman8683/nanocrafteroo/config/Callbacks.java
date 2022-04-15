package com.reman8683.nanocrafteroo.config;

import net.minecraft.client.MinecraftClient;
import fi.dy.masa.malilib.gui.GuiBase;
import fi.dy.masa.malilib.hotkeys.IHotkeyCallback;
import fi.dy.masa.malilib.hotkeys.IKeybind;
import fi.dy.masa.malilib.hotkeys.KeyAction;
import com.reman8683.nanocrafteroo.gui.GuiConfigs;;

public class Callbacks {

    public static void init(MinecraftClient mc) {
        IHotkeyCallback callbackGeneric = new KeyCallbackHotkeysGeneric(mc);

        Hotkeys.OPEN_CONFIG_GUI.getKeybind().setCallback(callbackGeneric);
        Hotkeys.AUTO_C.getKeybind().setCallback(callbackGeneric);

        Hotkeys.AUTO_CHAT1.getKeybind().setCallback(callbackGeneric);
        Hotkeys.AUTO_CHAT2.getKeybind().setCallback(callbackGeneric);
        Hotkeys.AUTO_CHAT3.getKeybind().setCallback(callbackGeneric);
        Hotkeys.AUTO_CHAT4.getKeybind().setCallback(callbackGeneric);
        Hotkeys.AUTO_CHAT5.getKeybind().setCallback(callbackGeneric);
    }

    private static class KeyCallbackHotkeysGeneric implements IHotkeyCallback {
        private final MinecraftClient client;

        public KeyCallbackHotkeysGeneric(MinecraftClient client) {
            this.client = client;
        }

        @Override
        public boolean onKeyAction(KeyAction action, IKeybind key) {
            if (key == Hotkeys.OPEN_CONFIG_GUI.getKeybind()) {
                GuiBase.openGui(new GuiConfigs());
                return true;
            }
            if (key == Hotkeys.AUTO_C.getKeybind()) {
                client.player.sendChatMessage("/c");
                return true;
            }
            if (key == Hotkeys.AUTO_CHAT1.getKeybind()) {
                client.player.sendChatMessage(Configs.Generic.AUTO_CHAT_PRESET1.getStringValue());
                return true;
            }
            if (key == Hotkeys.AUTO_CHAT2.getKeybind()) {
                client.player.sendChatMessage(Configs.Generic.AUTO_CHAT_PRESET2.getStringValue());
                return true;
            }
            if (key == Hotkeys.AUTO_CHAT3.getKeybind()) {
                client.player.sendChatMessage(Configs.Generic.AUTO_CHAT_PRESET3.getStringValue());
                return true;
            }
            if (key == Hotkeys.AUTO_CHAT4.getKeybind()) {
                client.player.sendChatMessage(Configs.Generic.AUTO_CHAT_PRESET4.getStringValue());
                return true;
            }
            if (key == Hotkeys.AUTO_CHAT5.getKeybind()) {
                client.player.sendChatMessage(Configs.Generic.AUTO_CHAT_PRESET5.getStringValue());
                return true;
            }
            return false;
        }
    }
}
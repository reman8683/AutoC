package com.reman8683.nanocrafteroo.config;

import java.util.List;
import com.google.common.collect.ImmutableList;
import fi.dy.masa.malilib.config.options.ConfigHotkey;

public class Hotkeys {
    public static final ConfigHotkey OPEN_CONFIG_GUI = new ConfigHotkey("openConfigGui","O,C",  "The key open the in-game config GUI");
    public static final ConfigHotkey AUTO_C = new ConfigHotkey("AutoC","",  "Auto /c command");

    public static final ConfigHotkey AUTO_CHAT1 = new ConfigHotkey("AutoChat1","",  "Auto Chat for Preset 1");
    public static final ConfigHotkey AUTO_CHAT2 = new ConfigHotkey("AutoChat2","",  "Auto Chat for Preset 2");
    public static final ConfigHotkey AUTO_CHAT3 = new ConfigHotkey("AutoChat3","",  "Auto Chat for Preset 3");
    public static final ConfigHotkey AUTO_CHAT4 = new ConfigHotkey("AutoChat4","",  "Auto Chat for Preset 4");
    public static final ConfigHotkey AUTO_CHAT5 = new ConfigHotkey("AutoChat5","",  "Auto Chat for Preset 5");

    public static final List<ConfigHotkey> HOTKEY_LIST = ImmutableList.of(
            OPEN_CONFIG_GUI,
            AUTO_C,
            AUTO_CHAT1,
            AUTO_CHAT2,
            AUTO_CHAT3,
            AUTO_CHAT4,
            AUTO_CHAT5
    );
}
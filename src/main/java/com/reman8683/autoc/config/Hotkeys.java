package com.reman8683.autoc.config;

import java.util.List;
import com.google.common.collect.ImmutableList;
import fi.dy.masa.malilib.config.options.ConfigHotkey;

public class Hotkeys {
    public static final ConfigHotkey AUTO_C = new ConfigHotkey("autoC","",  "Auto /c command");
    public static final ConfigHotkey OPEN_CONFIG_GUI = new ConfigHotkey("openConfigGui","O,C",  "The key open the in-game config GUI");

    public static final List<ConfigHotkey> HOTKEY_LIST = ImmutableList.of(
            AUTO_C,
            OPEN_CONFIG_GUI
    );
}
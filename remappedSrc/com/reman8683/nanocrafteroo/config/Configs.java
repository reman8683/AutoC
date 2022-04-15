package com.reman8683.nanocrafteroo.config;

import java.io.File;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import fi.dy.masa.malilib.config.ConfigUtils;
import fi.dy.masa.malilib.config.IConfigBase;
import fi.dy.masa.malilib.config.IConfigHandler;
import fi.dy.masa.malilib.config.options.ConfigString;
import fi.dy.masa.malilib.util.FileUtils;
import fi.dy.masa.malilib.util.JsonUtils;
import com.reman8683.nanocrafteroo.Reference;

public class Configs implements IConfigHandler {
    private static final String CONFIG_FILE_NAME = Reference.MOD_ID + ".json";

    public static class Generic {
        public static final ConfigString AUTO_CHAT_PRESET1 = new ConfigString ("AutoChatPreset1", "", "AutoChatPreset1");
        public static final ConfigString AUTO_CHAT_PRESET2 = new ConfigString ("AutoChatPreset2", "", "AutoChatPreset2");
        public static final ConfigString AUTO_CHAT_PRESET3 = new ConfigString ("AutoChatPreset3", "", "AutoChatPreset3");
        public static final ConfigString AUTO_CHAT_PRESET4 = new ConfigString ("AutoChatPreset4", "", "AutoChatPreset4");
        public static final ConfigString AUTO_CHAT_PRESET5 = new ConfigString ("AutoChatPreset5", "", "AutoChatPreset5");
        public static final ImmutableList<IConfigBase> OPTIONS = ImmutableList.of(
                AUTO_CHAT_PRESET1,
                AUTO_CHAT_PRESET2,
                AUTO_CHAT_PRESET3,
                AUTO_CHAT_PRESET4,
                AUTO_CHAT_PRESET5
        );
    }

    public static void loadFromFile()
    {
        File configFile = new File(FileUtils.getConfigDirectory(), CONFIG_FILE_NAME);

        if (configFile.exists() && configFile.isFile() && configFile.canRead())
        {
            JsonElement element = JsonUtils.parseJsonFile(configFile);

            if (element != null && element.isJsonObject())
            {
                JsonObject root = element.getAsJsonObject();

                ConfigUtils.readConfigBase(root, "Generic", Configs.Generic.OPTIONS);
                ConfigUtils.readConfigBase(root, "Hotkey", Hotkeys.HOTKEY_LIST);
            }
        }
    }

    public static void saveToFile() {
        File dir = FileUtils.getConfigDirectory();

        if ((dir.exists() && dir.isDirectory()) || dir.mkdirs()) {
            JsonObject root = new JsonObject();

            ConfigUtils.writeConfigBase(root, "Generic", Generic.OPTIONS);
            ConfigUtils.writeConfigBase(root, "Hotkey", Hotkeys.HOTKEY_LIST);

            JsonUtils.writeJsonToFile(root, new File(dir, CONFIG_FILE_NAME));
        }
    }

    @Override
    public void load() {
        loadFromFile();
    }

    @Override
    public void save() {
        saveToFile();
    }
}
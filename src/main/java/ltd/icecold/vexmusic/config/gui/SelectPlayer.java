package ltd.icecold.vexmusic.config.gui;

import ltd.icecold.vexmusic.VexMusic;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class SelectPlayer {
    public static YamlConfiguration yamlConfiguration;
    public static void init(){
        File configFile = new File(VexMusic.getInstance().getDataFolder(),"/gui/selectplayer.yml");
        yamlConfiguration = YamlConfiguration.loadConfiguration(configFile);
    }

    public static Object get(String path){
        return yamlConfiguration.get(path);
    }
}

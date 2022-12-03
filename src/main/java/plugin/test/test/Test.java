package plugin.test.test;

import jdk.nashorn.internal.parser.JSONParser;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Test Plugin Starting.......!!!!!");

    }

    @Override
    public void onDisable() {
        System.out.println("Test Plugin Shutting Down.......!!!");
    }
}

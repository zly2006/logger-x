package com.github.zly2006.loggerx;

import org.apache.logging.log4j.core.config.plugins.util.PluginManager;

public class PreLaunchLoad {
    public static void load() {
        PluginManager.addPackage("net.minecrell.terminalconsole.util");
    }
}

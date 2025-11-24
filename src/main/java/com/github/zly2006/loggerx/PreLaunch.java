package com.github.zly2006.loggerx;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.apache.logging.log4j.core.config.plugins.util.PluginManager;

public class PreLaunch implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        PluginManager.addPackage("net.minecrell.terminalconsole.util");
    }
}

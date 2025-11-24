package com.github.zly2006.loggerx.fabric;

import com.github.zly2006.loggerx.Loggerx;
import net.fabricmc.api.ModInitializer;

public final class LoggerxFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Loggerx.init();
    }
}

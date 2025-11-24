package com.github.zly2006.loggerx.fabric;

import com.github.zly2006.loggerx.LoggerX;
import com.github.zly2006.loggerx.PreLaunchLoad;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public final class LoggerxFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            LoggerX.LOGGER.info("LoggerX: Development environment detected, skipping reconfiguration.");
            return;
        }
        PreLaunchLoad.load();
        LoggerX.reconfigure();
    }
}

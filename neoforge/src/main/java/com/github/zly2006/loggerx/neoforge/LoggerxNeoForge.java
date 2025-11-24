package com.github.zly2006.loggerx.neoforge;

import com.github.zly2006.loggerx.LoggerX;
import com.github.zly2006.loggerx.PreLaunchLoad;
import net.neoforged.fml.common.Mod;

@Mod(LoggerX.MOD_ID)
public final class LoggerxNeoForge {
    public LoggerxNeoForge() {

        PreLaunchLoad.load();
        LoggerX.reconfigure();
    }
}

package com.github.zly2006.loggerx.neoforge;

import com.github.zly2006.loggerx.Loggerx;
import net.neoforged.fml.common.Mod;

@Mod(Loggerx.MOD_ID)
public final class LoggerxNeoForge {
    public LoggerxNeoForge() {
        // Run our common setup.
        Loggerx.init();
    }
}

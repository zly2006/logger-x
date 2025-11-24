package com.github.zly2006.loggerx;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LifeCycle;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URISyntaxException;

public final class LoggerX {
    public static final String MOD_ID = "LoggerX";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void reconfigure() {
        if (LogManager.getContext(LoggerX.class.getClassLoader(), false) instanceof LoggerContext context) {
            if (context.getState() != LifeCycle.State.STARTED) {
                LOGGER.error("LoggerX: LoggerContext is not started, cannot reconfigure.");
                return;
            }
            try {
                Configuration configuration = ConfigurationFactory.getInstance()
                        .getConfiguration(
                                context,
                                "Logger X Configuration",
                                LoggerX.class.getClassLoader().getResource("logger-x/log4j.xml").toURI()
                        );
                configuration.start();
                context.reconfigure(configuration);
                LOGGER.info("LoggerX: Reconfigured logger context.");
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package com.learn.config;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ANSIConstants;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

public class ConsoleColor extends ForegroundCompositeConverterBase<ILoggingEvent> {

    @Override
    protected String getForegroundColorCode(ILoggingEvent  ILoggingEvent ) {
        Level level = ILoggingEvent.getLevel();
        switch (level.toInt()) {
            //ERROR等级为红色
            case Level.ERROR_INT:
                return ANSIConstants.RED_FG;
            //WARN等级为黄色
            case Level.WARN_INT:
                return ANSIConstants.YELLOW_FG;
            //DEBUG等级为绿色
            case Level.DEBUG_INT:
                return ANSIConstants.GREEN_FG;
                //其他为默认颜色
            default:
                return ANSIConstants.DEFAULT_FG;
        }
    }
}
package com.learn.ann;

import java.lang.annotation.*;

/**
 * @author xyp
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
    String value() default "";
}

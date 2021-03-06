package com.jacobs.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lichao on 2017/8/8.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface MapperProcessorAnnotation {

}

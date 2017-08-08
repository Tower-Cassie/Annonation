package com.xiaohong.annotention;

import java.lang.annotation.*;

//标志注解的生命周期
@Retention(RetentionPolicy.RUNTIME)
//标志注解的应用范围
@Target(value = {ElementType.METHOD,ElementType.TYPE})

public @interface annotation02 {
	//如果注解中只有一个属性，则一般将属性命名未value;
	String value() default "";

}

package com.xiaohong.annotention;
/**
 * 自定义的注解
 */
import java.lang.annotation.*;
//标志注解的生命周期
@Retention(RetentionPolicy.RUNTIME)
//标志注解的应用范围
@Target(value = {ElementType.METHOD,ElementType.TYPE})
	public @interface anntention01{
	//注意此是属性，而不是方法，注解里面的值必须初始化
	//如果不初始化，则在调用的时候也必须初始化
	String studentName() default "";
	int age() default 0;
	int id() default -1;
		
	}

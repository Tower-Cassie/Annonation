package com.xiaohong.annotention;

import java.lang.annotation.*;

//��־ע�����������
@Retention(RetentionPolicy.RUNTIME)
//��־ע���Ӧ�÷�Χ
@Target(value = {ElementType.METHOD,ElementType.TYPE})

public @interface annotation02 {
	//���ע����ֻ��һ�����ԣ���һ�㽫��������δvalue;
	String value() default "";

}

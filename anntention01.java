package com.xiaohong.annotention;
/**
 * �Զ����ע��
 */
import java.lang.annotation.*;
//��־ע�����������
@Retention(RetentionPolicy.RUNTIME)
//��־ע���Ӧ�÷�Χ
@Target(value = {ElementType.METHOD,ElementType.TYPE})
	public @interface anntention01{
	//ע��������ԣ������Ƿ�����ע�������ֵ�����ʼ��
	//�������ʼ�������ڵ��õ�ʱ��Ҳ�����ʼ��
	String studentName() default "";
	int age() default 0;
	int id() default -1;
		
	}

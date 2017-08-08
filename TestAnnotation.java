package com.xiaohong.annotention;
/**
 * 测试注解的主程序
 * @author xiaohong
 *
 */
public class TestAnnotation {
	
		@anntention01(age = 19,studentName = "张少校")
		public void start(){
			
		}
		//@annotation02(value = "12")
		@annotation02("12")
		public void test(){
			
		}
}

package com.assist.thinkdata.duubo.main;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.assist.thinkdata.duubo.service.DemoService;

public class Consumer {
	 public static void main(String[] args) throws Exception {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"http://10.20.160.198/wiki/display/dubbo/consumer.xml"});
	        context.start();

	        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
	        String hello = demoService.sayHello("world"); // 执行远程方法

	        System.out.println( hello ); // 显示调用结果
	    }
	 @Test
	public void fastjsonTest(){
		
	}
}

package chap02_04_02;

import chap02_04_02.Monitor;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForSensor {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:chap02_04_02/config-sensor.xml");
		Monitor monitor = ctx.getBean(Monitor.class);
		System.out.println(monitor);
		ctx.close();
	}

}

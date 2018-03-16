package chap02_04_01;

import chap02_04_01.ErpClient;
import chap02_04_01.ErpClientFactory;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForErp {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:chap02_04_01/config-erp.xml");
		ErpClientFactory factory = ctx.getBean("factory", ErpClientFactory.class);
		ErpClient client = factory.create();
		System.out.println("========");
		client.connect();
		client.close();
		System.out.println("========");
		ctx.close();
	}

}

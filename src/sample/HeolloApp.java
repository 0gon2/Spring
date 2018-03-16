package sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HeolloApp {
public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/beans.xml"));
	MessageBean bean=factory.getBean("messageBean",MessageBean.class);
	bean.sayHello("Spring");
}
}

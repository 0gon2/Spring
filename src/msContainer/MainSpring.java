package msContainer;

public class MainSpring {
	MsSpringContainer cont=new MsSpringContainer("msSpring.Myclass01");
	Myclass01 my=cont.getBean(MyClass01.class);
	my.aaa();

}

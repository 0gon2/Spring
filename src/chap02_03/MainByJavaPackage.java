package chap02_03;

import chap02.AuthenticationService;
import chap02.PasswordChangeService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainByJavaPackage {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext("chap02_03");

		AuthenticationService authSvc =
				ctx.getBean("authenticationService", AuthenticationService.class);
		authSvc.authenticate("bkchoi", "1234");

		PasswordChangeService pwChgSvc = 
				ctx.getBean(PasswordChangeService.class);
		pwChgSvc.changePassword("bkchoi", "1234", "5678");

		ctx.close();
	}

}

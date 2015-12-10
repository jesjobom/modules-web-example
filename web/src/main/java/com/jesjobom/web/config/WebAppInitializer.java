package com.jesjobom.web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author jesjobom
 */
public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		// Cria o contexto raiz da app, podendo incluir os contextos filhos
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		//rootContext.register(ServiceConfig.class, JPAConfig.class, SecurityConfig.class);
		sc.addListener(new ContextLoaderListener(rootContext));

		// Cria o dispatcher do contexto do spring
		AnnotationConfigWebApplicationContext dispatcherServlet = new AnnotationConfigWebApplicationContext();
		dispatcherServlet.register(SpringMvcConfig.class);

		// Registra o mapeamento do dipatcher
		ServletRegistration.Dynamic dispatcher = sc.addServlet("dispatcher", new DispatcherServlet(dispatcherServlet));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}
}

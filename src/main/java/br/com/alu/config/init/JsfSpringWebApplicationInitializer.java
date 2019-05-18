package br.com.alu.config.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import br.com.alu.config.MySpringBeanConfig;

public class JsfSpringWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();

		applicationContext.register(MySpringBeanConfig.class);

		servletContext.addListener(new ContextLoaderListener(applicationContext));
		servletContext.addListener(new RequestContextListener());

	}
}

package br.com.alu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="br.com.alu")
public class MySpringBeanConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean fabrica = new LocalEntityManagerFactoryBean();
		fabrica.setPersistenceUnitName("AluTestePU");
		return fabrica;
	}
	
	@Bean
	public JpaTransactionManager getJpaTransactionManager() {
		JpaTransactionManager transacao = new JpaTransactionManager();
		transacao.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
		return transacao;
	}
	
}

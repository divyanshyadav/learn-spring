package com.learn.spring.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(
	value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
	proxyMode = ScopedProxyMode.TARGET_CLASS
)
public class JdbcConnection {
	JdbcConnection() {
		System.out.println("JdbcConnection object created");
	}
}

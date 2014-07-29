package com.hascode.tutorial.setup;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@Startup
@Singleton
public class InitializerBean {
	@PersistenceContext
	private EntityManager em;

	@Resource(name = "jboss/datasources/ExampleDS")
	private DataSource ds;

	@PostConstruct
	protected void bootstrap() {
	}
}

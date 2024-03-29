package com.ihniwimdcorp.vrp.dao;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Ignore
@ContextConfiguration({"classpath:spring/testWebContext.xml", "classpath:spring/integrationTestContext.xml", "classpath:spring/testDataSource.xml"})
@TransactionConfiguration(defaultRollback=false)
@Transactional(propagation=Propagation.REQUIRED)
public class AbstractDaoTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Before
	public void setUp() {
		prepareDatabase();
	}
	
	@SuppressWarnings("unused")
	private Session session() {
		if (sessionFactory == null) {
			throw new SessionException("Session Factory não pode ser nulo.");
		}
		
		return sessionFactory.getCurrentSession();
	}

	private void prepareDatabase() {
//		executeSqlScript("sql/prepareDatabase.sql", false);
	}
}

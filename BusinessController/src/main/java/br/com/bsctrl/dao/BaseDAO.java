package br.com.bsctrl.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
abstract public class BaseDAO {

	@Autowired
	protected SessionFactory sessionFactory;

	protected void save(Object obj){
		sessionFactory.getCurrentSession().save(obj);
	/*	Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		
		try{
			session.save(obj);
			transaction.commit();
		}
		catch(Throwable t){
			LoggerManager.error(t.getMessage());
			transaction.rollback();
		}
		finally{
			session.clear();
		}*/
	}

	protected Object get(long id, Class<?> clazz) {
		return sessionFactory.getCurrentSession()
			.createQuery("from " + clazz.getSimpleName() + " where id = :id")
			.setParameter("id", id).uniqueResult();
		
		/*Session session = sessionFactory.openSession();
		return session.createQuery("from " + clazz.getSimpleName() + " where id = :id")
		.setParameter("id", id).uniqueResult();*/
	}

	public List<?> getAll(Class<?> clazz) {
		return sessionFactory.getCurrentSession().createCriteria(clazz.getClass()).list();
		/*Session session = sessionFactory.openSession();
		return session.createCriteria(clazz.getClass()).list();*/
	}

}

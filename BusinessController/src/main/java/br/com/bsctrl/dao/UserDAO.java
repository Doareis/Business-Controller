package br.com.bsctrl.dao;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.bsctrl.entity.User;

@Repository
@Transactional
public class UserDAO extends BaseDAO{
	
	public void save(User user){
		user.setRegisterDate(Calendar.getInstance());
		super.save(user);
	}

	public User getUserById(long id){
		return (User) super.get(id, User.class);
	}

	public User getUserByEmail(String email){
		Session session = super.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User as user where user.email = :email");
		query.setParameter("email", email);
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>)query.list();
		
		if(list.size() > 0)
			return list.get(0);
		
		return null;
	}
}

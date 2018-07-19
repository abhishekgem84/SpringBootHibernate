package com.aks.app.controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aks.app.model.entity.RegisteredUser;
import com.aks.app.model.service.RegistrationService;
import com.aks.app.model.service.UserRoleServiceImpl;

@RestController
public class Registration {
	@Autowired
	private RegistrationService registrationService;

	@Autowired
	private UserRoleServiceImpl userRoleServcieImpl;

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@RequestMapping(value = "/p2/reg", method = RequestMethod.POST)
	public void registerUser(@RequestBody RegisteredUser registration) {
		// System.out.println("Welcome" + registration.getMobileNumber());
		// registrationService.addRegistration(registration);
		// //userRoleServcieImpl.addUserRole(new UserRole(registration.getId(), 2));
		// System.out.println("Welcome" + registration.getId());
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		

		session.save(registration);

		session.getTransaction().commit();
		session.close();
	}

	@RequestMapping(value = "/p2/greg/{user_id}", method = RequestMethod.GET)
	@ResponseBody
	public RegisteredUser getRegisterUser(@PathVariable(name = "user_id") int user_id) {
		RegisteredUser list = (RegisteredUser) hibernateTemplate.getSessionFactory().openSession()
				.get(RegisteredUser.class, user_id);
		return list;
	}

	@RequestMapping(value = "/p2/gregm/{mobile_number}", method = RequestMethod.GET)
	@ResponseBody
	public List<RegisteredUser> getRegisterUserByMobileNumber(
			@PathVariable(name = "mobile_number") String mobile_number) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();

		CriteriaQuery<RegisteredUser> criteria = cb.createQuery(RegisteredUser.class);
		Root<RegisteredUser> root = criteria.from(RegisteredUser.class);
		criteria.select(root);
		criteria.where(cb.equal(root.get("mobileNumber"), mobile_number));

		List<RegisteredUser> list = session.createQuery(criteria).getResultList();

		return list;
	}

	@RequestMapping(value = "/p2/gregm/{mobile_number}/{password}", method = RequestMethod.GET)
	@ResponseBody
	public List<RegisteredUser> getRegisterUserByMobileNumberAndPassword(
			@PathVariable(name = "mobile_number") String mobile_number,
			@PathVariable(name = "password") String password) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();

		CriteriaQuery<RegisteredUser> criteria = builder.createQuery(RegisteredUser.class);
		Root<RegisteredUser> root = criteria.from(RegisteredUser.class);
		root.fetch("userLoginDetails", JoinType.LEFT);
		criteria.select(root);
		criteria.where(builder.and(
				builder.equal(root.get("mobileNumber"), mobile_number),
				builder.equal(root.get("userLoginDetails").get("password"), password)
				));

		List<RegisteredUser> list = session.createQuery(criteria).getResultList();

		return list;
	}
}

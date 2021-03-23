package com.xworkz.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dto.RegisterDTO;

public class RegisterDAOImpl implements RegisterDAO {
	private static SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();

	@Override
	public void saveRegister(RegisterDTO registerdto) {
		Session session = null;
		try {
			session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(registerdto);
			System.out.println(registerdto);
			transaction.commit();
			System.out.println("Register DTO is saved");
		} catch (IllegalArgumentException e) {
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("Session is closed");
				} else {
					System.out.println("Session not closed");
				}
			} catch (HibernateException e2) {
			}
			try {
				if (Objects.nonNull(sessionfactory)) {
					sessionfactory.close();
					System.out.println("sessionfactory is closed");
				} else {
					System.out.println("sessionfactory not closed");
				}
			} catch (HibernateException e2) {
			}

		}

	}

}

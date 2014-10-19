package nuaa.persistence;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testbak {
	public static void main(String args[]) {
		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			Student student = new Student();
			student.setSex("ff");
			student.setId("45");
			student.setAge("18");
			student.setPassword("asdfa");
			student.setUsername("hj");
			session.save(student);
			transaction.commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}
}
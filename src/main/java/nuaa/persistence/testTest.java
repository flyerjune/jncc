package nuaa.persistence;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class testTest {

	// 遍历
	public static void all() {
		Query q = session
				.createQuery("select c.id,c.username from TestDb as c");

		List l = q.list();
		for (int i = 0; i < l.size(); i++) {
			// TestDb user = (TestDb)l.get(i);
			// System.out.println(user.getUsername());

			Object[] row = (Object[]) l.get(i);
			;
			Long id = (Long) row[0];
			String name = (String) row[1];
			System.out.println(id + " " + name);
		}
	}

	// 读取
	public static void load() {
		TestDb obj = (TestDb) session.load(TestDb.class, new Long(2));
		System.out.println(obj.getUsername());
	}

	// 更新
	public static void update() {
		TestDb obj = (TestDb) session.load(TestDb.class, new Long(2));
		obj.setUsername("cg");
	}

	// 插入
	public static void insert() {
		TestDb user = new TestDb();
		user.setUsername("sb");

		session.save(user);
	}

	static SessionFactory sessionFactory;
	static Session session;
	static Transaction tx;

	private static void init() {
//		sessionFactory = new Configuration().configure().buildSessionFactory();
//		session = sessionFactory.openSession();
		
		Configuration configuration = new Configuration().configure(); 
		@SuppressWarnings("deprecation")
		ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		Session session = configuration.buildSessionFactory(serviceRegistry).openSession();
		
		tx = session.beginTransaction();
	}

	private static void close() {
		tx.commit();
		session.close();
		sessionFactory.close();
		
	}

	public static void main(String[] args) {
		init();
		insert();
		insert();
		update();
		close();
	}
}

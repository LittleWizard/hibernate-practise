package practise;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtilities {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry; // an abstraction o hibernate for doing
    //things differently.

    static {
        try {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            //configuration.addClass(User.class);
            configuration.addResource("User.hbm.xml");
            configuration.addResource("UserHistory.hbm.xml");
            configuration.addResource("ProteinData.hbm.xml");
            configuration.addResource("GoalAlert.hbm.xml");
            serviceRegistry  = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        catch(HibernateException exception) {
            System.out.println("Problem creating session factory " + exception.getMessage() + exception.getStackTrace());
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}

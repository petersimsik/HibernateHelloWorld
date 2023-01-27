package sk.simo.client;

import org.hibernate.Session;
import sk.simo.domain.Message;
import sk.simo.util.HibernateUtil;

public class HelloWorldClient {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Message message = new Message( "Hello World with Hibernate and JPA Annotations" );

        session.save(message);


        session.getTransaction().commit();
        session.close();

    }
}


package com.softserveinc.edu.oop;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by cam on 14.10.15.
 */
public class AddToDB {
//    int i = 0;

    public static void main(String[] args) {
//        new StoreData().i = 5;
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
//        cfg.addAnnotatedClass(PlaneFigure.class);
//        cfg.addAnnotatedClass(Circle.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Circle c1 = new Circle(2);
//        c1.setId(115);
//        c1.setRadius(2);
        session.persist(c1);
        t.commit();
        session.close();
        System.out.println("successfully saved");
    }
}

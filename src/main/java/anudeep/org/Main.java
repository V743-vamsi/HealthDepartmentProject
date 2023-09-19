package anudeep.org;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.config.xml").build();
        Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
        
        SessionFactory factory=md.getSessionFactoryBuilder().build();  
        
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        Hospital h=new Hospital();
        h.setHname("APOLLO");
        
        Hospital h1=new Hospital();
        h1.setHname("SVIMS");
        
        Doctors d=new Doctors();
        d.setFee(5000);
        d.setdName("vamsi");
   
        Doctors d1=new Doctors();
        d1.setFee(10000);
        d1.setdName("Nikhil");
       
        
        session.save(h);
        session.save(h1);
        session.save(d);
        session.save(d1);
        t.commit();
        
        factory.close();
        session.close();
	}
}

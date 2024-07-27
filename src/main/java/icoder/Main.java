package icoder;

import icoder.Models.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        Metadata meta = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory factory =meta.getSessionFactoryBuilder().build();
  // we can say that go to the config and indicated files you should read and build mapping tag
        //ba'zaga kirib connection qil va bor tabellarni olib keladi
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        StudentEntity studentEntit = new StudentEntity();
        studentEntit.setId(2);
        studentEntit.setName("Ramziddin");
        studentEntit.setSurname("Rustamov");
        studentEntit.setAge(25);
        session.save(studentEntit);

        transaction.commit();
        session.close();
        factory.close();
    }
}
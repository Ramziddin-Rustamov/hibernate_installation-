package icoder;

import icoder.Models.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.id.IntegralDataTypeHolder;
import org.hibernate.query.Query;

import java.time.LocalDateTime;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

          // create a student
//        StudentEntity student = new StudentEntity();
//        student.setId(4);
//        student.setName("Ramziddin");
//        student.setSurname("Rustamov");
//        student.setAge(25);
//        student.setCreatedDate(LocalDateTime.now());
//        create(student);

          // get all of the student List
//        List<StudentEntity> all = studentList();
//        all.forEach(studentEntity -> System.out.println(studentEntity.toString()));

          // get by id if id not exist return null
//        System.out.println(getById(1));

         // get by name and surname
//        List<StudentEntity> studentEntities = getByNameAndSurname("Ramziddin", "Rustamov");
//        System.out.println(studentEntities);

         //update methods
//        StudentEntity student = new StudentEntity();
//        student.setName("Jonijon");
//        student.setSurname("Botirov");
//        updateStudent(1,student);

        //update methods
//        StudentEntity student = new StudentEntity();
//        student.setName("Ram");
//        student.setSurname("Rus");
//        updateByQuery(1,student);

          // delete by id
//        delete(1);// method one
          deleteUsingHQL(2);

    }


//    public static List<StudentEntity> studentList(){
//        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
//        SessionFactory factory =meta.getSessionFactoryBuilder().build();
//        Session session = factory.openSession();
//
//
//        Query q =  session.createQuery("from StudentEntity", StudentEntity.class); // hql for postgresSQL and orqacle
//        List<StudentEntity> list = q.getResultList();
//        session.close();
//        factory.close();
//        return list;
//    }
 // option 1
//    public static StudentEntity getById(Integer id)
//    {
//        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
//        SessionFactory factory =meta.getSessionFactoryBuilder().build();
//        Session session = factory.openSession();
//       StudentEntity student =  session.get(StudentEntity.class,id);
//        session.close();
//        factory.close();
//        return student;
//    }
//     option 2
//    public static StudentEntity getById(Integer id)
//    {
//        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
//        SessionFactory factory =meta.getSessionFactoryBuilder().build();
//        Session session = factory.openSession();
//
//        Query query = session.createQuery("from StudentEntity where id ="+id,StudentEntity.class);
//        List<StudentEntity> student = query.getResultList();
//        session.close();
//        factory.close();
//        if(student.size() > 0){
//            return student.get(0);
//        }
//        return null;
//    }

//    public static List<StudentEntity> getByNameAndSurname(String name , String surname)
//    {
//        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
//        SessionFactory factory =meta.getSessionFactoryBuilder().build();
//        Session session = factory.openSession();
//
//        Query query = session.createQuery("from StudentEntity where name =:name and surname =:surname",StudentEntity.class);
//        query.setParameter("name",name);
//        query.setParameter("surname",surname);
//        List<StudentEntity> list = query.getResultList();
//        session.close();
//        factory.close();
//        return  list;
//    }


//    public static void updateByQuery(Integer id, StudentEntity studentEntity)
//    {
//
//        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
//        SessionFactory factory =meta.getSessionFactoryBuilder().build();
//
//        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();
//        Query query = session.createQuery("update StudentEntity set name =:name , surname =:surname where id =:id ");
//        query.setParameter("name",studentEntity.getName());
//        query.setParameter("surname", studentEntity.getSurname());
//        query.setParameter("id", id);
//       int effectedRows =  query.executeUpdate();
//        transaction.commit();
//        session.close();
//        factory.close();
//
//    }


    //update


//    public static void updateStudent(Integer id, StudentEntity studentEntity)
//    {
//
//        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
//        SessionFactory factory =meta.getSessionFactoryBuilder().build();
//
//        Session session = factory.openSession();
//
//
//        StudentEntity student = session.get(StudentEntity.class,id);
//        if(student == null){
//            System.out.println("not found");
//            return;
//        }
//
//        student.setName(studentEntity.getName());
//        student.setSurname(studentEntity.getSurname());
//        Transaction transaction = session.beginTransaction();
//        session.update(student);
//        session.update(student); // we can also use save instead of update
//        transaction.commit();
//        session.close();
//        factory.close();
//    }

    // create

//    public static void create(StudentEntity student){
//        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
//        SessionFactory factory =meta.getSessionFactoryBuilder().build();
//        // we can say that go to the config and indicated files you should read and build mapping tag
//        //ba'zaga kirib connection qil va bor tabellarni olib keladi
//        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(student);
//
//        transaction.commit();
//        session.close();
//        factory.close();
//    }


//    create
//    public static void delete(Integer id)
//    {
//        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
//        SessionFactory factory =meta.getSessionFactoryBuilder().build();
//        // we can say that go to the config and indicated files you should read and build mapping tag
//        //ba'zaga kirib connection qil va bor tabellarni olib keladi
//        Session session = factory.openSession();
//        session.delete(id);
//    }

   // method 1 to delete onoe item
//    public static void delete(Integer id){
//        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
//        SessionFactory factory =meta.getSessionFactoryBuilder().build();
//
//        // we can say that go to the config and indicated files you should read and build mapping tag
//        //ba'zaga kirib connection qil va bor tabellarni olib keladi
//
//        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//       StudentEntity student = session.get(StudentEntity.class,id);
//       if(student == null){
//           System.out.println("there is no student releted to "+id);
//           return;
//       }
//
//       session.delete(student);
//
//        transaction.commit();
//        session.close();
//        factory.close();
//    }

      // method 2
//   public static void deleteUsingHQL(Integer id){
//       StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//       Metadata meta = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
//       SessionFactory factory =meta.getSessionFactoryBuilder().build();
//
//       // we can say that go to the config and indicated files you should read and build mapping tag
//       //ba'zaga kirib connection qil va bor tabellarni olib keladi
//
//       Session session = factory.openSession();
//       Transaction transaction = session.beginTransaction();
//
//       Query query = session.createQuery("delete from StudentEntity where id =:id");
//       query.setParameter("id",id);
//       query.executeUpdate();
//
//       transaction.commit();
//       session.close();
//       factory.close();
//   }
}
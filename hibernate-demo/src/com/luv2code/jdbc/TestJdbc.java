package com.luv2code.jdbc;

import com.luv2code.jdbc.entity.Instructor;
import com.luv2code.jdbc.entity.InstructorDetail;
import com.luv2code.jdbc.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.List;

public class TestJdbc {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
//            Student student = new Student();
//            student.setFirstName("Pragadeesh");
//            student.setLastName("Chandrasekaran");
//            student.setEmail("pragadeesh@gamil.com");
//            session.beginTransaction();
//            session.save(student);
//            List<Student> studentList = session.createQuery("from Student").getResultList();
//
//            for (Student student : studentList){
//                System.out.println(student.getFirstName());
//                System.out.println(student.getLastName());
//                System.out.println(student.getEmail());
//
//            }
//            Student student = session.get(Student.class,1);
//            student.setLastName("Chandra");
//            student.setDateOfbirth(DateUtils.parseDate("31/12/1998"));
//            session.createQuery("update Student set email='dfssdfdfs@wd.com'").executeUpdate();

//            session.delete(student);

//            System.out.println(student.getFirstName());
//            System.out.println(student.getLastName());
//            System.out.println(student.getEmail());

//            session.getTransaction().commit();

            Instructor instructor = new Instructor();
            instructor.setFirst_name("Pragadeesh");
            instructor.setLast_name("Chandrasekaran");
            instructor.setEmail("pragadeesh654@gmail.com");

            InstructorDetail insDetail = new InstructorDetail();
            insDetail.setHobby("reading books");
            insDetail.setYoutube_channel("dsdsadasdasdsdasdasda");

            instructor.setInstructordetail(insDetail);

            session.beginTransaction();

            session.save(instructor);

            session.getTransaction().commit();



        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            factory.close();
        }
    }
}

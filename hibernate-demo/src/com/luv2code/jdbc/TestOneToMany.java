package com.luv2code.jdbc;

import com.luv2code.jdbc.entity.Course;
import com.luv2code.jdbc.entity.Instructor;
import com.luv2code.jdbc.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToMany {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();

//            Instructor testInstructor = new Instructor();
//            testInstructor.setFirst_name("Pragadeesh");
//            testInstructor.setLast_name("Chandrasekaran");
//            testInstructor.setEmail("pragadeesh@gmail.com");
            Instructor testInstructor = session.get(Instructor.class, 2);

            Course testCourse = session.get(Course.class, 1);

            testInstructor.setInstructordetail(new InstructorDetail() {{
                setYoutube_channel("jddsjjksd");
                setHobby("hskdjhksdjfhdfksjsdfk");
            }});

            Course tempCourse = new Course();
            tempCourse.setTitle("Mathematics");

            Course tempCourse2 = new Course();
            tempCourse2.setTitle("Computer Science");


            testInstructor.addCourse(tempCourse);
            testInstructor.addCourse(tempCourse2);

            session.save(tempCourse);
            session.save(tempCourse2);
//            session.save(testInstructor);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            factory.close();
        }
    }
}

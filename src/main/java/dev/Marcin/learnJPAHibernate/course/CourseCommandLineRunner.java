package dev.Marcin.learnJPAHibernate.course;

import dev.Marcin.learnJPAHibernate.course.Course;
import dev.Marcin.learnJPAHibernate.course.Jpa.CourseJpaRepository;
import dev.Marcin.learnJPAHibernate.course.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;
    @Autowired
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn DataBase JPA", "dev.Marcin"));
        repository.insert(new Course(2,"Learn Java JPA frame", "dev.Marcin"));
        repository.insert(new Course(3,"Learn Java vol 5 ", "dev.Marcin"));
        repository.insert(new Course(4,"Learn Java vol 6 ", "dev.Marcin"));
        repository.insert(new Course(15,"Learn Java vol 7", "dev.Marcin"));


        System.out.println(repository.findById(3));
        System.out.println(repository.findById(2));

    }
}

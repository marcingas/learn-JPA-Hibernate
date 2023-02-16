package dev.Marcin.learnJPAHibernate.course.jdbc;

import dev.Marcin.learnJPAHibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn DataBase", "dev.Marcin"));
        repository.insert(new Course(2,"Learn Java", "dev.Marcin"));
        repository.insert(new Course(3,"Learn Java vol 2 ", "dev.Marcin"));
        repository.insert(new Course(4,"Learn Java vol 3 ", "dev.Marcin"));
        repository.insert(new Course(5,"Learn Java vol 4", "dev.Marcin"));


        System.out.println(repository.findById(3));
        System.out.println(repository.findById(2));

    }
}

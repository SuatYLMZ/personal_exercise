package com.suatylmz.personalexercise.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Suat",
                        "YILMAZ",
                        LocalDate.now(),
                        "suatdev@gmail.com",
                        34),
                new Student(
                        "Student2",
                        "ASLAN",
                        LocalDate.now(),
                        "suatdev@gmail.com",
                        28
                )
        );
    }
}

package util;

import data.People;
import data.Student;
import data.Teacher;
import java.io.*;
import java.util.*;

public class ReadFromTxt {
    public static Set<People> readStudentsList(String fileName) {
        Set<People> studentsList = new HashSet<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = bufferedReader.readLine();
            while (line != null) {
                List<String> studentData = Arrays.stream((line.split(", "))).toList();
                People student = new Student(studentData.get(0), studentData.get(1), Integer.parseInt(studentData.get(2)),
                        studentData.get(3), studentData.get(4));
                studentsList.add(student);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentsList;
    }

    public static People readTeacher(String fileName) {
        People teacher = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = bufferedReader.readLine();
            while (line != null) {
                List<String> teacherData = Arrays.stream((line.split(", "))).toList();
                teacher = new Teacher(teacherData.get(0), teacherData.get(1), Integer.parseInt(teacherData.get(2)),
                        teacherData.get(3), teacherData.get(4));
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teacher;
    }
}

package service;

import data.People;
import java.util.Set;

public interface EducationGroup {

    Set<People> readStudentList(String fileName);
    People readTeacher(String fileName);
}

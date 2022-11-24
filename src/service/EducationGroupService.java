package service;

import data.People;
import util.ReadFromTxt;
import java.util.Set;

public class EducationGroupService implements EducationGroup {

    @Override
    public Set<People> readStudentList(String fileName) {
        return ReadFromTxt.readStudentsList(fileName);
    }

    @Override
    public People readTeacher(String fileName) {
        return ReadFromTxt.readTeacher(fileName);
    }
}

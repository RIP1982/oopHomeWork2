import service.EducationGroupService;
import service.EducationGroup;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        EducationGroup educationGroup1 = new EducationGroupService();
        EducationGroup educationGroup2 = new EducationGroupService();
        logger.info(String.valueOf(educationGroup1.readTeacher("teacher.txt")));
        logger.info(String.valueOf(educationGroup2.readStudentList("students.txt")));
    }
}
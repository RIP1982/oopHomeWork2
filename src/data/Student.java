package data;

public class Student extends People{
    private String faculty;
    private String group;

    public Student(String name, String gender, int age, String faculty, String group) {
        super.setName(name);
        super.setGender(gender);
        super.setAge(age);
        this.faculty = faculty;
        this.group = group;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", age=" + getAge() +
                ", faculty='" + faculty + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}

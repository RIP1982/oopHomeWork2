package data;

public class Teacher extends People{
    private String degree;
    private String discipline;

    public Teacher(String name, String gender, int age, String degree, String discipline) {
        super.setName(name);
        super.setGender(gender);
        super.setAge(age);
        this.degree = degree;
        this.discipline = discipline;
    }

    public String getDegree() {
        return this.degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDiscipline() {
        return this.discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", age=" + getAge() +
                ", degree='" + degree + '\'' +
                ", discipline='" + discipline + '\'' +
                '}';
    }
}

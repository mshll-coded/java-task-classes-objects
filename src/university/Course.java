package university;

public class Course {

    private String name;
    private String instructor;
    private int studentCount;

    public Course(String name, String instructor, int studentCount) {
        this.name = name;
        this.instructor = instructor;
        this.studentCount = studentCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "university.Course{" +
                "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", studentCount=" + studentCount +
                '}';
    }
}

package arrayStudents;

import lombok.ToString;

@ToString
public class Student {
    private  int studentId;
    private String name;
    private String  garde;

    public Student(int studentId, String name, String garde) {
        this.studentId = studentId;
        this.name = name;
        this.garde = garde;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGarde() {
        return garde;
    }

    public void setGarde(String garde) {
        this.garde = garde;
    }
}

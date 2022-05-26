package AulaAbstracao;

import java.util.ArrayList;

public class VirtualCourse extends DigitalProduct implements ICourse {
    private String school;
    private boolean isLoggedIn;
    private String[] teachers;
    private ArrayList<String> students;
    private ArrayList<String> attendances;

    @Override
    public String getPublisherInfo() {
        return school;
    }

    @Override
    public boolean getProductIsValid() {
        return isLoggedIn;
    }

    @Override
    public String getTeacher() {
        String teachersString = "";

        for (String teacher: teachers) {
            teachersString += teacher + ", ";
        }

        return teachersString;
    }

    @Override
    public String listStudents() {
        String studentList = "";

        for (String student: students) {
            studentList += student + ", ";
        }

        return studentList;
    }

    @Override
    public String getAttendances() {
        String attendancesList = "";

        for (String student: attendances) {
            attendancesList += student + ", ";
        }

        return attendancesList;
    }
}

package AulaAbstracao;

public class LocalCourse extends DigitalProduct implements ICourse{
    private String school;
    private String ownership;
    private String teacher;
    private String[] students;
    private boolean[] attendances;
    public String identification;

    @Override
    public String getPublisherInfo() {
        return school;
    }

    @Override
    public boolean getProductIsValid() {
        return identification.equals(ownership);
    }

    @Override
    public String getTeacher() {
        return teacher;
    }

    @Override
    public String listStudents() {
        String studentsString = "";

        for (String student: students) {
            studentsString += student + ", ";
        }

        return studentsString;
    }

    @Override
    public String getAttendances() {
        String attendancesString = "";

        for (int i = 0; i < attendances.length; i++) {
            if (attendances[i]) {
                attendancesString += students[i] + ", ";
            }
        }

        return attendancesString;
    }
}

package studentinfo;

import java.util.*;

class CourseSession {
    private String department;
    private String number;
    private ArrayList<Student> students =
            new java.util.ArrayList<Student>();
    private Date startDate;

    CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    String getDepartment() {
        return department;
    }

    String getNumber() {
        return number;
    }

    Date getStartDate() {
        return startDate;
    }

    int getNumberOfStudents() {
        return students.size();
    }

    void enroll(Student student) {
        students.add(student);
    }

    Student get(int index) {
        return students.get(index);
    }

    Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;  //weeks * days per week - 3 days
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

}

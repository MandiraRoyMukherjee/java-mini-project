package Models;
import Enum.*;
public class EducationLoan {
    public String courseName;
    public String collegeName;
    public CourseType courseType;
    public DegreeType degreeType;
    public EducationStream educationStream;
    public double totalFees;

    public EducationLoan(String courseName, String collegeName,
                         CourseType courseType,DegreeType degreeType,
                         EducationStream educationStream, double totalFees) {
        this.courseName = courseName;
        this.collegeName = collegeName;
        this.courseType = courseType;
        this.degreeType = degreeType;
        this.educationStream = educationStream;
        this.totalFees = totalFees;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public DegreeType getDegreeType() {
        return degreeType;
    }

    public EducationStream getEducationStream() {
        return educationStream;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public void setDegreeType(DegreeType degreeType) {
        this.degreeType = degreeType;
    }

    public void setEducationStream(EducationStream educationStream) {
        this.educationStream = educationStream;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }
}

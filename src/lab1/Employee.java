package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private int cubeId;
    
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getCubeId() {
        return cubeId;
    }
    public void setCubeId(int cubeId){
        this.cubeId = cubeId;
    }
    
    public abstract String getStatus();

    // Assume this is must be performed second
    public abstract void meetDepartmentStaff();

    // Assume this must be performed first
    public abstract void meetWithHrForBenefitAndSalryInfo();

    // Assume this must be performed 4th
    public abstract void moveIntoCubicle(int cubeId);

    // Assume this must be performed third
    public abstract void reviewDeptPolicies();
    
    public String hireEmployee() {
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(5);
        return getStatus();
    }
}
    
   
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
    

    public Employee() {

    }

    // Assume this must be performed first
    public abstract void meetWithHrForBenefitAndSalryInfo();

    // Assume this is must be performed second
    public abstract void meetDepartmentStaff();

    // Assume this must be performed third
    public abstract void reviewDeptPolicies();

    // Assume this must be performed 4th
    public abstract void moveIntoCubicle(String cubeId);

    public abstract String getStatus();

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

    public String getCubeId() {
        return cubeId;
    }
    
    
    
}

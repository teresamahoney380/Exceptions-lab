package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;
    private final String PARAM_ERR = "Field cannot be null or zero length";

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
       setFirstName(firstName);
       setLastName(lastName);
       setSsn(ssn);
        setHireDate(hireDate);
        setDaysVacation(daysVacation);
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public final void setDaysVacation(int daysVacation) {
        if(daysVacation<=0||daysVacation>28){
        throw new IllegalArgumentException(PARAM_ERR);    
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        if(firstName == null || firstName.length() == 0) {
            throw new IllegalArgumentException(PARAM_ERR);
        }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public final void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public  final void setLastName(String lastName) {
        if(lastName == null || lastName.length() == 0) {
            throw new IllegalArgumentException(PARAM_ERR);
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        if(ssn == null || ssn.length() == 0) {
            throw new IllegalArgumentException(PARAM_ERR);
        }
        this.ssn = ssn;
    }
    
    
}


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    public String firstName = "";
    public String middleName = "";
    public String lastName = "";
    public int stuNumber = 0;
    public double gpa = 0.0;
    //getters
    public String getFullName(){
        String fullName = lastName + ", " + firstName + " " + middleName; 
        return fullName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getGpa(){
        return gpa;
    }
    public int getStuNumber(){
        return stuNumber;
    }
    //setters
    public void setFirstName(String str){
        firstName = str;
    }
    public void setMiddleName(String str){
        middleName = str;
    }
    public void setLastName(String str){
        lastName = str;
    }
    public void setGpa(double num){
        gpa = num;
    }
    public void setStuNumber(int num){
        stuNumber = num;
    }
}

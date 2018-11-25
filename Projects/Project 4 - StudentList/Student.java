import java.util.*;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    private String fullName = "";
    private int stuNumber = 0;
    private double gpa = 0.0;
    //constructor
    public Student(String str, int num, double dub){
        fullName = str;
        parseName(fullName);
        setStuNumber(num);
        setGpa(dub);
        
    }
    //getters
    public void parseName(String str){
        //parse fullName and load first, middle, and last names
        //Last, First Middle
        //Last, First
        //First Middle Last
        String fullName = lastName + ", " + firstName + " " + middleName; 
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

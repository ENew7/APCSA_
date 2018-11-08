import java.util.*;
/**
 * 
 */
public class StudentListRunner
{
    public static Scanner scr = new Scanner(System.in);
    public static void main(){
        int userChoice = 0;
        StudentList studListObj = new StudentList();
        userChoice = createMainMenu();
        if(userChoice == 1){
            //System.out.println("The user chose add student");
            // get info to add a student
            createStudent();
        }
        //studListObj.addStudent("Bob");
    }
    
    public static int createMainMenu(){
        int response = -1;
        System.out.println("choose a menu item");
        System.out.println("1: Add Student");
        response = scr.nextInt();
        return response;
    }
    
    public static Student createStudent(){
        Student s = new Student();
        System.out.print("Enter Student name:");
        String stuName = scr.nextLine();
        System.out.print("Enter id Number name:");
        String stuName = scr.nextInt();
        System.out.print("Enter GPA:");
        String stuName = scr.nextInt();
        
        
    }
}

import java.util.*;
/**
 * 
 */
public class StudentListRunner
{
    public static Scanner scr = new Scanner(System.in);
    public static StudentList studListObj = new StudentList();
    public static void main(){
        while(true){
            int userChoice = 0;
            
            userChoice = createMainMenu();
            if(userChoice == 1){
                System.out.println("The user chose add student");
                // get info to add a student
                createStudent();
                
            }
            if(userChoice == 2){
                System.out.println("The user chose delete student");
                
                // deletes a student
                
            }
            if(userChoice == 3){
                System.out.println("The user chose print student");
                // deletes a student
                
            }
            if(userChoice == 4){
                System.out.println("The user chose search");
                // deletes a student
                
            }
            if(userChoice == 5){
                System.out.println("The user chose clear students");
                // deletes a student
                
            } 
            //studListObj.addStudent("Bob");
        }
    }

    public static int createMainMenu(){
        int response = -1;
        System.out.println("Choose a Menu Item");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Print Student");
        System.out.println("4: Search for Student");
        System.out.println("5: Clear Students");
        response = scr.nextInt();
        String buffer = scr.nextLine();
        return response;
    }

    public static void createStudent(){
        String stuName = "";
        System.out.println("Enter Student name:");
        stuName = scr.nextLine();
        System.out.println("Enter id Number:");
        int stuNum = scr.nextInt();
        String buffer = scr.nextLine();
        System.out.println("Enter GPA:");
        double stuGpa = scr.nextDouble();
        buffer = scr.nextLine();
        studListObj.addStudent(stuName, stuNum, stuGpa);
    }
    public static void deleteStudent(){
        int x = scr.nextInt();
        for(int i=0; i < studListObj.students.size(); i++){
            if(x==studListObj.getStuNumber()){
            }// 798759@seq.org
        }
    }
}

import java.util.*;
/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentList
{
   ArrayList<Student> students = new ArrayList<Student>();
   
   public void addStudent(String str){
       System.out.print(str);
       Student s = new Student(str);
       
       
       students.add(s);
   }
   //deleteStudent()
   //editStudentList()
   //clearList() 
   //printList()
   //printStudent()
}
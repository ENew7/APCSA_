import java.util.*;
/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentList
{
   public ArrayList<Student> students = new ArrayList<Student>();
   
   public void addStudent(String str, int num, double dub){
       System.out.print(str);
       Student s = new Student(str, num, dub);

       students.add(s);
   }
   public void deleteStudent(){
    
   }
   //editStudentList()
   //clearList() 
   //printList()
   //printStudent()
}

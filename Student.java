import javax.swing.JOptionPane;
import java.util.*;

public class Student 
{

    public static void main(String[] args) 
   {

        LinkedList roster = new LinkedList();

        for(int i=0; i<2; i++){
           Student stu = new Student();
           stu.id = i;
           stu.populateName(JOptionPane.showInputDialog("Please enter a first name"), JOptionPane.showInputDialog("Please enter a last name"));
           roster.add(stu);


    }
        Iterator<Student> it=roster.iterator();
            while (it.hasNext()) 
           {
            Student st=it.next();
            JOptionPane.showMessageDialog(null, st.firstName + " " + st.lastName);
            }


     } 
}
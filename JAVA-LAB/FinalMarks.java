import CIE.*;

import SEE.External; 
import java.util.*;

public class FinalMarks {
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of students:");
       int n=sc.nextInt();
       External[] students=new External[n];
       Internals[] internals=new Internals[n];
       for(int i=0;i<n;i++){
           System.out.println("Enter the details of student "+(i+1)+":");
           System.out.println("USN:");
           String usn=sc.next();
           System.out.println("Name:");
           String name=sc.next();
           System.out.println("Semester:");
           int sem=sc.nextInt();
           students[i]=new External(usn,name,sem);
           internals[i]=new Internals();
           System.out.println("Enter the internal marks of 5 subjects:");
           int[] imarks=new int[5];
           for(int j=0;j<5;j++){
               imarks[j]=sc.nextInt();
           }
           internals[i].setMarks(imarks);
           System.out.println("Enter the SEE marks of 5 subjects:");
           int[] emarks=new int[5];
           for(int j=0;j<5;j++){
               emarks[j]=sc.nextInt();
           }
           students[i].setMarks(emarks);
       }
       System.out.println("\nFinal Marks of Students:");
       for(int i=0;i<n;i++){
          System.out.println("\nStudent:"+ students[i].name+" USN:"+students[i].usn);
          System.out.println("Semester: "+ students[i].sem);
          System.out.println("course-wise final marks:");
          for(int j=0;j<5;j++){
            double finalMark= internals[i].internalMArks[j]+(students[i].seeMarks[j]/2.0);
            System.out.println("Subject"+(j+1)+":"+ finalMark);
              
          }

        }
        sc.close();
    }
}
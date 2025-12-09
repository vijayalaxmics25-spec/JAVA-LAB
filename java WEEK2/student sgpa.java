import java.util.*;
public class Student{
    public static int credits(int score){
        int points;
        if(score>=90){
            points=10;  
        }else if(score>=80){
            points=9;
        }else if(score>=70){
            points=8;
        }else if(score>=60){
            points=7;
        }else if(score>=50){
            points=6;
        }else if(score>=40){
            points=5;
        }else{
            points=0;
        }
        return points;
    }
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        int credSum=0;
        int pointSum=0;
        float SGPA;
        System.out.println("Enter the name and USN of the student: ");
        String name=sc.nextLine();
        String USN=sc.nextLine();
        System.out.println("Enter the number of subjects: ");
        int a=sc.nextInt();
        int cred[]=new int[a+1];
        int marks[]=new int[a+1];
        for(int i=1;i<a+1;i++){
            System.out.println("enter sub"+" "+i+" "+"credits:");
            cred[i]=sc.nextInt();
            credSum+=cred[i];
            System.out.println("Enter marks obtained:");
            marks[i]=sc.nextInt();
            pointSum+=credits(marks[i])*cred[i];
        }
        SGPA=pointSum/credSum;
        System.out.println("SGPA="+SGPA);
    }
}
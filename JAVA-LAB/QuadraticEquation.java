import java.util.*;
public class QuadraticEquation{
public static void main(String s[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the co-efficient of a:\n");
double a=sc.nextDouble();
System.out.println("enter the co-efficient of b:\n");
double b=sc.nextDouble();
System.out.println("enter the co-efficient of c:\n");
double c=sc.nextDouble();

sc.close();

double d=b*b-4*a*c;


if(d>0){double root1=(-b+Math.sqrt(d))/(2*a);
double root2=(-b-Math.sqrt(d))/(2*a);
System.out.println("The roots are real and distinct\n");
System.out.println("Root1="+root1);
System.out.println("Root2="+root2);
}else if(d==0){
double root1=-b/(2*a);
double root2=root1;
System.out.println("The root are  equal and real\n");
System.out.println("Root1="+root1);
System.out.println("Root2="+root2);
}else{
double realPart=-b/(2*a);
double imaginaryPart=Math.sqrt(-d)/(2*a);
  System.out.println("Complex roots: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
}
}}
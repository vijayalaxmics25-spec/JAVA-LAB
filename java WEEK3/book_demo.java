import java.util.*;

class Book{
    private String name;
    private String author;
    private double price;
    private int num_pages;
    public Book(String name,String author,double price,int num_pages)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setNumPages(int num_pages){
        this.num_pages=num_pages;
    }


    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getNumPages(){
        return num_pages;
    }
    public String toString(){
        return "Book[name="+name+", author="+author+", price="+price+", num_pages="+num_pages+"]";
    }
}
public class BookDemo{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of books:");
       int n=sc.nextInt();
         sc.nextLine();
         Book[] books=new Book[n];
         for(int i=0;i<n;i++){
              System.out.println("Enter details of book "+(i+1)+":");
              System.out.print("Name: ");
              String name=sc.nextLine();
              System.out.print("Author: ");
              String author=sc.nextLine();
              System.out.print("Price: ");
              double price=sc.nextDouble();
              System.out.print("Number of pages: ");
              int num_pages=sc.nextInt();
              sc.nextLine(); 
              books[i]=new Book(name,author,price,num_pages);
    }
    System.out.println("\nDetails of Books:");
    for(Book b:books){
        System.out.println(b.toString());
    }
    sc.close();
}
}
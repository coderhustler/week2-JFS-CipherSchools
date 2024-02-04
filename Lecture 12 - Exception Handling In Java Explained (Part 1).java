package winterpep_github;
//Lecture 12 - Exception Handling In Java Explained (Part 1)
import java.io.File;
import java.util.Scanner;

/*
Exception handling is a process of controlling errors and exceptions in Java. Errors and exceptions are generated when a Java program cannot complete its task, or when a task cannot be completed in an expected way.

Exceptions are those erros which can be handled
On the other hand, Errors can't be handled. For eg-OutOfMemoryException, JVM crashes

Throwable is the BaseClasss for all Exceptions & Errors
 */
public class lecture12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How old r u?");
        int age=sc.nextInt();
//        iam19 -> InputMismatchException -> Unchecked Exception = Exceptions
//        that can't be handled at compile time/during execution (Obviously we will provide the input only when it asks us to & that is during execution)
        System.out.println("age: "+age);

        File f=new File("abc.txt");
//        f.createNewFile(); //  IO Exception -> Checked Exception = Exceptions which are checked at runtime

        lecture12 obj=new lecture12();
        obj.calculate();

    }
    int n1,n2,result;
    Scanner sc=new Scanner(System.in);
    void calculate(){
        try { // try contains code that we think may generate/throw Error at Runtime(exception)
            System.out.println("Enter the numbers");
            n1=sc.nextInt();
            n2=sc.nextInt();
            System.out.println(n1/n2);

        }catch (Exception e){ // catch block excutes only if exception occurs
            System.out.println("An excpetion occured");
        }
    }
}

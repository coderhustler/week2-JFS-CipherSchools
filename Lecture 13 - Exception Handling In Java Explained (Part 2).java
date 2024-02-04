package winterpep_github;
//Lecture 13 - Exception Handling In Java Explained (Part 2)

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Exception handling is a process of controlling errors and exceptions in Java. Errors and exceptions are generated when a Java program cannot complete its task, or when a task cannot be completed in an expected way.

Exceptions are those errors which can be handled
On the other hand, Errors can't be handled. For eg-OutOfMemoryException, JVM crashes

Throwable is the BaseClasss for all Exceptions & Errors
 */
public class lecture12 {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        System.out.println("How old r u?");
        int age=sc.nextInt();
//        iam19 -> InputMismatchException -> Unchecked Exception = Exceptions
//        that can't be handled at compile time/during execution (Obviously we will provide the input only when it asks us to & that is during execution)
        System.out.println("age: "+age);

//        THROWS keyword - if we don't use throws keyword in main method then we have to work on f.createNewFile() exception
        File f=new File("C:\\abc.txt");
        f.createNewFile(); //  IO Exception -> Checked Exception = Exceptions which are checked at runtime
//        throws is an indication thay there is a need of exeption handling here try/catch. Please Do It.

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

//            if (n2==0){
//                // To raise exceptions manually, we use throw keyword
//                throw new ArithmeticException();
//            }
            result=n1/n2;

        }
        catch (ArithmeticException e){
            System.out.println("AE EXception");
        }
        catch (InputMismatchException e){
            System.out.println("AE Exception");
        } catch (Exception e){ // catch block excutes only if exception occurs
            System.out.println("An excpetion occured"+e.getMessage());
            // Use of 'e' keyword in catch is that we are storing details of exception in that word
            e.printStackTrace();
        }
        finally { // executed irrespective of exception caught
            System.out.println("The division result: "+result);
        }

        lecture12 objforgetnextno=new lecture12();
        System.out.println(objforgetnextno.getNextNo(5));
    }
//    This method is to demonstrate usage of FINALLY Block
    int getNextNo(int n){
        try {
            if(n==5){
                return n+1;
            }
        }finally {
            System.out.println("This is important CODE");
        }
        return n-1;
    }
    /*
    Finally is used where you are returning something, but you still want your code to execute
    Flow of program = line no 17(main method) -> otherstatements ->
    56 -> 57 -> 60 -> 61 -> 62 -> 65 -> 66 -> 67 -> 63 -> 57 -> 58 -> exit
    it will go to line no 63 & see that it is a 'return' statement.
    then it will check if there is 'finally' block or not. If yes, it will execute finally statements first
    and then it will go to return statement

     */
}

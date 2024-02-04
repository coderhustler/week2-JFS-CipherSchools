package winterpep_github;
// Lecture 11 - Command-Line Arguments, This, Find And Super Keywords

/*
Command Line Arguments
Any input given during the excution is the CLA.
These inputs are recieved in String array in 'args'

Now Why CLA ?
https://www.cipherschools.com/videopage/624c1b658fb34368cd250c4b/12


INTERVIEWER - Can we have different class name and file name in Java?
Yes, we can have.

INTERVIEWER - How can we excute it?
Using the class name that contains 'main method'.
Sir/Madam, The Filename Convention applies only when we save it with public access modifier


class employee {
    public static void main(String[] args) {

//        System.out.println("This is workig successfully!");
//        CREATE, WRITE & RUN IN CMD ONLY - java empployee Hulk Thanos PeterParker
        System.out.println("-> "+ args[0]);
        System.out.println("-> "+ args[1]);

        // Here the parameter for changing the indexes is 'space'

    }
}
 */

/*
public class lecture11 {
    int arg=5;

    lecture11(){
        System.out.println("Default Constructo");
    }

    lecture11(int arg){ // local variable
        this();
        this.arg=arg;
    }

    public static void main(String[] args) {
        int arg=10;
        lecture11 obj=new lecture11(10);
//        obj.myTest(arg);
        System.out.println(obj.arg); // instance variable
    }
}
 */

/*
class App{

    App(){
        System.out.println("Constructor of App");
    }
    App(int num){
        System.out.println(num);
    }
}

public class lecture11 extends App{
    lecture11(){
        super(20);// used to call constructor of base class
        System.out.println("Constructor of Base Class");
    }

    public static void main(String[] args) {
        new lecture11(); // if u call constructor of derived,
        // then Base class constructor is called and after that Derived class constructor is called

        // also u can call parametrized constructor of Base class using super keyword
    }
}
*/

/*
class Father{

    public final String lastName="Oberoi"; // final variables cannot be changed
    public void foodHabit(){
        System.out.println("I like Salty!!!");
    }
}

class Son extends Father{

//    @Override
//    public void foodHabit() {
//        System.out.println("I like Sweet :)");
//    }
}

public class lecture11{
    public static void main(String[] args) {

    }
}
 */


// QUESTION - Write a program to show Multilevel Inheritance for example
// Create a class A,B and C. B should be child of class for A and C should be class of B

class A{

    public void printA(){
        System.out.println("A class's constructor\n");
    }
}
class B extends A{

    public void printB() {
        System.out.println("B class's constructor\n");
    }
}class C extends B{

    public void printC() {
        System.out.println("C class's constructor");
    }
}

public class lecture11 {
    public static void main(String[] args) {

        C objofc=new C();
        objofc.printA();
        objofc.printB();
        objofc.printC();
    }
}

package winterpep_github;
// Lecture 9 - Polymorphism In Java And Exercise

/*
//Polymorphism - an ability of an object to take multiple forms
//static : overloading(function)
//dynamic : overriding(function)

//====== Static Polymorphism ======
//Function Overloading : defining multiple functions with same name but different parameters
//Here, polymorphism can be seen in add function which is existing in multiple forms (using parameters)

//Rules to achieve funcOverloading()
//1. no of parameters must be different
//2. no of parameters are same, but it is valid because type is different
//3. no of parameters are same, and type is also same but it still valid because of its sequence/order of datatype

public class lecture9 {

    void add(int n1,int n2){
        System.out.println(n1+n2);
    }

    void add(int n1,int n2,int n3){
        System.out.println(n1+n2+n3);
    }

    void add(int n1,float n2){
        System.out.println(n1+n2);
    }

    void add(float n1,float n2){
        System.out.println(n1+n2);
    }

    void add(float n1,int n2){
        System.out.println(n1+n2);
    }

    public static void main(String[] args) {
        lecture9 polyobj=new lecture9();
        polyobj.add(12.2f,300f);
    }
}
 */


/*
//====== Dynamic Polymorphism ======
//Function Overriding

abstract class Doctor{
    abstract void treatPatient();
}

class Physician extends Doctor {
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Physician \nI treat using medicine");
    }
}

class Surgeon extends Doctor {
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Surgeon \nI treat using surgery");
    }

}

class Dentist extends Doctor {
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Dentist \nI specialize in BDS");
    }

}

public class lecture9 {
    public static void main(String[] args) {
        System.out.println("Hi! I am Lucy! Receptionist at Max Care");
        System.out.println("Who you are looking for?");
        System.out.println("Press 1.Physician\n2.Surgeon\n3.Dentist");

        int choice=new java.util.Scanner(System.in).nextInt();

        Doctor doc = null; //Since it is an abstract class, so we can't initialize objects, so we have declared it null
        // we have initialized doc in subclasses below using 'new' keyword
        switch (choice){
            case 1:
                doc=new Physician();
                break;
            case 2:
                doc = new Surgeon();
                break;
            case 3:
                doc = new Dentist();
                break;
            default:
                System.out.println("A Oh! Invalid Choice ");
                break;
        }
        
        if(choice<0 || choice>3){
            System.exit(0);
        }else {
            doc.treatPatient();
        }

//        Polymorphism is the ability/implementation of Base class Object
//        ie Doctor class's Object Doc to get intialized/change form using any
//        of the derived class ie Physician/Surgeon/Dentist

    }
}
*/


// QUESTION - 1

class Addition {

    void sum(int n1,int n2){
        System.out.println(n1+n2);
    }
    void sum(int n1,int n2,int n3){
        System.out.println(n1+n2+n3);
    }

    void sum(long n1,long n2){
        System.out.println(n1+n2);
    }

    public static void main(String[] args) {
        Addition methodOverloadingObject = new Addition();
        methodOverloadingObject.sum(5,10);
        methodOverloadingObject.sum(5,10,5);
        methodOverloadingObject.sum(1234567890123456789L, 986543210987654321L);
    }
}

// QUESTION - 2
//Create 3 private variables named Standard, RollNo, and Section. Try to set the values of variables
//and access it using getter and setter. [encapsulation topic].

class Encap{
    private String Standard;
    private int RollNo;
    private char Section;

    // Getter Methods
    public String getStandard(){
        return Standard;
    }
    public int getRollNo(){
        return RollNo;
    }
    public Character getSection(){
        return Section;
    }

    // Setter Methods
    public void setStandard(String only_to_use_here_variable_standard){
        this.Standard=only_to_use_here_variable_standard;
    }public void setRollNo(int only_to_use_here_variable_rollno){
        this.RollNo=only_to_use_here_variable_rollno;
    }public void setSection(char only_to_use_here_variable_section){
        this.Section=only_to_use_here_variable_section;
    }

    // Example of Additional Method
    public String getStudentInfo(){
        return "Standard: "+Standard+", RollNo: "+RollNo+", Section: "+Section;
    }

    public static void main(String[] args) {
        // Creating an instance of Encap class
        Encap encapObject=new Encap();

        // Setting values using setter methods (defined above)
        encapObject.setStandard("12th");
        encapObject.setRollNo(11);
        encapObject.setSection('B');

        // Accessing values using getter methods
        System.out.println("Student Information: \n"+encapObject.getStudentInfo());;
    }
}

//    The Student class has three private variables: standard, rollNo, and section.
//    Getter methods (getStandard(), getRollNo(), and getSection()) are provided to access the values of these private variable
//    Setter methods (setStandard(), setRollNo(), and setSection()) are provided to modify the values of these private variables.

//    The getStudentInfo() method is an additional method to retrieve all student information at once.
//    In the main method, an instance of the Student class is created, and values are set and accessed using the setter and getter methods, respectively.

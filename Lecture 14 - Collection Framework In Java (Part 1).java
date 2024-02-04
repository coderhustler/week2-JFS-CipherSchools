package winterpep_github;
// Lecture 14 - Collection Framework In Java (Part 1)

import java.util.ArrayList;
import java.util.List;

/*
Collection Framework - Definition, Usage, Hierarchy
1. ArrayList - Dynamic, Strongly Typed (homo (strongly typed) or hetro (loosly typed) data types), Versatile than arrays

 */
public class lecture14 {
    public static void main(String[] args) {

        // NON GENERIC VERSION of ArrayList
         ArrayList cart0=new ArrayList();
         List cart1=new ArrayList();

         cart0.add("Apple");
         cart0.add(100);
         cart0.add('c');

//         GENERIC VERSION of ArrayList
// Generic makes data type-safe ie Strongly-typed, we can only add integers here
// Also typecasting is avoided here, In Industry developers avoid typecasting as it adds to complexity
        ArrayList<String> states=new ArrayList<String>();
        states.add("UP");
        states.add("HP");
        states.add("AP");
        states.add("MP");
        System.out.println("ArrayList is: "+states);

        String s=states.get(2);
        System.out.println(s);

        System.out.println("ArrayList size: "+states.size());

        for (int i=0;i<states.size();i++){
            System.out.println(states.get(i));
        }

        // UPDATE using .set() Method
        states.set(2,"UK");
        System.out.println("After Updation: "+states);
        
    }
}

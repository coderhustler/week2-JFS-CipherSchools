package winterpep_github;
// Lecture 15 - Collection Framework In Java (Part 2)
/*
Vector vs AL : Vector is synchronized whereas AL is not
Synchronized -> Threads accessing something at same time
If Thread1 adds something to AL and if Thread2 removes that, so Thread1 is not able to get values

In vectors -> if Thread1 is adding something to Vector, a lock is assigned to Vector
Thread2 will get an exception that yuo cannot remove until lock is removed
Once done, Thread1 removes lock and is acquired by Thread2. Now Thread2 can remove elements.
Example - ATM Transactions
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class lecture15_vector {
    public static void main(String[] args) {
        Vector vec=new Vector();
        vec.add("texas");
        vec.add("zurich");
        vec.add("newyork");

        Iterator pointer=vec.iterator();
        while (pointer.hasNext()) // hasNext returns true if there is a next element
            System.out.println(pointer.next()); // it updates to next element
        // Iterator is another convenient method of accessing elements

//        QUESTION -

        ArrayList<Product> cart=new ArrayList<Product>();
        Product p=new Product();

        Product q=new Product();
        q.Product_Name="Iron Man";
        q.Product_Price=50;
        cart.add(q);

        p.Product_Name="Spider Man";
        p.Product_Price=15;
        cart.add(p);

        for(int i=0;i<cart.size();i++){
            System.out.println(cart.get(i).toString());

        }
        int totalPrice = 0;
        for(Product product : cart) {
            totalPrice += product.Product_Price;
        }

        System.out.println("TOTAL BILL: $" + totalPrice);

    }
}

class Product{
    String Product_Name;
    int Product_Price;

    @Override
    public String toString() {
        return "Product Name: " + Product_Name + ", Price: $" + Product_Price;
    }

}

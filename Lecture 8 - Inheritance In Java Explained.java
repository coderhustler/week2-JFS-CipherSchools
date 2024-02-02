package winterpep_github;
// Lecture 8 - Inheritance In Java Explained

/*
Benefits of Inheritance
1. Memory Usuage Optimization
2. Code Reusablity
 */

class Furniture {
    int width;
    int height;

    void getDetails(String item){
        System.out.println(item + " Width: "+width+" Height: "+height);
    }

    public static void main(String[] args) {
        Chair neelKamal=new Chair();
        neelKamal.foo();
    }
}

class Table extends Furniture{
    void foo(){
        width=10; height=20; getDetails("Table");
    }
}
class Chair extends Furniture{
    void foo() {
        width = 50;
        height = 30;
        getDetails("Chair");
    }
}
class Almirah extends Furniture{
    void foo() {
        width = 50;
        height = 30;
        getDetails("Almmira");
    }
}

/* -- complexity : Memory Occupied = n*8 bytes here n is count of classes
so here there are only 3 classes, memory occupied is 24 bytes

Therefore, Memory Occupancy is positively co-related with number of classes
So this increases memory occupancy ie jyada memory kharch ho rhi hai store karne ke liye
 */

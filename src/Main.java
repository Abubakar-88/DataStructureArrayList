import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Data Structure
       // Topic is ArrayList

        ArrayList<String> list  = new ArrayList<>();
        //adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        System.out.println("Element at index 1: " + list.get(1));

        // Iterating over the ArrayList using for-each method
        System.out.println(" Elements in the ArrayList:");
        for(String fruit : list){
            System.out.println(fruit);
        }

    list.remove("Banana");
//        System.out.println(" After remove Elements in the ArrayList:");
//        for(String fruit : list){
//            System.out.println(fruit);
//        }

// Checking if an element is present
        if(list.contains("Banana")){
            System.out.println("Banana is in the list");
        } else {
            System.out.println("Banana is not in the list");
        }
        list.add("JackFruit222");
        list.add("Pineapple222");
    System.out.println("Size of ArrayList: "+ list.size());

     // clearing the ArrayList
     list.clear();

     // Checking if the ArrayLiat in empty
        if(list.isEmpty()){
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }




    }
}
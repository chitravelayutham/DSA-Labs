// Java program to demonstrate working of HashTable 

import java.util.*;

class HashTable {
    public static void main(String args[]) {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

        ht.put(123, 432);
        ht.put(12, 2345);
        ht.put(15, 5643);
        ht.put(3, 321);

        ht.remove(12);

        System.out.println(ht);
    }
}
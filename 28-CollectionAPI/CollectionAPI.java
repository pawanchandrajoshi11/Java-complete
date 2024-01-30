// Collection API - API (a concept)
// Collection - interface
// Collections - class

// Collection -> ArrayList etc

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.naming.event.NamingEvent;

import java.util.Iterator;

public class CollectionAPI {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>(); // list supports working with index
        Set<Integer> st = new HashSet<Integer>(); // this will accept only unique values, not in sorted order

        Collection<Integer> sortedSet = new TreeSet<Integer>(); // this is a sorted set, we can always use Collection
                                                                // since it's a parent class of List, Set, etc.

        // MAP is a collection of key-value pairs

        nums.add(2);
        nums.add(5);
        nums.add(8);
        nums.add(10);

        // another way of looping around in a collection
        Iterator<Integer> value = nums.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        Map<String, Integer> mp = new HashMap<>(); // this is a map, stores key-value pairs
        // keys cannot be repeated, keys are unique, values can be repeated.

        mp.put("Pawan", 200);
        mp.put("Naveen", 201);

        System.out.println(mp); // {Naveen=201, Pawan=200}

        mp.put("Pawan", 201); // this will update key = "Pawan"

        System.out.println(mp); // {Naveen=201, Pawan=201}

        // for printing a HashMap
        for (String key : mp.keySet()) {
            System.out.println(key + " : " + mp.get(key));
        }
        // Naveen : 201
        // Pawan : 201

        Map<String, Integer> mpp = new Hashtable<>(); // both hashmap and hashtable works almost same, but hashtable is
                                                      // synchronized hence thread safe

        // for general printing stuff
        for (Object n : nums) {
            System.out.println(n);
        }
    }
}

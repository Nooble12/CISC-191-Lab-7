package edu.sdccd.cisc191.HashSetClasses;

import java.util.HashSet;

public class HashSetConsumer
{
    HashSet<String> hashSet;
    public HashSetConsumer(HashSet<String> inHashSet)
    {
        hashSet = inHashSet;
    }

    // Method to remove a string from the HashSet and returns if it's successful or not.
    public boolean consume(String inString)
    {
        boolean removed = hashSet.remove(inString);
        return removed;
    }
}

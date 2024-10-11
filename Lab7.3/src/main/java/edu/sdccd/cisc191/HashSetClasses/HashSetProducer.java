package edu.sdccd.cisc191.HashSetClasses;

import java.util.HashSet;

public class HashSetProducer
{
    HashSet<String> hashSet;
    public HashSetProducer(HashSet<String> inHashSet)
    {
        hashSet = inHashSet;
    }

    //Checks if string is already in the HashSet. true if the string was successfully added.
    public boolean produce(String inString)
    {
        boolean added = hashSet.add(inString);
        return added;
    }
}

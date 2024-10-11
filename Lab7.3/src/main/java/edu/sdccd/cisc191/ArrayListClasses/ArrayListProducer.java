package edu.sdccd.cisc191.ArrayListClasses;

import java.util.ArrayList;

public class ArrayListProducer
{
    // private ??? list;
    private ArrayList<String> list;

    public ArrayListProducer(ArrayList<String> inList)
    {
        list = inList;
    }

    //Adds an element to the ArrayList at i and shifts.
    public void produce(int i, String string)
    {
        list.add(i, string);
    }
}
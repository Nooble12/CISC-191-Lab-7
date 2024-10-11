package edu.sdccd.cisc191.ArrayListClasses;

import java.util.ArrayList;

public class ArrayListConsumer
{
    // private ??? list;
    private ArrayList<String> list;

    public ArrayListConsumer(ArrayList<String> inList)
    {
        list = inList;
    }

    // Remove and return the first element
    public String consume()
    {
        return list.removeFirst();
    }

}
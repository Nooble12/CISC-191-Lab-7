package edu.sdccd.cisc191.ArrayClasses;

public class ArrayProducer
{
    private String[] stringArray;

    public ArrayProducer(String[] inStringArray)
    {
        stringArray = inStringArray;
    }

    // Shift elements to the right starting from the last element down to index i
    public void produce(int i, String inString)
    {
        for (int j = stringArray.length - 1; j < i; j++)
        {
            stringArray[j] = stringArray[j + 1];
        }
        stringArray[i] = inString;
    }
}


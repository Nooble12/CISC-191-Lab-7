package edu.sdccd.cisc191.ArrayClasses;

public class ArrayConsumer
{
    String[] stringArray;

    public ArrayConsumer(String[] inArray)
    {
        stringArray = inArray;
    }

    //shifts elements to the left and return the first element in the array.
    public String consume()
    {
        String consumedValue = stringArray[0];
        for (int i = 0; i < stringArray.length - 1; i++)
        {
            stringArray[i] = stringArray[i + 1];
        }

        return consumedValue;
    }

}

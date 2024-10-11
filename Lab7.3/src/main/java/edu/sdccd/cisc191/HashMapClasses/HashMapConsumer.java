package edu.sdccd.cisc191.HashMapClasses;

import java.util.HashMap;

public class HashMapConsumer
{
    HashMap<String,String> map;

    public HashMapConsumer(HashMap<String,String> inMap)
    {
        map = inMap;
    }

    public String consume(String inString)
    {
        return map.get(inString);
    }
}

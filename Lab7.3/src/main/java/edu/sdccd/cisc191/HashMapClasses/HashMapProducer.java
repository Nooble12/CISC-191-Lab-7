package edu.sdccd.cisc191.HashMapClasses;

import java.util.HashMap;

public class HashMapProducer
{
    HashMap<String, String> map;

    public HashMapProducer(HashMap<String, String> inMap)
    {
        map = inMap;
    }

    public void produce(String item1, String item2)
    {
        map.put(item1, item2);
    }
}

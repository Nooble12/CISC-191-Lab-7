package edu.sdccd.cisc191;

public class Vehicle
{
    private String manufacturerName;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private Option[] options;

    public Vehicle(String inManufactureName, int inMilesOnVehicle, int inPrice, int inNumberOfSeats, Option[] inOptions)
    {
        manufacturerName = inManufactureName;
        milesOnVehicle = inMilesOnVehicle;
        price = inPrice;
        numberOfSeats = inNumberOfSeats;
        options = inOptions;
    }
    public String getManufacturerName()
    {
        return manufacturerName;
    }

    public int getMilesOnVehicle()
    {
        return milesOnVehicle;
    }

    public int getPrice()
    {
        return price;
    }

    public int getNumberOfSeats()
    {
        return numberOfSeats;
    }

    public Option[] getOptions()
    {
        return options;
    }
}

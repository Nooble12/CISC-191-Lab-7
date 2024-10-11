package edu.sdccd.cisc191;

public class SportsUtilityVehicle extends Vehicle
{
    private int maxTowingLimit;

    public SportsUtilityVehicle(String inManufactureName, int inMilesOnVehicle, int inPrice, int inNumberOfSeats, Option[] inOptions, int inMaxTowingLimit)
    {
        super(inManufactureName, inMilesOnVehicle, inPrice, inNumberOfSeats, inOptions);
        maxTowingLimit = inMaxTowingLimit;
    }

    public int getMaxTowingWeight()
    {
        return maxTowingLimit;
    }
}

package edu.sdccd.cisc191;

public class PickupTruck extends Vehicle
{
    private int cargoCapacity;

    public PickupTruck(String inManufactureName, int inMilesOnVehicle, int inPrice, int inNumberOfSeats, Option[] inOptions,int inCargoCapacity)
    {
        super(inManufactureName, inMilesOnVehicle, inPrice, inNumberOfSeats, inOptions);
        cargoCapacity = inCargoCapacity;
    }

    public int getCargoCapacity()
    {
        return cargoCapacity;
    }
}

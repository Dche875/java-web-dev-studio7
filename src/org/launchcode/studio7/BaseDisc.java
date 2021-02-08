package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {

    // Class Variables
    private String discData;
    private HashMap<String, String> discInfo;


    private final int storageCapacityInMB;
    private final int spinSpeedInRPM;

    // Constructor
    public BaseDisc(int storageCapacity, int spinSpeed) {
        this.discData = "";
        this.discInfo = new HashMap<String, String>();

        // Up until this point the constructor^^ for BaseDisc() has been empty bc we have hard codded everything for
        // CDs and DVDs have different storage capacities, so we don't have anything to hard code these capacities to 'this.storageCapacityInMB' because it could be different.
        // Therefore, if we want to customize the instance of our class, we pass information into the constructor! --> public BaseDisc(int storageCapacity)
        // So now, whoever is creating this disc can pass in any storage capacity that they want for this disc. The same thing is done for spin speed.
        this.storageCapacityInMB = storageCapacity;
        this.spinSpeedInRPM = spinSpeed;

        // HashMap
        this.discInfo.put("Storage Capacity", String.valueOf(storageCapacity)); // storageCapacity is an int, but we need to take in a String as the value. String.valueOf(storageCapacity) converts it to a string
        this.discInfo.put("Spin Speed", String.valueOf(spinSpeed));
    }

    //What if we wanted to allow the user to create a title for this disc and put that into the info. That means we have to overload the constructor
    public BaseDisc(int storageCapacity, int spinSpeed, String title) {
        this(storageCapacity, spinSpeed);
        this.discInfo.put("Title", title);
    }


    // Getters and Setters

    public int getStorageCapacity() { return this.storageCapacityInMB; }
    public int getSpinSpeed() { return this.spinSpeedInRPM; }



    // Methods
    protected void writeData(String data) {
        this.discData += data;
    }

    public String readData() {
        return this.discData;
    }

    public HashMap<String, String> getInfo() {
        return this.discInfo;
    }

}

package org.launchcode.studio7;

public abstract class ComputerDisc extends BaseDisc{
    private boolean isInserted;



    public ComputerDisc(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
        this.isInserted = false;
    }

    public ComputerDisc(int storageCapacity, int spinSpeed, String title) {
        super(storageCapacity, spinSpeed, title);
    }




    public boolean isInserted() { return this.isInserted; }

    public void insert() {
        this.isInserted = true;
    }
}


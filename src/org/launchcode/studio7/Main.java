package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD();
        DVD myDVD = new DVD("My 2021 Jams");

        myCD.spinDisc();
        myDVD.spinDisc();

        myCD.writeData("More data to write");
        System.out.println(myCD.readData());

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}

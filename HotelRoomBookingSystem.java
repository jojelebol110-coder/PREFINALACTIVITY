package PreFinalActivity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Computer Lab 3
 */
public class HotelRoomBookingSystem{
class Room {

    protected String roomNumber;
    protected String roomType;
    protected String guestName;
    protected int numberOfNights;

    public Room(String roomNumber, String roomType,
                String guestName, int numberOfNights) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
    }

    public double calculateBookingCost() {
        return 0;
    }

    public void displayBooking() {
        System.out.println("Room Type: " + roomType);
        System.out.println();
        System.out.println("Room Number: " + roomNumber);
        System.out.println();
        System.out.println("Guest: " + guestName);
        System.out.println();
        System.out.println("Nights: " + numberOfNights);
        System.out.println();
        System.out.printf("Booking Cost: ₱%,.2f%n", calculateBookingCost());
    }
}

class StandardRoom extends Room {

    public StandardRoom(String roomNumber,
                        String guestName,
                        int numberOfNights) {

        super(roomNumber, "Standard",
              guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        return numberOfNights * 1500;
    }
}

class DeluxeRoom extends Room {

    public DeluxeRoom(String roomNumber,
                      String guestName,
                      int numberOfNights) {

        super(roomNumber, "Deluxe",
              guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        return (numberOfNights * 2500)
                + (numberOfNights * 300);
    }
}

class SuiteRoom extends Room {

    public SuiteRoom(String roomNumber,
                     String guestName,
                     int numberOfNights) {

        super(roomNumber, "Suite",
              guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        return (numberOfNights * 4000) + 1000;
    }
}

}
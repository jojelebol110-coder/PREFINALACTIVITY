package PreFinalActivity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Computer Lab 3
 */

public class HotelRoomBookingTest {

    public static void main(String[] args) {

        HotelRoomBookingSystem hotel =
                new HotelRoomBookingSystem();

        HotelRoomBookingSystem.Room standard =
                hotel.new StandardRoom(
                        "101",
                        "Pedro Cruz",
                        3
                );

        HotelRoomBookingSystem.Room deluxe =
                hotel.new DeluxeRoom(
                        "202",
                        "Ana Reyes",
                        2
                );

        HotelRoomBookingSystem.Room suite =
                hotel.new SuiteRoom(
                        "301",
                        "Carlo Santos",
                        2
                );

        System.out.println("===== HOTEL BOOKING =====");
        System.out.println();

        standard.displayBooking();

        System.out.println();

        deluxe.displayBooking();

        System.out.println();

        suite.displayBooking();
    }
}

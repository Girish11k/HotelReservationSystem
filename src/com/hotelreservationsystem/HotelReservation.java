package com.hotelreservationsystem;
import java.util.ArrayList;
import java.util.List;

    class HotelReservationSystem {

        public static List<Hotel> hotelList = new ArrayList<Hotel>();

        public static void addRegularRateAndHotelName(String hotelName, int regularRate) {

            Hotel hotel = new Hotel(hotelName, regularRate);

            hotelList.add(hotel);
        }
    }

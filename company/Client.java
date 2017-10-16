package com.company;

/**
 * Created by constie on 16.10.2017.
 */
public class Client {
    private Flight reservation;

    public Flight makeReservation(String where){
        Flight f = reservation.reserveFlight(where);
//        String w = f.getWhere();
        return f;
    }

}

package com.company;

/**
 * Created by constie on 16.10.2017.
 */
public class Flight {
    private static Flight instance;
    private String where;

    protected Flight(String where){
        this.where = where;
    };

    public static Flight reserveFlight(String where){
        if(instance == null){
            return instance = new Flight(where);
        }
        return instance;
    }

    public String getWhere(){
        return instance.where;
    }
}

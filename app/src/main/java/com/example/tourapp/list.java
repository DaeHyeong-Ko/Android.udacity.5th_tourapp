package com.example.tourapp;

public class list {
    private int msightpicture;
    private String msightname;
    private String msightaddress;
    private String mexplain;

    public list(int sightpicture,String sightname, String sightaddress, String explain) {
        msightpicture=sightpicture;
        msightname=sightname;
        msightaddress=sightaddress;
        mexplain=explain;
    }

    public int getmsightpicture() {
        return msightpicture;
    }

    public String getmsightname() {
        return msightname;
    }

    public String getmsightaddress() {
        return msightaddress;
    }

    public String getmexplain() {
        return mexplain;
    }
}

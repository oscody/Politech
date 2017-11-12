package com.example.oneilbogle.mypoliticianv2;

/**
 * Created by oneilbogle on 11/12/17.
 */

public class PoliticianDAO {

    int UserIcon;
    String myname;
    String myinfo;
    String Mybio;

    String Mytwitter;
    String Myfacebook;

    public PoliticianDAO(int userIcon, String myname, String myinfo, String mybio, String mytwitter, String myfacebook) {
        UserIcon = userIcon;
        this.myname = myname;
        this.myinfo = myinfo;
        Mybio = mybio;
        Mytwitter = mytwitter;
        Myfacebook = myfacebook;
    }
}

package com.example.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

public class User {

    private  String Name;
    private  String Pass;

    Context context;
    SharedPreferences sharedPreferences;
    public User(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("Login_Details",context.MODE_PRIVATE);
    }

    public String getName() {
        Name = sharedPreferences.getString("name","");
        return Name;
    }

    public void setName(String name) {
        Name = name;
        sharedPreferences.edit().putString("name",name).commit();
    }

    public String getPass() {
        Pass = sharedPreferences.getString("pass","");
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
        sharedPreferences.edit().putString("pass",pass).commit();
    }

    public void removeUser(){

        sharedPreferences.edit().clear().commit();
    }

}

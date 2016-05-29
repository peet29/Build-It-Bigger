package com.example.peet29.myapplication.backend;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String joke;

    public String getData() {
        return joke;
    }

    public void setJoke(String data)
    {
        joke = data;
    }
}
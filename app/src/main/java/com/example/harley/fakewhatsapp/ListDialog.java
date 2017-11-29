package com.example.harley.fakewhatsapp;

public class ListDialog {
    private int     imageID;
    private String  title;
    private String  description;
    private boolean btn;
    private Class clas;

    public int getImageID           ()                      {return imageID;}
    public void setImageID          (int imageID)           {this.imageID = imageID;}
    public String getTitle          ()                      {return title;}
    public void setTitle            (String title)          {this.title = title;}
    public String getDescription    ()                      {return description;}
    public void setDescription      (String description)    {this.description = description;}
    public boolean getBtn(){return this.btn;}

    public Class getClas(){ return this.clas;}

    public ListDialog(int imageID, String title, String description) {
        this.imageID = imageID;
        this.title = title;
        this.description = description;
    }

    public ListDialog(int imageID, String title, String description, boolean btn) {
        this.imageID = imageID;
        this.title = title;
        this.description = description;
        this.btn = btn;
    }

    public ListDialog(int imageID, String title, String description, boolean btn, Class activity) {
        this.imageID = imageID;
        this.title = title;
        this.description = description;
        this.btn = btn;
        this.clas = activity;
    }
}

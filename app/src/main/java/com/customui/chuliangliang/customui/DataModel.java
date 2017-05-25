package com.customui.chuliangliang.customui;

/**
 * Created by chuliangliang on 2017/5/24.
 */

public class DataModel {
    private String name;
    private int pid;

    public DataModel(String name, int imgId)
    {
        this.name = name;
        this.pid = imgId;
    }

    public  String getName()
    {
        return this.name;
    }

    public int getPid ()
    {
        return this.pid;
    }


}

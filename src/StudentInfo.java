/**
 * Created by bholar on 7/10/2017.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication2;

import java.io.Serializable;
import java.util.List;

class StudentInfo implements Serializable
{
    //transient data members will not take part in Serialization
    String name;
    transient int rid;
    String address;
    StudentInfo(String n, int r,String address)
    {
        this.name = n;
        this.rid = r;
        this.address=address;

    }

    void printStudentInfo()
    {
        System.out.println("StudentInfo details Test:"+name+" "+rid+" " + address);
    }

    public String toString()
    {
        return "name="+name+", id="+rid+", Address="+address;
    }
}


class StudentInfoArray implements Serializable{
    StudentInfo arr[];

    StudentInfoArray(StudentInfo arr[])
    {
        this.arr = arr;
    }
}

class StudentInfoList implements Serializable{
    List  lst;

    StudentInfoList(List lst)
    {
        this.lst = lst;
    }
}
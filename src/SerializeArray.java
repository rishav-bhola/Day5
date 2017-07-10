/**
 * Created by bholar on 7/10/2017.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeArray
{

    public static void main(String[] args)
    {
        try
        {
//Serialization starts here
            StudentInfo si1 = new StudentInfo("checkingnexttime", 310,"Jammu");

            StudentInfo si2 = new StudentInfo("checkingnexttime1", 311,"Delhi");

            StudentInfo si3 = new StudentInfo("checkingnexttime2", 312,"Hyderabad");

            StudentInfo sarr[] = {si1, si2, si3};

            StudentInfoArray sia = new StudentInfoArray(sarr);

            //.ser is a standard file extension, to store serialized object
            FileOutputStream fos = new FileOutputStream("C:\\TRAINING\\CodeExamples-20170705T104943Z-001\\CodeExamples\\Eclipse_Projects\\Serialization\\Serialization\\src\\javaapplication2\\studentArray.ser");

            //instead of writing object stream to a file, it is also possible to send object thru
            //Network using socket programming
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            System.out.println("Serialing the object...");
            oos.writeObject(sia);
            oos.close();
            fos.close();
        }
        catch (Exception e)
        { e. printStackTrace(); }
    }
}
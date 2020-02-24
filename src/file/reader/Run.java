/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.reader;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.List;
import java.util.*;
import java.io.FileReader;
import java.*;

/**
 *
 * @author usman
 */
public class Run {
public static void main(String[] args) throws IOException{
        FileReader file = new FileReader("words.txt");
        String[] words = new String [100];
        int i=0;
        try {
            Scanner input = new Scanner(file);
            while(input.hasNext())
            {
                words[i] = input.nextLine();
                i++;
            }
            input.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        for(int j=0;j<15;j++){
        String[] arr = words[j].split(";"); 
        System.out.println(arr[0]);
        }
    }
}
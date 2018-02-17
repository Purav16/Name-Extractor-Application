
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author purav
 */
public class Abc {
    
    private static String name_Extraction(String[] words){
        int len = words.length;
        String str = "abc";
        String[] titles = {"Mr", "Mrs", "Miss" , "Sir" , "Dr", "Lady", "Lord","President" , "General" , "Captain" , "Father", "Doctor"};
        switch(len)
        {
            case 1:
                //System.out.println("Last Name: " + words[0]);
            str = "Last Name: " + words[0];
            break;
            
            case 2:
            if (words[0].contains("Mr")){
            str = "Title is: " + words[0] + " Last Name is: " + words[1];
            }
            else {
            str = "First Name is: " + words[0] + " Last Name is: " + words[1];
            }
            break;
            
            case 3:
            if (words[0].contains("Mr")){
            str = "Title is: " + words[0] + "First Name is: " + words[1] + "Last Name is: " + words[2];
            }
            else {
            str = "First is: " + words[0] + "Middle Name is: " + words[1] + "Last Name is: " + words[2];
            
            }
            break;
            case 4:
            if (words[0].contains("Mr")){
            str = "Title is: " + words[0] + "First Name is: " + words[1] + "Middle Name is: " + words[2] + "Last Name is: " + words[3];
            }
            else{
            str = "Title is: "+ "First Name is: " + words[0] + "Middle Name is: " + words[1] + "Last Name is: " + words[2];
   
            }
            break;
            
            case 5:
            if (words[0].contains("Mr") & words[words.length -1].contains("Jr")){
            str = "Title is: " + words[0] + " First Name is: " + words[1] + " Middle Name is: " + words[2] + " Last Name is: " + words[3] + " Suffix is: " + words[4];
            }
            else{
            str = "Title is: " + words[0] + "First Name is: " + words[1] + "Middle Name is: " + words[2] + "Last Name is: " + words[3] + "Suffix is: " + words[4];
   
            }
            break;   
        }
        
        return str;
    }
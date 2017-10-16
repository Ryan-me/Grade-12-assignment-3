/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

import java.util.Scanner;

/**
 *
 * @author messr2578
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */ 
    
    public void swap(String[] array, int p1,int p2){
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    public void StringInsertionSort(String[] words){
        //go through the array
        System.out.println("sorting");
        for(int i =0; i< words.length - 1; i++){
            //store position
            int pos = i;
            //turn the array to individual strings to compare
            System.out.println(i);
            String one = words[i].substring(0, 1);
            System.out.println(one);
            String two = words[i+1].substring(0, 1);
            // compare and swap if nessasary
            System.out.println(one.compareTo(two));
            while(pos >= 0 && one.compareTo(two) >=0){
                one = words[i].substring(0, 1);
                two = words[i+1].substring(0, 1);
                if(one.compareTo(two) <=1){
                // swaping
                swap(words,pos,pos+1);
                pos--;
                }
            }
            
        } 
        
    }
    public static void main(String[] args) {
        // allow useer input
        Scanner in = new Scanner(System.in);
        A3Q5 test = new A3Q5();
        // set the array
        String[] words = {"try","set","ryan","giy","huy"};
        // for user inputs
//        for (int i =0; i< words.length; i++){
//            System.out.println("enter a word");
//                words[i]= in.nextLine();
//        }
        
        // see if it works
        System.out.println("before");
        for (int i =0; i< words.length; i++){
            System.out.println(words[i]);
        }
        
        test.StringInsertionSort(words);
        
        
        System.out.println("after");
        for (int i =0; i< words.length; i++){
            System.out.println(words[i]);
        }
    }
}

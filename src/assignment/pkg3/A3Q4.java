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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public int countingSort(int[] array){
        // make arerays to sort the  original array
        int[] spot = new int[101];
        int[] sorted = new int [100];
        int cont = 0;
        // count how many of each number there is
        for(int i = 0; i <array.length;i++){
            int k = array[i];
            spot[k] = spot[k]+1;
        }
        // input the ammount of each number to the main array
        for(int j = 0; j <spot.length;j++){
            if(spot[j] == 0&& spot[j] < 1){
                
            }else{
                // add all numbers to the final array
               while(spot[j] >= 1){
               sorted[cont] = j;
               cont++;
               spot[j]--;
            }
            }
        }
        // output the array
        for(int f = 0; f <array.length;f++){
        System.out.println(sorted[f]);
        }
        return 1;
    }
    public static void main(String[] args) {
        A3Q4 test = new A3Q4();
        // create the array
        int[] numb = new int[100];
        for(int i = 1; i <numb.length;i++){
            numb[i]= (int)(Math.random()*100);
        }
        // output base array to see if it is sorted
        for(int f = 0; f <numb.length;f++){
        System.out.println(numb[f]);
        }
        // separate the arrays
        System.out.println("after");
        test.countingSort(numb);
    }
}

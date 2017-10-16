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
public class A3Q2 {
    /**
     * @param args the command line arguments
     */ 
    public int smallestMissingNumber(int[] array){
        for(int i = 0; i < array.length;i++){
            if(array[i] != i){
                return i;
            }
        }
        return array.length+1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q2 test = new A3Q2();
        int[] numb = new int[10];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < numb.length;i++){
            System.out.println("input a number for the array");
            int t =  in.nextInt();
            numb[i]= t;
        }
        System.out.println(test.smallestMissingNumber(numb));
    }
}

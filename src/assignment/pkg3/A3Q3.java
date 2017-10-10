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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */ 
    public int countOnes(int[] array, int ones,int count){
        if(count == array.length){
            return ones;
        }
        if(array[count] ==1 ){
            ones = ones+1;
        }
        count++;
        return countOnes(array,ones,count);
    }
    public static void main(String[] args) {
       A3Q3 test = new A3Q3();
        int[] numb = new int[10];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < numb.length;i++){
            System.out.println("input ONES AND ZEROS to count");
            int t =  in.nextInt();
            numb[i]= t;
        }
        System.out.println("there are " + test.countOnes(numb, 0, 0) + " ones");
    }
}

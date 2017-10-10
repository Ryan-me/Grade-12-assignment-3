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
        int[] spot = new int[101];
        for(int i = 0; i <array.length;i++){
               spot[array[i]] = spot[array[i]]+1;
        }
        for(int j = 0; j <array.length;j++){
            
        }
        for(int f = 0; f <array.length;f++){
        System.out.println(array);
        }
        return 0;
    }
    public static void main(String[] args) {
        A3Q4 test = new A3Q4();
        
        int[] numb = new int[101];
        numb[0] = 15;
        for(int j = 1; j <numb.length;j++){
            if(numb[j-1]%10 <=2){
            numb[j] = numb[j-1]/2+1;
           }else{
             numb[j] = numb[j-1]*2+1;
            }
        }
        int idc =test.countingSort(numb);
    }
}

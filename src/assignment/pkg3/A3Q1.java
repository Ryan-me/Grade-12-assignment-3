/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

/**
 *
 * @author messr2578
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
     public void swap(int[] array, int p1,int p2){
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
     public void selectionsort(int[] array){
        //keep track of pos
        for(int position = 0; position < array.length;position++){
            // look for a smaller numb
            for(int i = position+1; i <array.length;i++){
                if(array[i]< array[position]){
                    int stored = i;
                    for(int j = position+1; j <array.length;j++){
                        
                        if(array[stored] > array[j]){
                            stored = j;
                        }
                    }
                    // swap numbers
                    swap(array, stored , position);
                }
            }
        }
    }
    public static void main(String[] args) {
        //testing it out
        A3Q1 test = new A3Q1();
        int[] numb = new int[10];
        for (int i =0; i <numb.length;i++){
            numb[i]= (int)(Math.random()*101);
        }
        System.out.println("before");
        for (int i =0; i <numb.length;i++){
            System.out.println(numb[i]);
        }
        // sort here
        test.selectionsort(numb);
        
        System.out.println("after");
        for (int i =0; i <numb.length;i++){
            System.out.println(numb[i]);
        }
    }
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Andrew_2
 */

public class Sorter {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println("enter numbers 1-50");
        System.out.println("enter a number outside of 1-50 to end the input");
        collectNumbers(numbers);
        selectionSort(numbers);
    }
    public static void collectNumbers(List<Integer> numbers){
        Scanner scanner =new Scanner(System.in);
        int input = scanner.nextInt();
        while(input<=50 && input >= 1){
            numbers.add(input);
            input = scanner.nextInt();
        }
        int counter;
        for(int k = 1; k <= 50; k++){
            System.out.print(k + ": ");
            counter = 0;
            for (Integer x : numbers){
                if (x.equals(k)){
                    counter++;
                }
            }
            System.out.print(counter + "\n");
        }
    }
    /*public static void selectionSort (List<Integer> numbers){
        int i, j, first, temp;  
        for (i=numbers.size()-1;i>0;i--) {
            first = 0;   //initialize to subscript of first element
            for(j = 1; j <= i; j ++){   //locate smallest element between positions 1 and i.
               if(numbers.get(j) < numbers.get(first))         
                 first = j;
            }
            temp = numbers.get(first);   //swap smallest found with element in position i.
            numbers.set(first,i);
            numbers.set(i, temp);
        }
        for (Integer q:numbers){
            System.out.println(numbers.get(q));
        }
    }  */
    public static void selectionSort(List<Integer> numbers){
    int smallestIndex;
    int smallest;
        for (int curIndex = 0; curIndex < numbers.size(); curIndex++) {
            smallest = numbers.get(curIndex);
            smallestIndex = curIndex;
                for (int i = curIndex + 1; i < numbers.size(); i++) {
                    if (smallest > numbers.get(i)) {
                        smallest = numbers.get(i);
                        smallestIndex = i;
                    }
                }
                if (smallestIndex != curIndex){
                    int temp = numbers.get(curIndex);
                    numbers.set(curIndex, numbers.get(smallestIndex));
                    numbers.set(smallestIndex, temp);
                }
        }
        for (int q = 0; q < numbers.size();q++){
            System.out.println(numbers.get(q));
        }
    }
    
}

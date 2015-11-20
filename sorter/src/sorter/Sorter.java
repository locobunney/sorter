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
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter numbers 1-50");
        System.out.println("enter a number outside of 1-50 to end the input");
        collectNumbers(numbers);
        System.out.println("enter 1 if you want selection sort and enter 2 for insertion sort");
        int choice = scanner.nextInt();
        if (choice == 1){
            selectionSort(numbers);
        }
        else if (choice == 2){
            insertionSort(numbers);
        }
        
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
    public static void selectionSort(List<Integer> numbers){
        int smallestindex;
        int smallest;
        for (int currentindex = 0; currentindex < numbers.size(); currentindex++) {
            smallest = numbers.get(currentindex);
            smallestindex = currentindex;
                for (int i = currentindex + 1; i < numbers.size(); i++) {
                    if (smallest > numbers.get(i)) {
                        smallest = numbers.get(i);
                        smallestindex = i;
                    }
                }
                if (smallestindex != currentindex){
                    int temp = numbers.get(currentindex);
                    numbers.set(currentindex, numbers.get(smallestindex));
                    numbers.set(smallestindex, temp);
                }
        }
        System.out.println(numbers);
    }
    public static void insertionSort(List<Integer> numbers){
        int temp;
        for (int ctr = 1; ctr < numbers.size();ctr++){
            for (int y=ctr; y>0 && numbers.get(y) < numbers.get(y-1); y--){
                temp = numbers.get(y-1);
                numbers.set(y-1, numbers.get(y));
                numbers.set(y, temp);
                System.out.println(numbers);
            }
        }
        System.out.println(numbers);
    }
}
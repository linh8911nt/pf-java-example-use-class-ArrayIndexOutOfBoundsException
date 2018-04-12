import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random numberRandom = new Random();
        Integer[] arrayNumber = new Integer[100];
        System.out.println("list element of array: ");
        for (int i = 0; i < 100; i++) {
            arrayNumber[i] = numberRandom.nextInt(100);
            System.out.print(arrayNumber[i] + " ");
        }
        return arrayNumber;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arrayNumber = arrayExample.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter index: ");
        int index = input.nextInt();
        try {
            System.out.println("value of element in index " + index + " is " + arrayNumber[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("index exeeds the limit of array.");
        }
    }
}

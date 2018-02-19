import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SumOfQueueNumbers {

    public static void main(String[] args) {

        Queue<Integer> queueOfNumbers = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        // prompt user to give 10 numbers
        System.out.println("Give 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Type a number: ");
            int number = sc.nextInt();
            queueOfNumbers.offer(number);
        }

        // print sum of all numbers in queue according to following fashion: a+b+c+…+j = sum
        System.out.println("Sum of all numbers in queue according to following fashion: a+b+c+…+j = sum");

        int sumOfQueueNumbers = 0;

        while (queueOfNumbers.peek() != null) {
            int number = queueOfNumbers.poll();
            System.out.printf("%d", number);
            sumOfQueueNumbers += number;
                if (queueOfNumbers.peek() != null) {
                    System.out.print("+");
                } else {
                    System.out.print(" = ");
                }
        }
        System.out.print(sumOfQueueNumbers);
    }
}

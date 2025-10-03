package task2;

import java.util.Arrays;

public class Main {

    public static void print(String text)
    {
        System.out.println(text);
    }


    public static void main(String[] args) {
        print("Testing Bubble Container:");
        Bubble bubble = new Bubble(Arrays.asList(64, 34, 25, 12, 22, 11, 90));

        print("Initial state:");
        print(bubble.toString());

        bubble.sort();

        print("\nAfter sorting:");
        print(bubble.toString());

        print("\n\nTesting Choice Container:");
        Choice choice = new Choice(Arrays.asList(64, 34, 25, 12, 22, 11, 90));

        print("Initial state:");
        print(choice.toString());

        choice.sort();

        print("\nAfter sorting:");
        print(choice.toString());
    }
}

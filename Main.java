import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

    String[] names = new String[15]; 

    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < names.length; i++) { 
      System.out.print("What's your name");// Answer what your name is, so you can get an assigned seat 
      names[i] = scan.next();
    }
    int count = 0;
    while (count < 15) {
      System.out.println(names[count]);
      count++;
    }
  }
}
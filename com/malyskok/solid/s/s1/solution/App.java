package malyskok.solid.s.s1.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App
{
  public static final int THRESHOLD = 5;

  public static void main(String[] args)
  {

    System.out.println("Welcome to the Application!");

    List<Integer> nums = getFiveNumbersFromUser();

    sort(nums);

    printResult(nums);
  }


  private static List<Integer> getFiveNumbersFromUser()
  {
    Scanner scanner = new Scanner(System.in);

    List<Integer> nums = new ArrayList<>();

    System.out.println("Enter 5 valid integers in the range [0, 10]");

    while (nums.size() < THRESHOLD)
    {

      String s = scanner.nextLine();

      if(isValid(s)){
        nums.add(Integer.valueOf(s));
      }
    }

    scanner.close();

    return nums;
  }

  private static boolean isValid(String s)
  {
    try
    {
      Integer.parseInt(s);
    }
    catch (NumberFormatException nfe)
    {
      System.out.println("Invalid! Try again!");
      return false;
    }

    int num = Integer.parseInt(s);

    if (num < 0 || num > 10)
    {
      System.out.println("Invalid range! Try again!");
      return false;
    }
    return true;
  }

  private static void sort(List<Integer> nums)
  {
    Collections.sort(nums);
  }

  private static void printResult(List<Integer> nums)
  {
    for (int num : nums)
    {
      System.out.print(num + " ");
    }
  }
}

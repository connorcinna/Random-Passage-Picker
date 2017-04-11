import java.util.*; 
import java.applet.*;
import java.awt.*;

public class RandomPassagePicker extends Applet
{
  public static void main(String[] args)
  {
    boolean cont = true;
    while (cont == true)
    {
    System.out.println("Answer the following question with \"1\", \"4\", \"5\", \"6\", or \"0\" for a random book.");
    Scanner scan = new Scanner(System.in);
    System.out.println("What book do you want to practice from?");
    int j = scan.nextInt(); 
    if (j == 1)
        {
          System.out.println("Book 1, Chapter " + (int) ((Math.random() * 7) + 1));
        }
    else if (j == 4)
    {
      System.out.println("Book 4, Chapter " + (int) ((Math.random() * 13) + 24));
    }
    else if (j == 5)
    {
      System.out.println("Book 5, Chapter " + (int) ((Math.random() * 13) + 24));
    }
    else if (j == 6)
    {
      System.out.println("Book 6, Chapter " + (int) ((Math.random() * 7) + 13));
    }
    else if (j == 0) 
    {
      int x = (int) ((Math.random() * 6) + 1);
      while (x == 3 || x == 2)
      {
        x = (int) ((Math.random() * 6) + 1);
      } 
      if (x == 1)
      {
        System.out.println("Book 1, Chapter " + (int) ((Math.random() * 7) + 1));
      }
      else if (x == 4)
      {
        System.out.println("Book 4, Chapter " + (int) ((Math.random() * 13) + 24));
      }
      else if (x == 5)
      {
        System.out.println("Book 5, Chapter " + (int) ((Math.random() * 13) + 24));
      }
      else 
      {
        System.out.println("Book 6, Chapter " + (int) ((Math.random() * 7) + 13));
      }
    }
    else System.out.println("Please enter valid input.");
    System.out.println("Do you want to practice another passage? (y/n)");
    String yesorno = scan.next();
    if (yesorno.equals("y"))
      cont = true;
    else if (yesorno.equals("n"))
      cont = false;
    else 
    {
      System.out.println("Please enter valid input.");
      System.out.println("Do you want to practice another passage? (y/n)");
      yesorno = scan.next();
    }
    }
  }
}
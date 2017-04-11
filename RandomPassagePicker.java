import java.util.*; 
import java.applet.*;
import java.awt.*;

public class RandomPassagePicker extends Applet
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    boolean cont = true;
    while (cont == true)
    {
    System.out.println("Do you want to read Caesar or Vergil?(Please enter \"Caesar\" or \"Vergil\")");
    String author = scan.next();
    if (author.equals("Caesar"))
          {
    System.out.println("Answer the following question with \"1\", \"4\", \"5\", \"6\", or \"0\" for a random book.");
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
    }
    else if (author.equals("Vergil"))
               {
      int totalSlides;
      System.out.println("Answer the following question with 1, 2, 4, 6, or 0 for a random book");
      System.out.println("What book do you want to read?");
      int q = scan.nextInt();
      if (q == 1)
      {
        totalSlides = 58;
        int k = 0;
        String[] slides = new String[29];
        for (int i = 0; i < totalSlides; i+=2)
        {
          slides[k] = (Integer.toString(i) + " to " + (Integer.toString(i+2)));
        }
        System.out.println("Book 1, slides " + slides[(int) ((Math.random() * (slides.length)))]); 
      }
      else if (q == 2)
      {
        totalSlides = 25;
        int k = 0;
        String[] slides = new String[13];
        for (int i = 0; i < totalSlides; i+=2)
        {
          slides[k] = (Integer.toString(i) + " to " + (Integer.toString(i+2)));
          k++;
        }
        System.out.println("Book 2, slides " + slides[(int) ((Math.random() * (slides.length)))]);
      }
      else if (q == 4)
      {
        totalSlides = 34;
        int k = 0;
        String[] slides = new String[17];
        for (int i = 0; i < totalSlides; i+=2)
        {
          slides[k] = (Integer.toString(i) + " to " + (Integer.toString(i+2)));
          k++;
        }
        System.out.println("Book 4, slides " + slides[(int) ((Math.random() * (slides.length)))]);
      }
      
      else if (q == 6)
      {
        totalSlides = 27;
        int k = 0;
        String[] slides = new String[14];
        for (int i = 0; i < totalSlides; i+=2)
        {
          slides[k] = (Integer.toString(i) + " to " + (Integer.toString(i+2)));
          k++;
        }
        System.out.println("Book 6, slides " + slides[(int) ((Math.random() * (slides.length)))]);
      }
      else if (q == 0)
      {
        int chance = (int) (Math.random() * 4) + 1;
        if (chance == 1)
        {
        totalSlides = 58;
        int k = 0;
        String[] slides = new String[29];
        for (int i = 0; i < totalSlides; i+=2)
        {
          slides[k] = (Integer.toString(i) + " to " + (Integer.toString(i+2)));
          k++;
        }
        System.out.println("Book 1, slides " + slides[(int) ((Math.random() * (slides.length)))]); 
        }
        else if (chance == 2)
        {
        totalSlides = 25;
        int k = 0;
        String[] slides = new String[13];
        for (int i = 0; i < totalSlides; i+=2)
        {
          slides[k] = (Integer.toString(i) + " to " + (Integer.toString(i+2)));
          k++;
        }
        System.out.println("Book 2, slides " + slides[(int) ((Math.random() * (slides.length)))]);
        }
        else if (chance == 3)
        {
        totalSlides = 34;
        int k = 0;
        String[] slides = new String[17];
        for (int i = 0; i < totalSlides; i+=2)
        {
          slides[k] = (Integer.toString(i) + " to " + (Integer.toString(i+2)));
          k++;
        }
        System.out.println("Book 4, slides " + slides[(int) ((Math.random() * (slides.length)))]);
        }
        else
        {
        totalSlides = 27;
        int k = 0;
        String[] slides = new String[14];
        for (int i = 0; i < totalSlides; i+=2)
        {
          slides[k] = (Integer.toString(i) + " to " + (Integer.toString(i+2)));
          k++;
        }
        System.out.println("Book 6, slides " + slides[(int) ((Math.random() * (slides.length)))]);
        }
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
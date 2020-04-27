import java.util.*;
public class SwitchCase
{
  public static void main(String args[])
   {
     char choice;
     System.out.println("Pick one :\na.Hi\nb.Hey\nc.Hello");
     Scanner s=new Scanner(System.in);
     choice =s.next().charAt(0);
     switch(choice)
     {
      case 'a':System.out.println("You said Hi!!");
                break;
      case 'b':System.out.println("You said Hey!!");
                break;  
      case 'c':System.out.println("You said Hello!!");
                break;
      default:System.out.println("Invalid Choice.");
     }
   }
}

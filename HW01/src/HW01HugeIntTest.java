import java.util.Scanner;

public class HW01HugeIntTest {

   public static void main( String args[] )  {
     String s1, s2;
     HugeInt n1, n2, n3;
  
     Scanner keyboard = new Scanner(System.in);
     
     System.out.print("Enter the first huge integer number: ");   
     s1 = keyboard.next();
     System.out.print("Enter the second huge integer number: ");   
     s2 = keyboard.next();
     
     n1 = new HugeInt(s1);
     n2 = new HugeInt(s2);
  
     System.out.println(n1+" + "+n2+" is "+n1.add(n2));
     System.out.println(n1+" - "+n2+" is "+n1.subtract(n2));
     System.out.println(n1+" * "+n2+" is "+n1.multiply(n2));
     System.out.println(n1+".compareTo("+n2+") is "+n1.compareTo(n2));
     
     n3 = new HugeInt();
     
     System.out.println(n1+" + "+n3+" is "+n1.add(n3));
     System.out.println(n1+" - "+n3+" is "+n1.subtract(n3));
     System.out.println(n1+" * "+n3+" is "+n1.multiply(n3));
     System.out.println(n1+".compareTo("+n3+") is "+n1.compareTo(n3));
     
   }

}
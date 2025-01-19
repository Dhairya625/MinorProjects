import java.util.*;
public class Convert
{
    int N, Ch,x,y,i;
    String str=" ",A;
    public void d_to_b()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a decimal number");
        N=in.nextInt();
        while(N>0)
        {
           if(N%2==0)
           str="0"+str;
           else
           str="1"+str;
           N=N/2;
        }
        System.out.println("the number in binary form is:"+str);
        str=" ";
        }
    public void d_to_h()
        {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a decimal number");
        N=in.nextInt();
        while(N>0)
        {
           if(N%16>=10)
           str=(char)(55+N%16)+str;
           else
           str=Integer.toString( N%16)+str;
           N=N/16;
        }
        System.out.println("the number in hexadecimal form is:"+str);
        str=" ";
        }
    public void b_to_d()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a binary number");
        N=in.nextInt();
        while(N>0)
        {
          x=x+(int)(Math.pow(2,y))*(int)(N%10);
          y++;
          N=N/10;
        }
        System.out.println("the number in decimal form is:"+x);
        x=0;
        y=0;
    }    
    public void h_to_d()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a hexadecimal number");
        A=in.next();
        for(i=(A.length()-1);i>=0;i--)
        {
            if(Character.isLetter(A.charAt(i)))
            x=x+((int)(Math.pow(16,y))*(A.charAt(i)-55));
            else
            x=x+((int)(Math.pow(16,y))*Integer.parseInt(Character.toString(A.charAt(i))));
            y++;
        }
        System.out.println("the number in decimal form is:"+x);
        x=0;
        y=0;
    }
    public void Choice()
    {
       Scanner in=new Scanner(System.in);
       outer:
       while (Ch!=5)
       {
         System.out.println("enter your choice");
         System.out.println("enter 1 for conversion from decimal to binary");
         System.out.println("enter 2 for conversion from decimal to hexadecimal");
         System.out.println("enter 3 for conversion from binary to decimal");
         System.out.println("enter 4 for conversion from hexadecimal to decimal");
         System.out.println("enter 5 to exit");
         Ch=in.nextInt();
         switch(Ch)
         {
          case 1:
              d_to_b();
              break;
          case 2:
              d_to_h();
              break;
          case 3:
              b_to_d();
              break;
          case 4:
              h_to_d();
              break;
          case 5:
              System.out.println("the process exits");
              break;
              default:
              System.out.println("Wrong choice");
              break outer;
            }
         }
       }
       public static void main()
       {
          Scanner in=new Scanner(System.in);
          Convert ob= new Convert();
          ob.Choice();
       }
    }

import java.util.*;
public class DaysBetweenDates
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int d1[]=new int[3];
        int d2[]=new int[3];
        System.out.println("Enter First Date: ");
        System.out.print("Enter Day: ");
        d1[0]=in.nextInt();
        System.out.print("Enter Month: ");
        d1[1]=in.nextInt();
        System.out.print("Enter Year: ");
        d1[2]=in.nextInt();
        System.out.println("Enter Second Date: ");
        System.out.print("Enter Day: ");
        d2[0]=in.nextInt();
        System.out.print("Enter Month: ");
        d2[1]=in.nextInt();
        System.out.print("Enter Year: ");
        d2[2]=in.nextInt();
        int m[]={31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        int n1=d1[2] * 365 + d1[0];
        int n2=d2[2] * 365 + d2[0];
        for (int i=0;i<d1[1]-1;i++) 
        {
            n1+=m[i];
        }
        
        for (int i=0;i<d2[1]-1;i++)
        {
            n2+=m[i];
        }
        
        int y=d1[1]<= 2?d1[2]-1:d1[2];
        n1+=(y/4)-(y/100)+(y/400);
        y=d2[1]<=2?d2[2]-1:d2[2];
        n2+=(y/4)-(y/100)+(y/400);
        int e=Math.abs(n2-n1);
        System.out.println("No of days Elapsed = " + e);
    }
}

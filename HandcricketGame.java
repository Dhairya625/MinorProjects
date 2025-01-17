import java.util.*;
public class Handcricketgg
{
    int batting;
    int bowling;
    int score;
    int cscore;
    Handcricketgg()
    {
        bowling=0;
        batting=0;
        score=0;
        cscore=0;
    }
    public void batting()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("batting");
        System.out.println("Play:");
         batting= in.nextInt();
         bowling= (int)(Math.random()*10);
        score=0;
        while(batting!=bowling)
        {
            if(batting<=10)
            {
                System.out.println("bat:"+batting);
                System.out.println("ball:"+bowling);
                score=score+batting;
                batting=in.nextInt(); koi
                bowling= (int)(Math.random()*10);
            }
            else if(batting>10)
            {
            System.out.println("Invalid");
            batting= in.nextInt();
            }
            else
            {
                break;
            }
            if(batting==bowling)
            {
                System.out.println("out your score is:"+score);
        
            }
    }
}
    public void bowling()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("bowling");
        System.out.println("Play:");
       bowling= in.nextInt();
       batting= (int)(Math.random()*10);
       score=0;
        while(bowling!=batting)
        {
            if(bowling<=10)
            {
                System.out.println("ball:"+bowling);
                System.out.println("bat:"+batting);
                score=score+bowling;
                bowling=in.nextInt();
                batting= (int)(Math.random()*10);
            }
            else if(batting>10)
            {
            System.out.println("Invalid");
            bowling= in.nextInt();
            }
            else
            {
                break;
            }
            if(batting==bowling)
            {
                System.out.println("out computer score is:"+score);
        
            }
            
    }
if(score==cscore)
            {
                System.out.println("draw");
            }
            else if(score>cscore)
            {
                System.out.println("you won");
            }
            else
                {
                    System.out.println("YOU LOST");
                }
}
    public static void main()
    {
       Scanner in =new Scanner(System.in);
       String n;
       System.out.println("enter your name");
        n=in.nextLine();
        Handcricketgg ob=new Handcricketgg();
        ob.batting();
        ob.bowling();
    }
}

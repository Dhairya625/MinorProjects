import java.util.*;
public class business
{
void Sale(String x[],int y[],int z)
{
for(int i=0;i<z;i++)
{
System.out.println((i+1)+")"+x[i]+" : "+y[i]);
}
}
void Final(int t,int sh,int pl,int bp,int slp)
{
System.out.println("TOTAL SALE: "+t);
System.out.println("TOTAL PURCHASE: "+(t+sh));
System.out.println("STOCK IN HAND: "+sh);
if(pl==1)
System.out.println("PROFIT : "+(slp-bp));
else
System.out.println("LOSS : "+(bp-slp));
}
public static void main()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of items:");
int n=in.nextInt();
int p[]=new int[n];
String it[]=new String[n];
int q[]=new int[n];
int sp[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the name of the item:");
System.out.println("Enter its purchase rate:");
System.out.println("Enter its selling rate:");
System.out.println("Enter the quantity :");
it[i]=in.next();
p[i]=in.nextInt();
sp[i]=in.nextInt();
q[i]=in.nextInt();
}
business ob=new business();
ob.Sale(it,q,n);
System.out.println("Enter the item number and the quantity :");
int tn=in.nextInt();
int qn=in.nextInt();
if(qn>q[tn-1]){
System.out.println("Enter appropriate quantity");
qn=in.nextInt();
}
int tp=q[tn-1]*p[tn-1];
int si=q[tn-1]-qn;
int ts=qn*sp[tn-1];
int h=0;
if(tp<ts)
h=1;
else
h=0;
ob.Final(qn,si,h,tp,ts);
}
}

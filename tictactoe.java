import java.util.*;
public class tictactoe
{
 public static void main()
 {
 Scanner in=new Scanner(System.in);
 String arr[][]={{"| |","| |","| |"},{"| |","| |","| |"},{"| |","| |","| |"}};
 String str[]={"X","0","X","0","X","0","X","0","X","0"};
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<3;j++)
 System.out.print(arr[i][j]);
 System.out.println();
 }
 for(int z=1;z<10;z++){
 System.out.println("enter the row number:");
 int r=in.nextInt();
 System.out.println("enter the column number:");
 int c=in.nextInt();
 if(arr[r-1][c-1]=="|X|"||arr[r-1][c-1]=="|0|")
 {
 z=z-1;
 continue;
 }
 else if(z%2!=0){
 arr[r-1][c-1]="|X|";
 }
 else{
 arr[r-1][c-1]="|0|";
 }
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<3;j++)
 System.out.print(arr[i][j]);
 System.out.println();
 }
 int W=0;
 for(int i=0;i<3;i++)
 {
 W=0;
 for(int j=1;j<3;j++)
 {
 if(!arr[i][j].equals("| |")){
 if(arr[i][j].equals(arr[i][j-1]))
 W++;
 }
 }
 if(W>1)
 break;
 }
 if(W<2){
 for(int i=0;i<3;i++)
 {
 W=0;
 for(int j=1;j<3;j++)
 {
 if(!arr[j][i].equals("| |")){
 if(arr[j][i].equals(arr[j-1][i]))
 W++;
 }
 }
 if(W>1)
 break;
 }
 }
 if(W<2){
 if(!arr[1][1].equals("| |")){
 if(arr[0][0].equals(arr[1][1])&&arr[2][2].equals(arr[1][1]))
 W=2;
 else if(arr[0][2].equals(arr[1][1])&&arr[1][1].equals(arr[2][0]))
 W=2;
 }
 }
 if(W==2){
 System.out.println(str[z+1]+" WINS THE GAME!!!");
 break;
 }
 }
 
}
}

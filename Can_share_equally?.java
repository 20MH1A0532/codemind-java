import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x%2!=0)
         System.out.println("NO");
        else if(x==0 && y%2!=0)
         System.out.println("NO");
        else
         System.out.println("YES");
}
}
package APNIKAKSA;
import java.util.*;
public class Zerosum2
{
    public static void main(String[] args)
    {
        int[] a={6,-1,-2,-3,4,-6};
        boolean found=false;
        for(int i=0;i<a.length;i++)
        {
            int sum=0;
           for(int j=0;j<a.length;j++)
           {
               sum+=a[j];
               if(sum==0)
               {
                   found=true;
                   break;
                }
            }
            if(found) break;
    }
     Set<Integer> set=new HashSet<>();
    int sum=0;
    for(int element:a)
    {
        set.add(sum);
        sum+=element;
        if(set.contains(sum))
        {
            found=true;
            break;
        }
    }
    System.out.println("found="+found);
}
}

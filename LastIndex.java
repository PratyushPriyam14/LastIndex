import java.util.*;
import java.io.*;
public class LastIndex {
    public static void main(String []args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int d=s.nextInt();
        int li=lastindex(arr,0,d);
        System.out.println(li);
    }
    public static int lastindex(int []arr,int index,int x){
        if(index==arr.length){
            return -1;
        }
        int liisa=lastindex(arr,index+1,x);
        if(liisa==-1){
            if(arr[index]==x){
                return index;
            }
            else{
    ;            return -1;
            }
        }
        else {
            return liisa;
        }
    }
}

public class array {


public static void main(String[] args){
        int a[]={1,2,3,4};
        System.out.println(add(a));
        }
public static int add(int[] a){
        int result =0;
        for (int i = 0; i < a.length; i++){
        result+=a[i];
        }
       return result;
        }
        }
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        int Max,Min;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        Max = a;
        if (b>Max)
            Max=b;
        if(c>Max)
            Max=c;
        System.out.print(Max);





        /*
        if(a>b){
            if(a>c)
                System.out.print(a);
        }
        if(b>a){
            if(b>c)
                System.out.print(b);
        }
        if(c>b){
            if(c>a)
                System.out.print(c);
        }
//最小
        if(a<b){
            if(a<c)
                System.out.println(a);
        }
        if(b<a){
            if(b<c)
                System.out.println(b);
        }

        if(c<b){
            if(c<a)
                System.out.println(c);
        }
        */
    }
}

package stream;

public class FunctionDemo {
    public static void main(String[] args) {
//        int a = 0;
//        while (a < 5){
//            switch (a){
//                case 0:
//                case 3: a = a + 2;
//                case 1:
//                case 2: a = a + 3;
//                default: a = a+15;
//            }
//        }
//        System.out.println(a);
//        int i=0,s=0;
//        do {
//            if (i%2==0){
//                i++;
//                continue;
//            }
//            i++;
//            s = s + i;
//        }while (i < 7);
//        System.out.println(s);
        int a,b,c;
        a=1;
        b=3;
        c=(a+b)>3?++a:b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }


}

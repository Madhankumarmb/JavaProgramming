public class AssignmentOperators {
    public static void main(String[] args) {
        int p = 10;
        int q;

        //=
        q=p;
        System.out.println(q);//10

        //+=
        p+=q; //p=p+q
        System.out.println(p);//p=10+10=20

        //-=
        p-=q;  //p=p-q  p=20,q=10
        System.out.println(p);//p=20-10=10

        //*=
        p*=q; //p=P*q
        System.out.println(p);//100

        ///(/=)
        p/=q; // p=p/q =100/10
        System.out.println(p);//10

    }
}

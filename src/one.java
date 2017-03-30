/**
 * Created by mdb17 on 3/29/2017.
 */
public class one {
    public static char x;
    public static char a[];
    public static int ex;

    public static void solve(String n) {
        a = n.toCharArray();
        x = 'x';
        ex = 0;
        int co = 0;
        for (char i : a) {
            if (i == '^') {
                int tt = new String(a).indexOf('^');
                int f = tt+1;
                int exp = a[f];
                System.out.println(exp);
                int d = new String(a).indexOf("x");
                int e = d-1;
                int coe = a[e];
                System.out.println(coe);
                int k = co*exp;
                System.out.println(k);
            }

        }

    }


}

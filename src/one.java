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

        for (char i : a) {
            if (i == '^') {
                int tt = new String(a).indexOf('^');
              for(int j =tt+1; j<a.length; j++){

              }
                int f =tt+1;
                int exp = Integer.parseInt(Character.toString(a[f]));
                System.out.println(exp);
                int d = new String(a).indexOf("x");
                int e = d-1;
                int coe = Integer.parseInt(Character.toString(a[e]));
                System.out.println(coe);
                int k = coe*exp;
                System.out.println(k + "x^" + (exp-1) );
            }

        }

    }


}

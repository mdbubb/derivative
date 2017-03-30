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
       for(char i: a){
           if(i=='^'){
               System.out.println(new String (a).indexOf('^'));
           }
        }

    }


}

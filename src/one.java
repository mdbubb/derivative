import java.util.regex.Pattern;

/**
 * Created by mdb17 on 3/29/2017.
 */
public class one {
    public static char x;
    public static char a[];
    public static int ex;

    public static void powerRule(String n) {
        a = n.toCharArray();
        x = 'x';
        ex = 0;
        for (char i : a) {
            if (n.contains("(") || n.contains(")")) {
                String parenth = "";
                parenth = n.substring((n.indexOf("(") + 1), n.indexOf(")"));
                String pqwieoru = n.substring(0, n.indexOf("("));
                powerRule(pqwieoru);
                System.out.print("(" + parenth + ") + ");
                powerRule(parenth);
                System.out.println("(" + pqwieoru + ")");
                break;


            } else if (i == '^') {
                int tt = new String(a).indexOf('^');
                String sub = n;
                String bub = "";
                String hi = "";
                for (int j = tt + 1; j < a.length; j++) {
                    bub = sub.substring(tt + 1, sub.length());
                    if (sub.contains("+")) {
                        bub = sub.substring(tt + 1, new String((a)).indexOf("+"));
                    } else if (sub.contains("-")) {
                        bub = sub.substring(tt + 1, new String((a)).indexOf("-"));
                    }
                }

                int f = tt + 1;
                int exp = Integer.parseInt(Character.toString(a[f]));
                //new exp
                int newExp = Integer.parseInt(bub) - 1;
                //old coe
                int d = new String(a).indexOf("x");
                for (int u = 0; u < a.length; u++) {
                    hi = sub.substring(0, d);
                }
                //new Coe
                int k = Integer.parseInt(hi) * Integer.parseInt(bub);
                //print
                System.out.print(k + "x^" + newExp);
            } else if (!n.contains("\\d")) {
                String cos = "cos x";
                String sin = "sin x";
                String tan = "tan x";
                String csc = "csc x";
                String sec = "sec x";
                String cot = "cot x";
                if (n.contains("sin")) {
                    System.out.println(cos);
                } else if (n.contains("cos")) {
                    System.out.print("-" + sin);
                    break;
                } else if (n.contains("tan")) {
                    System.out.print(sec + " ^2");
                    break;
                } else if (n.contains(sec)) {
                    System.out.print(sec + " " + tan);
                    break;
                } else if (n.contains(csc)) {
                    System.out.print("- " + csc + " " + cot);
                    break;
                } else if (n.contains(cot)) {
                    System.out.print("- " + csc + "^2");
                    break;
                }else if (n.contains("(") || n.contains(")")) {
                    String parenth = "";
                    parenth = n.substring((n.indexOf("(") + 1), n.indexOf(")"));
                    String pqwieoru = n.substring(0, n.indexOf("("));
                    powerRule(pqwieoru);
                    System.out.print("(" + parenth + ") + ");
                    powerRule(parenth);
                    System.out.println("(" + pqwieoru + ")");
                    break;


                }
            }


        }


    }

}




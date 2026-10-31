package w7;

import java.util.Locale;
public abstract class h7 {
    public static int a(int i10) {
        if (i10 < 100 && i10 >= 0) {
            return Integer.parseInt(String.format(Locale.US, "%s%02d", c3.i0.m(2, 0, String.valueOf(hb.a.k0().get(1))), Integer.valueOf(i10)));
        }
        return i10;
    }
}

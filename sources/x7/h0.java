package x7;

import java.util.Locale;
public abstract class h0 {
    public static int a(int i3) {
        if (i3 < 100 && i3 >= 0) {
            return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.recaptcha.internal.a.j(String.valueOf(v7.s.C0().get(1)), 2, 0), Integer.valueOf(i3)));
        }
        return i3;
    }
}

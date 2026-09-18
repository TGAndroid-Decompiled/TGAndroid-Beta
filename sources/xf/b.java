package xf;

import android.os.Build;
import na.d;
public final class b {
    public static final a f45779a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f45779a = new d(26);
        } else {
            f45779a = new ob.a(26);
        }
    }
}

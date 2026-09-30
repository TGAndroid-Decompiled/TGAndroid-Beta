package xf;

import android.os.Build;
import na.d;
public final class b {
    public static final a f46031a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f46031a = new d(26);
        } else {
            f46031a = new ob.a(26);
        }
    }
}

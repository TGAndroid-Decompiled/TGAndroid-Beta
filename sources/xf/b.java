package xf;

import android.os.Build;
import na.d;
public final class b {
    public static final a f49829a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f49829a = new d(26);
        } else {
            f49829a = new ob.a(26);
        }
    }
}

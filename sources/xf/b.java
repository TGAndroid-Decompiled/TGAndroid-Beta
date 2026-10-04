package xf;

import android.os.Build;
import na.d;
public final class b {
    public static final a f49828a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f49828a = new d(26);
        } else {
            f49828a = new ob.a(26);
        }
    }
}

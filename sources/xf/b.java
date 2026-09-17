package xf;

import android.os.Build;
public final class b {
    public static final a f49377a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f49377a = new ob.a(26);
        } else {
            f49377a = new qb.b(26);
        }
    }
}

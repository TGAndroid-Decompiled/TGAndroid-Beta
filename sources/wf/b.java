package wf;

import android.os.Build;
public final class b {
    public static final a f43980a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f43980a = new qb.b(25);
        } else {
            f43980a = new rb.a(25);
        }
    }
}

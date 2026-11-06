package p4;

import android.os.Bundle;
public final class q {
    public static final String f53329a;
    public static final String f53330b;
    public static final String f53331c;
    public static final String d;

    static {
        String str = h2.m0.f14112a;
        f53329a = Integer.toString(0, 36);
        f53330b = Integer.toString(1, 36);
        f53331c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.m0.o(bundle.getBundle(f53329a));
        bundle.getBoolean(f53330b, false);
        bundle.getBoolean(f53331c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o4);
        return obj;
    }
}

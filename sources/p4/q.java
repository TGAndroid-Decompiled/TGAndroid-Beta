package p4;

import android.os.Bundle;
public final class q {
    public static final String f53420a;
    public static final String f53421b;
    public static final String f53422c;
    public static final String d;

    static {
        String str = h2.m0.f14112a;
        f53420a = Integer.toString(0, 36);
        f53421b = Integer.toString(1, 36);
        f53422c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.m0.o(bundle.getBundle(f53420a));
        bundle.getBoolean(f53421b, false);
        bundle.getBoolean(f53422c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o4);
        return obj;
    }
}

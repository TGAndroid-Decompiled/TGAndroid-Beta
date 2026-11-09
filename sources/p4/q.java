package p4;

import android.os.Bundle;
public final class q {
    public static final String f53433a;
    public static final String f53434b;
    public static final String f53435c;
    public static final String d;

    static {
        String str = h2.m0.f14112a;
        f53433a = Integer.toString(0, 36);
        f53434b = Integer.toString(1, 36);
        f53435c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.m0.o(bundle.getBundle(f53433a));
        bundle.getBoolean(f53434b, false);
        bundle.getBoolean(f53435c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o4);
        return obj;
    }
}

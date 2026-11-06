package p4;

import android.os.Bundle;
public final class q {
    public static final String f53303a;
    public static final String f53304b;
    public static final String f53305c;
    public static final String d;

    static {
        String str = h2.m0.f14112a;
        f53303a = Integer.toString(0, 36);
        f53304b = Integer.toString(1, 36);
        f53305c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.m0.o(bundle.getBundle(f53303a));
        bundle.getBoolean(f53304b, false);
        bundle.getBoolean(f53305c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o4);
        return obj;
    }
}

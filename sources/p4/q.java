package p4;

import android.os.Bundle;
public final class q {
    public static final String f53432a;
    public static final String f53433b;
    public static final String f53434c;
    public static final String d;

    static {
        String str = h2.m0.f14114a;
        f53432a = Integer.toString(0, 36);
        f53433b = Integer.toString(1, 36);
        f53434c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.m0.o(bundle.getBundle(f53432a));
        bundle.getBoolean(f53433b, false);
        bundle.getBoolean(f53434c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o4);
        return obj;
    }
}

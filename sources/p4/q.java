package p4;

import android.os.Bundle;
public final class q {
    public static final String f55437a;
    public static final String f55438b;
    public static final String f55439c;
    public static final String d;

    static {
        String str = h2.l0.f13815a;
        f55437a = Integer.toString(0, 36);
        f55438b = Integer.toString(1, 36);
        f55439c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.l0.o(bundle.getBundle(f55437a));
        bundle.getBoolean(f55438b, false);
        bundle.getBoolean(f55439c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o4);
        return obj;
    }
}

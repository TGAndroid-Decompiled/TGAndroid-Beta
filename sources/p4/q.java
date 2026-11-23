package p4;

import android.os.Bundle;
public final class q {
    public static final String f55402a;
    public static final String f55403b;
    public static final String f55404c;
    public static final String d;

    static {
        String str = h2.l0.f13778a;
        f55402a = Integer.toString(0, 36);
        f55403b = Integer.toString(1, 36);
        f55404c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.l0.o(bundle.getBundle(f55402a));
        bundle.getBoolean(f55403b, false);
        bundle.getBoolean(f55404c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o4);
        return obj;
    }
}

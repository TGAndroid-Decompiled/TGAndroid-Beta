package p4;

import android.os.Bundle;
public final class q {
    public static final String f54838a;
    public static final String f54839b;
    public static final String f54840c;
    public static final String d;

    static {
        String str = h2.l0.f13471a;
        f54838a = Integer.toString(0, 36);
        f54839b = Integer.toString(1, 36);
        f54840c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.l0.o(bundle.getBundle(f54838a));
        bundle.getBoolean(f54839b, false);
        bundle.getBoolean(f54840c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o4);
        return obj;
    }
}

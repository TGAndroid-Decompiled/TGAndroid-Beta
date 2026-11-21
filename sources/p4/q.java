package p4;

import android.os.Bundle;
public final class q {
    public static final String f55433a;
    public static final String f55434b;
    public static final String f55435c;
    public static final String d;

    static {
        String str = h2.l0.f13812a;
        f55433a = Integer.toString(0, 36);
        f55434b = Integer.toString(1, 36);
        f55435c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.l0.o(bundle.getBundle(f55433a));
        bundle.getBoolean(f55434b, false);
        bundle.getBoolean(f55435c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o4);
        return obj;
    }
}

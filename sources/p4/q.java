package p4;

import android.os.Bundle;
public final class q {
    public static final String f55535a;
    public static final String f55536b;
    public static final String f55537c;
    public static final String d;

    static {
        String str = h2.l0.f13778a;
        f55535a = Integer.toString(0, 36);
        f55536b = Integer.toString(1, 36);
        f55537c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.l0.o(bundle.getBundle(f55535a));
        bundle.getBoolean(f55536b, false);
        bundle.getBoolean(f55537c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o4);
        return obj;
    }
}

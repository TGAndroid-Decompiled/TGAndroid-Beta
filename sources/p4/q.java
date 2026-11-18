package p4;

import android.os.Bundle;
public final class q {
    public static final String f55392a;
    public static final String f55393b;
    public static final String f55394c;
    public static final String d;

    static {
        String str = h2.l0.f13786a;
        f55392a = Integer.toString(0, 36);
        f55393b = Integer.toString(1, 36);
        f55394c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o4 = h2.l0.o(bundle.getBundle(f55392a));
        bundle.getBoolean(f55393b, false);
        bundle.getBoolean(f55394c, false);
        bundle.getBoolean(d, false);
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o4);
        return obj;
    }
}

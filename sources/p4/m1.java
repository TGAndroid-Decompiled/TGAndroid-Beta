package p4;

import a8.ia;
import android.os.Bundle;
import android.os.SystemClock;
public final class m1 {
    public static final String f53287e;
    public static final String f53288f;
    public static final String f53289g;
    public static final String h;
    public final int f53290a;
    public final Bundle f53291b;
    public final long f53292c;
    public final k1 d;

    static {
        String str = h2.m0.f14112a;
        f53287e = Integer.toString(0, 36);
        f53288f = Integer.toString(1, 36);
        f53289g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public m1(int i7) {
        this(i7, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static m1 a(Bundle bundle) {
        k1 k1Var;
        int i7 = bundle.getInt(f53287e, -1);
        Bundle o4 = h2.m0.o(bundle.getBundle(f53288f));
        long j3 = bundle.getLong(f53289g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i10 = bundle2.getInt(k1.d, 1000);
            String string = bundle2.getString(k1.f53245e, "");
            Bundle o10 = h2.m0.o(bundle2.getBundle(k1.f53246f));
            if (o10 == null) {
                o10 = Bundle.EMPTY;
            }
            k1Var = new k1(string, i10, o10);
        } else if (i7 != 0) {
            k1Var = new k1(i7);
        } else {
            k1Var = null;
        }
        k1 k1Var2 = k1Var;
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        return new m1(i7, o4, j3, k1Var2);
    }

    public m1(int i7, Bundle bundle, long j3, k1 k1Var) {
        ia.f(k1Var == null || i7 < 0);
        this.f53290a = i7;
        this.f53291b = new Bundle(bundle);
        this.f53292c = j3;
        if (k1Var == null && i7 < 0) {
            k1Var = new k1(i7);
        }
        this.d = k1Var;
    }
}

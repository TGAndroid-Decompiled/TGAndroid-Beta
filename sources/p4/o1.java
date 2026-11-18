package p4;

import a8.la;
import android.os.Bundle;
import android.os.SystemClock;
public final class o1 {
    public static final String f55380e;
    public static final String f55381f;
    public static final String f55382g;
    public static final String h;
    public final int f55383a;
    public final Bundle f55384b;
    public final long f55385c;
    public final m1 d;

    static {
        String str = h2.l0.f13783a;
        f55380e = Integer.toString(0, 36);
        f55381f = Integer.toString(1, 36);
        f55382g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public o1(int i7) {
        this(i7, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static o1 a(Bundle bundle) {
        m1 m1Var;
        int i7 = bundle.getInt(f55380e, -1);
        Bundle o4 = h2.l0.o(bundle.getBundle(f55381f));
        long j3 = bundle.getLong(f55382g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i10 = bundle2.getInt(m1.d, 1000);
            String string = bundle2.getString(m1.f55343e, "");
            Bundle o10 = h2.l0.o(bundle2.getBundle(m1.f55344f));
            if (o10 == null) {
                o10 = Bundle.EMPTY;
            }
            m1Var = new m1(string, i10, o10);
        } else if (i7 != 0) {
            m1Var = new m1(i7);
        } else {
            m1Var = null;
        }
        m1 m1Var2 = m1Var;
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        return new o1(i7, o4, j3, m1Var2);
    }

    public o1(int i7, Bundle bundle, long j3, m1 m1Var) {
        la.f(m1Var == null || i7 < 0);
        this.f55383a = i7;
        this.f55384b = new Bundle(bundle);
        this.f55385c = j3;
        if (m1Var == null && i7 < 0) {
            m1Var = new m1(i7);
        }
        this.d = m1Var;
    }
}

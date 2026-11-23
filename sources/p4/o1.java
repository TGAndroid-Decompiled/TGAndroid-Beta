package p4;

import a8.la;
import android.os.Bundle;
import android.os.SystemClock;
public final class o1 {
    public static final String f55425e;
    public static final String f55426f;
    public static final String f55427g;
    public static final String h;
    public final int f55428a;
    public final Bundle f55429b;
    public final long f55430c;
    public final m1 d;

    static {
        String str = h2.l0.f13815a;
        f55425e = Integer.toString(0, 36);
        f55426f = Integer.toString(1, 36);
        f55427g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public o1(int i7) {
        this(i7, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static o1 a(Bundle bundle) {
        m1 m1Var;
        int i7 = bundle.getInt(f55425e, -1);
        Bundle o4 = h2.l0.o(bundle.getBundle(f55426f));
        long j3 = bundle.getLong(f55427g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i10 = bundle2.getInt(m1.d, 1000);
            String string = bundle2.getString(m1.f55373e, "");
            Bundle o10 = h2.l0.o(bundle2.getBundle(m1.f55374f));
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
        this.f55428a = i7;
        this.f55429b = new Bundle(bundle);
        this.f55430c = j3;
        if (m1Var == null && i7 < 0) {
            m1Var = new m1(i7);
        }
        this.d = m1Var;
    }
}

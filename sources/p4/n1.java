package p4;

import a8.ma;
import android.os.Bundle;
import android.os.SystemClock;
public final class n1 {
    public static final String f55498e;
    public static final String f55499f;
    public static final String f55500g;
    public static final String h;
    public final int f55501a;
    public final Bundle f55502b;
    public final long f55503c;
    public final l1 d;

    static {
        String str = h2.l0.f13778a;
        f55498e = Integer.toString(0, 36);
        f55499f = Integer.toString(1, 36);
        f55500g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public n1(int i7) {
        this(i7, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static n1 a(Bundle bundle) {
        l1 l1Var;
        int i7 = bundle.getInt(f55498e, -1);
        Bundle o4 = h2.l0.o(bundle.getBundle(f55499f));
        long j3 = bundle.getLong(f55500g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i10 = bundle2.getInt(l1.d, 1000);
            String string = bundle2.getString(l1.f55455e, "");
            Bundle o10 = h2.l0.o(bundle2.getBundle(l1.f55456f));
            if (o10 == null) {
                o10 = Bundle.EMPTY;
            }
            l1Var = new l1(string, i10, o10);
        } else if (i7 != 0) {
            l1Var = new l1(i7);
        } else {
            l1Var = null;
        }
        l1 l1Var2 = l1Var;
        if (o4 == null) {
            o4 = Bundle.EMPTY;
        }
        return new n1(i7, o4, j3, l1Var2);
    }

    public n1(int i7, Bundle bundle, long j3, l1 l1Var) {
        ma.f(l1Var == null || i7 < 0);
        this.f55501a = i7;
        this.f55502b = new Bundle(bundle);
        this.f55503c = j3;
        if (l1Var == null && i7 < 0) {
            l1Var = new l1(i7);
        }
        this.d = l1Var;
    }
}

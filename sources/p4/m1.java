package p4;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class m1 {
    public static final String d;
    public static final String f55343e;
    public static final String f55344f;
    public final int f55345a;
    public final String f55346b;
    public final Bundle f55347c;

    static {
        String str = h2.l0.f13786a;
        d = Integer.toString(0, 36);
        f55343e = Integer.toString(1, 36);
        f55344f = Integer.toString(2, 36);
    }

    public m1(int i7) {
        this("no error message provided", i7, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f55345a);
        bundle.putString(f55343e, this.f55346b);
        Bundle bundle2 = this.f55347c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f55344f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (this.f55345a == m1Var.f55345a && Objects.equals(this.f55346b, m1Var.f55346b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55345a), this.f55346b);
    }

    public m1(String str, int i7, Bundle bundle) {
        boolean z10 = true;
        if (i7 >= 0 && i7 != 1) {
            z10 = false;
        }
        la.f(z10);
        this.f55345a = i7;
        this.f55346b = str;
        this.f55347c = bundle;
    }
}

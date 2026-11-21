package p4;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class m1 {
    public static final String d;
    public static final String f55369e;
    public static final String f55370f;
    public final int f55371a;
    public final String f55372b;
    public final Bundle f55373c;

    static {
        String str = h2.l0.f13812a;
        d = Integer.toString(0, 36);
        f55369e = Integer.toString(1, 36);
        f55370f = Integer.toString(2, 36);
    }

    public m1(int i7) {
        this("no error message provided", i7, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f55371a);
        bundle.putString(f55369e, this.f55372b);
        Bundle bundle2 = this.f55373c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f55370f, bundle2);
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
        if (this.f55371a == m1Var.f55371a && Objects.equals(this.f55372b, m1Var.f55372b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55371a), this.f55372b);
    }

    public m1(String str, int i7, Bundle bundle) {
        boolean z10 = true;
        if (i7 >= 0 && i7 != 1) {
            z10 = false;
        }
        la.f(z10);
        this.f55371a = i7;
        this.f55372b = str;
        this.f55373c = bundle;
    }
}

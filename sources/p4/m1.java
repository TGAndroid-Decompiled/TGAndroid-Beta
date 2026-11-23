package p4;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class m1 {
    public static final String d;
    public static final String f55373e;
    public static final String f55374f;
    public final int f55375a;
    public final String f55376b;
    public final Bundle f55377c;

    static {
        String str = h2.l0.f13815a;
        d = Integer.toString(0, 36);
        f55373e = Integer.toString(1, 36);
        f55374f = Integer.toString(2, 36);
    }

    public m1(int i7) {
        this("no error message provided", i7, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f55375a);
        bundle.putString(f55373e, this.f55376b);
        Bundle bundle2 = this.f55377c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f55374f, bundle2);
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
        if (this.f55375a == m1Var.f55375a && Objects.equals(this.f55376b, m1Var.f55376b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55375a), this.f55376b);
    }

    public m1(String str, int i7, Bundle bundle) {
        boolean z10 = true;
        if (i7 >= 0 && i7 != 1) {
            z10 = false;
        }
        la.f(z10);
        this.f55375a = i7;
        this.f55376b = str;
        this.f55377c = bundle;
    }
}

package p4;

import a8.ma;
import android.os.Bundle;
import j$.util.Objects;
public final class m1 {
    public static final String d;
    public static final String f55353e;
    public static final String f55354f;
    public final int f55355a;
    public final String f55356b;
    public final Bundle f55357c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(0, 36);
        f55353e = Integer.toString(1, 36);
        f55354f = Integer.toString(2, 36);
    }

    public m1(int i7) {
        this("no error message provided", i7, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f55355a);
        bundle.putString(f55353e, this.f55356b);
        Bundle bundle2 = this.f55357c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f55354f, bundle2);
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
        if (this.f55355a == m1Var.f55355a && Objects.equals(this.f55356b, m1Var.f55356b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55355a), this.f55356b);
    }

    public m1(String str, int i7, Bundle bundle) {
        boolean z10 = true;
        if (i7 >= 0 && i7 != 1) {
            z10 = false;
        }
        ma.f(z10);
        this.f55355a = i7;
        this.f55356b = str;
        this.f55357c = bundle;
    }
}

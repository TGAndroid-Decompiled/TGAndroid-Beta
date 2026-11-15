package p4;

import a8.ja;
import android.os.Bundle;
import j$.util.Objects;
public final class k1 {
    public static final String d;
    public static final String f54756e;
    public static final String f54757f;
    public final int f54758a;
    public final String f54759b;
    public final Bundle f54760c;

    static {
        String str = h2.l0.f13471a;
        d = Integer.toString(0, 36);
        f54756e = Integer.toString(1, 36);
        f54757f = Integer.toString(2, 36);
    }

    public k1(int i7) {
        this("no error message provided", i7, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f54758a);
        bundle.putString(f54756e, this.f54759b);
        Bundle bundle2 = this.f54760c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f54757f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (this.f54758a == k1Var.f54758a && Objects.equals(this.f54759b, k1Var.f54759b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f54758a), this.f54759b);
    }

    public k1(String str, int i7, Bundle bundle) {
        boolean z10 = true;
        if (i7 >= 0 && i7 != 1) {
            z10 = false;
        }
        ja.f(z10);
        this.f54758a = i7;
        this.f54759b = str;
        this.f54760c = bundle;
    }
}

package p4;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class k1 {
    public static final String d;
    public static final String f53350e;
    public static final String f53351f;
    public final int f53352a;
    public final String f53353b;
    public final Bundle f53354c;

    static {
        String str = h2.m0.f14114a;
        d = Integer.toString(0, 36);
        f53350e = Integer.toString(1, 36);
        f53351f = Integer.toString(2, 36);
    }

    public k1(int i7) {
        this("no error message provided", i7, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f53352a);
        bundle.putString(f53350e, this.f53353b);
        Bundle bundle2 = this.f53354c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f53351f, bundle2);
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
        if (this.f53352a == k1Var.f53352a && Objects.equals(this.f53353b, k1Var.f53353b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53352a), this.f53353b);
    }

    public k1(String str, int i7, Bundle bundle) {
        boolean z9 = true;
        if (i7 >= 0 && i7 != 1) {
            z9 = false;
        }
        ia.f(z9);
        this.f53352a = i7;
        this.f53353b = str;
        this.f53354c = bundle;
    }
}

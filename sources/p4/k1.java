package p4;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class k1 {
    public static final String d;
    public static final String f53247e;
    public static final String f53248f;
    public final int f53249a;
    public final String f53250b;
    public final Bundle f53251c;

    static {
        String str = h2.m0.f14112a;
        d = Integer.toString(0, 36);
        f53247e = Integer.toString(1, 36);
        f53248f = Integer.toString(2, 36);
    }

    public k1(int i7) {
        this("no error message provided", i7, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f53249a);
        bundle.putString(f53247e, this.f53250b);
        Bundle bundle2 = this.f53251c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f53248f, bundle2);
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
        if (this.f53249a == k1Var.f53249a && Objects.equals(this.f53250b, k1Var.f53250b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53249a), this.f53250b);
    }

    public k1(String str, int i7, Bundle bundle) {
        boolean z9 = true;
        if (i7 >= 0 && i7 != 1) {
            z9 = false;
        }
        ia.f(z9);
        this.f53249a = i7;
        this.f53250b = str;
        this.f53251c = bundle;
    }
}

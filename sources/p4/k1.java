package p4;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class k1 {
    public static final String d;
    public static final String f53339e;
    public static final String f53340f;
    public final int f53341a;
    public final String f53342b;
    public final Bundle f53343c;

    static {
        String str = h2.m0.f14112a;
        d = Integer.toString(0, 36);
        f53339e = Integer.toString(1, 36);
        f53340f = Integer.toString(2, 36);
    }

    public k1(int i7) {
        this("no error message provided", i7, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f53341a);
        bundle.putString(f53339e, this.f53342b);
        Bundle bundle2 = this.f53343c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f53340f, bundle2);
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
        if (this.f53341a == k1Var.f53341a && Objects.equals(this.f53342b, k1Var.f53342b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53341a), this.f53342b);
    }

    public k1(String str, int i7, Bundle bundle) {
        boolean z9 = true;
        if (i7 >= 0 && i7 != 1) {
            z9 = false;
        }
        ia.f(z9);
        this.f53341a = i7;
        this.f53342b = str;
        this.f53343c = bundle;
    }
}

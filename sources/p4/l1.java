package p4;

import a8.ma;
import android.os.Bundle;
import j$.util.Objects;
public final class l1 {
    public static final String d;
    public static final String f55455e;
    public static final String f55456f;
    public final int f55457a;
    public final String f55458b;
    public final Bundle f55459c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(0, 36);
        f55455e = Integer.toString(1, 36);
        f55456f = Integer.toString(2, 36);
    }

    public l1(int i7) {
        this("no error message provided", i7, Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f55457a);
        bundle.putString(f55455e, this.f55458b);
        Bundle bundle2 = this.f55459c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f55456f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f55457a == l1Var.f55457a && Objects.equals(this.f55458b, l1Var.f55458b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55457a), this.f55458b);
    }

    public l1(String str, int i7, Bundle bundle) {
        boolean z10 = true;
        if (i7 >= 0 && i7 != 1) {
            z10 = false;
        }
        ma.f(z10);
        this.f55457a = i7;
        this.f55458b = str;
        this.f55459c = bundle;
    }
}

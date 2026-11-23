package p4;

import a8.la;
import android.os.Bundle;
import android.text.TextUtils;
import h9.t1;
import j$.util.Objects;
public final class k1 {
    public static final t1 d = h9.i0.u(40010);
    public static final t1 f55364e;
    public static final String f55365f;
    public static final String f55366g;
    public static final String h;
    public final int f55367a;
    public final String f55368b;
    public final Bundle f55369c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        h9.o.e(7, objArr);
        f55364e = h9.i0.o(7, objArr);
        String str = h2.l0.f13815a;
        f55365f = Integer.toString(0, 36);
        f55366g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public k1(int i7) {
        la.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i7 != 0);
        this.f55367a = i7;
        this.f55368b = "";
        this.f55369c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f55365f, this.f55367a);
        bundle.putString(f55366g, this.f55368b);
        bundle.putBundle(h, this.f55369c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (this.f55367a != k1Var.f55367a || !TextUtils.equals(this.f55368b, k1Var.f55368b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f55368b, Integer.valueOf(this.f55367a));
    }

    public k1(String str, Bundle bundle) {
        this.f55367a = 0;
        str.getClass();
        this.f55368b = str;
        bundle.getClass();
        this.f55369c = new Bundle(bundle);
    }
}

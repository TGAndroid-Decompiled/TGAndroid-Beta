package p4;

import a8.ma;
import android.os.Bundle;
import android.text.TextUtils;
import h9.t1;
import j$.util.Objects;
public final class k1 {
    public static final t1 d = h9.i0.u(40010);
    public static final t1 f55327e;
    public static final String f55328f;
    public static final String f55329g;
    public static final String h;
    public final int f55330a;
    public final String f55331b;
    public final Bundle f55332c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        h9.o.e(7, objArr);
        f55327e = h9.i0.o(7, objArr);
        String str = h2.l0.f13778a;
        f55328f = Integer.toString(0, 36);
        f55329g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public k1(int i7) {
        ma.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i7 != 0);
        this.f55330a = i7;
        this.f55331b = "";
        this.f55332c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f55328f, this.f55330a);
        bundle.putString(f55329g, this.f55331b);
        bundle.putBundle(h, this.f55332c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (this.f55330a != k1Var.f55330a || !TextUtils.equals(this.f55331b, k1Var.f55331b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f55331b, Integer.valueOf(this.f55330a));
    }

    public k1(String str, Bundle bundle) {
        this.f55330a = 0;
        str.getClass();
        this.f55331b = str;
        bundle.getClass();
        this.f55332c = new Bundle(bundle);
    }
}

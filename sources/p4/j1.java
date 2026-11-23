package p4;

import a8.ma;
import android.os.Bundle;
import android.text.TextUtils;
import h9.s1;
import j$.util.Objects;
public final class j1 {
    public static final s1 d = h9.i0.u(40010);
    public static final s1 f55441e;
    public static final String f55442f;
    public static final String f55443g;
    public static final String h;
    public final int f55444a;
    public final String f55445b;
    public final Bundle f55446c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        h9.o.e(7, objArr);
        f55441e = h9.i0.o(7, objArr);
        String str = h2.l0.f13778a;
        f55442f = Integer.toString(0, 36);
        f55443g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public j1(int i7) {
        ma.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i7 != 0);
        this.f55444a = i7;
        this.f55445b = "";
        this.f55446c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f55442f, this.f55444a);
        bundle.putString(f55443g, this.f55445b);
        bundle.putBundle(h, this.f55446c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (this.f55444a != j1Var.f55444a || !TextUtils.equals(this.f55445b, j1Var.f55445b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f55445b, Integer.valueOf(this.f55444a));
    }

    public j1(String str, Bundle bundle) {
        this.f55444a = 0;
        str.getClass();
        this.f55445b = str;
        bundle.getClass();
        this.f55446c = new Bundle(bundle);
    }
}

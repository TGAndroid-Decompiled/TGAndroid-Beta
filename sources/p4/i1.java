package p4;

import a8.ia;
import android.os.Bundle;
import android.text.TextUtils;
import h9.t1;
import j$.util.Objects;
public final class i1 {
    public static final t1 d = h9.i0.u(40010);
    public static final t1 f53304e;
    public static final String f53305f;
    public static final String f53306g;
    public static final String h;
    public final int f53307a;
    public final String f53308b;
    public final Bundle f53309c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        h9.o.e(7, objArr);
        f53304e = h9.i0.o(7, objArr);
        String str = h2.m0.f14112a;
        f53305f = Integer.toString(0, 36);
        f53306g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public i1(int i7) {
        ia.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i7 != 0);
        this.f53307a = i7;
        this.f53308b = "";
        this.f53309c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f53305f, this.f53307a);
        bundle.putString(f53306g, this.f53308b);
        bundle.putBundle(h, this.f53309c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f53307a != i1Var.f53307a || !TextUtils.equals(this.f53308b, i1Var.f53308b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f53308b, Integer.valueOf(this.f53307a));
    }

    public i1(String str, Bundle bundle) {
        this.f53307a = 0;
        str.getClass();
        this.f53308b = str;
        bundle.getClass();
        this.f53309c = new Bundle(bundle);
    }
}

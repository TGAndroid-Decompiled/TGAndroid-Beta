package p4;

import a8.ia;
import android.os.Bundle;
import android.text.TextUtils;
import h9.t1;
import j$.util.Objects;
public final class i1 {
    public static final t1 d = h9.i0.u(40010);
    public static final t1 f53305e;
    public static final String f53306f;
    public static final String f53307g;
    public static final String h;
    public final int f53308a;
    public final String f53309b;
    public final Bundle f53310c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        h9.o.e(7, objArr);
        f53305e = h9.i0.o(7, objArr);
        String str = h2.m0.f14112a;
        f53306f = Integer.toString(0, 36);
        f53307g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public i1(int i7) {
        ia.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i7 != 0);
        this.f53308a = i7;
        this.f53309b = "";
        this.f53310c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f53306f, this.f53308a);
        bundle.putString(f53307g, this.f53309b);
        bundle.putBundle(h, this.f53310c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f53308a != i1Var.f53308a || !TextUtils.equals(this.f53309b, i1Var.f53309b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f53309b, Integer.valueOf(this.f53308a));
    }

    public i1(String str, Bundle bundle) {
        this.f53308a = 0;
        str.getClass();
        this.f53309b = str;
        bundle.getClass();
        this.f53310c = new Bundle(bundle);
    }
}

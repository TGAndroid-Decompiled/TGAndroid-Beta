package p4;

import a8.ia;
import android.os.Bundle;
import android.text.TextUtils;
import h9.t1;
import j$.util.Objects;
public final class i1 {
    public static final t1 d = h9.i0.u(40010);
    public static final t1 f53316e;
    public static final String f53317f;
    public static final String f53318g;
    public static final String h;
    public final int f53319a;
    public final String f53320b;
    public final Bundle f53321c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        h9.o.e(7, objArr);
        f53316e = h9.i0.o(7, objArr);
        String str = h2.m0.f14114a;
        f53317f = Integer.toString(0, 36);
        f53318g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public i1(int i7) {
        ia.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i7 != 0);
        this.f53319a = i7;
        this.f53320b = "";
        this.f53321c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f53317f, this.f53319a);
        bundle.putString(f53318g, this.f53320b);
        bundle.putBundle(h, this.f53321c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f53319a != i1Var.f53319a || !TextUtils.equals(this.f53320b, i1Var.f53320b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f53320b, Integer.valueOf(this.f53319a));
    }

    public i1(String str, Bundle bundle) {
        this.f53319a = 0;
        str.getClass();
        this.f53320b = str;
        bundle.getClass();
        this.f53321c = new Bundle(bundle);
    }
}

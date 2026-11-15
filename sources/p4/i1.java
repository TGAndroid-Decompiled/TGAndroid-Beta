package p4;

import a8.ja;
import android.os.Bundle;
import android.text.TextUtils;
import h9.s1;
import j$.util.Objects;
public final class i1 {
    public static final s1 d = h9.i0.u(40010);
    public static final s1 f54722e;
    public static final String f54723f;
    public static final String f54724g;
    public static final String h;
    public final int f54725a;
    public final String f54726b;
    public final Bundle f54727c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        h9.o.e(7, objArr);
        f54722e = h9.i0.o(7, objArr);
        String str = h2.l0.f13471a;
        f54723f = Integer.toString(0, 36);
        f54724g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public i1(int i7) {
        ja.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i7 != 0);
        this.f54725a = i7;
        this.f54726b = "";
        this.f54727c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f54723f, this.f54725a);
        bundle.putString(f54724g, this.f54726b);
        bundle.putBundle(h, this.f54727c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f54725a != i1Var.f54725a || !TextUtils.equals(this.f54726b, i1Var.f54726b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54726b, Integer.valueOf(this.f54725a));
    }

    public i1(String str, Bundle bundle) {
        this.f54725a = 0;
        str.getClass();
        this.f54726b = str;
        bundle.getClass();
        this.f54727c = new Bundle(bundle);
    }
}

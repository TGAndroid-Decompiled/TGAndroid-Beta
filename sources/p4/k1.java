package p4;

import a8.la;
import android.os.Bundle;
import android.text.TextUtils;
import h9.t1;
import j$.util.Objects;
public final class k1 {
    public static final t1 d = h9.i0.u(40010);
    public static final t1 f55360e;
    public static final String f55361f;
    public static final String f55362g;
    public static final String h;
    public final int f55363a;
    public final String f55364b;
    public final Bundle f55365c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        h9.o.e(7, objArr);
        f55360e = h9.i0.o(7, objArr);
        String str = h2.l0.f13812a;
        f55361f = Integer.toString(0, 36);
        f55362g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public k1(int i7) {
        la.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i7 != 0);
        this.f55363a = i7;
        this.f55364b = "";
        this.f55365c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f55361f, this.f55363a);
        bundle.putString(f55362g, this.f55364b);
        bundle.putBundle(h, this.f55365c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (this.f55363a != k1Var.f55363a || !TextUtils.equals(this.f55364b, k1Var.f55364b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f55364b, Integer.valueOf(this.f55363a));
    }

    public k1(String str, Bundle bundle) {
        this.f55363a = 0;
        str.getClass();
        this.f55364b = str;
        bundle.getClass();
        this.f55365c = new Bundle(bundle);
    }
}

package p4;

import a8.la;
import android.os.Bundle;
import android.text.TextUtils;
import h9.t1;
import j$.util.Objects;
public final class k1 {
    public static final t1 d = h9.i0.u(40010);
    public static final t1 f55317e;
    public static final String f55318f;
    public static final String f55319g;
    public static final String h;
    public final int f55320a;
    public final String f55321b;
    public final Bundle f55322c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        h9.o.e(7, objArr);
        f55317e = h9.i0.o(7, objArr);
        String str = h2.l0.f13786a;
        f55318f = Integer.toString(0, 36);
        f55319g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public k1(int i7) {
        la.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i7 != 0);
        this.f55320a = i7;
        this.f55321b = "";
        this.f55322c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f55318f, this.f55320a);
        bundle.putString(f55319g, this.f55321b);
        bundle.putBundle(h, this.f55322c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (this.f55320a != k1Var.f55320a || !TextUtils.equals(this.f55321b, k1Var.f55321b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f55321b, Integer.valueOf(this.f55320a));
    }

    public k1(String str, Bundle bundle) {
        this.f55320a = 0;
        str.getClass();
        this.f55321b = str;
        bundle.getClass();
        this.f55322c = new Bundle(bundle);
    }
}

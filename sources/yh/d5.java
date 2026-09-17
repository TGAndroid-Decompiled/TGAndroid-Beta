package yh;

import org.telegram.messenger.Utilities;
public final class d5 implements Utilities.Callback {
    public final int f47101a = 0;
    public final v5 f47102b;
    public final boolean[] f47103c;
    public final int d;
    public final Utilities.Callback e;
    public final Utilities.Callback f47104f;

    public d5(v5 v5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f47102b = v5Var;
        this.d = i10;
        this.e = callback;
        this.f47103c = zArr;
        this.f47104f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f47101a) {
            case 0:
                if (this.d > 0) {
                    this.f47102b.S();
                }
                Utilities.Callback callback = this.e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f47103c[0] = true;
                Utilities.Callback callback2 = this.f47104f;
                if (callback2 != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    callback2.run(str);
                    return;
                }
                return;
            default:
                this.f47103c[0] = true;
                if (this.d > 0) {
                    this.f47102b.S();
                }
                Utilities.Callback callback3 = this.e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f47104f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public d5(v5 v5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f47102b = v5Var;
        this.f47103c = zArr;
        this.d = i10;
        this.e = callback;
        this.f47104f = callback2;
    }
}

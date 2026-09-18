package yh;

import org.telegram.messenger.Utilities;
public final class b5 implements Utilities.Callback {
    public final int f47229a = 0;
    public final t5 f47230b;
    public final boolean[] f47231c;
    public final int d;
    public final Utilities.Callback e;
    public final Utilities.Callback f47232f;

    public b5(t5 t5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f47230b = t5Var;
        this.d = i10;
        this.e = callback;
        this.f47231c = zArr;
        this.f47232f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f47229a) {
            case 0:
                if (this.d > 0) {
                    this.f47230b.S();
                }
                Utilities.Callback callback = this.e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f47231c[0] = true;
                Utilities.Callback callback2 = this.f47232f;
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
                this.f47231c[0] = true;
                if (this.d > 0) {
                    this.f47230b.S();
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
                Utilities.Callback callback4 = this.f47232f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public b5(t5 t5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f47230b = t5Var;
        this.f47231c = zArr;
        this.d = i10;
        this.e = callback;
        this.f47232f = callback2;
    }
}

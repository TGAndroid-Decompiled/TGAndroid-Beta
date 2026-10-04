package yh;

import org.telegram.messenger.Utilities;
public final class a5 implements Utilities.Callback {
    public final int f51090a = 0;
    public final t5 f51091b;
    public final boolean[] f51092c;
    public final int d;
    public final Utilities.Callback f51093e;
    public final Utilities.Callback f51094f;

    public a5(t5 t5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f51091b = t5Var;
        this.d = i10;
        this.f51093e = callback;
        this.f51092c = zArr;
        this.f51094f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f51090a) {
            case 0:
                if (this.d > 0) {
                    this.f51091b.S();
                }
                Utilities.Callback callback = this.f51093e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f51092c[0] = true;
                Utilities.Callback callback2 = this.f51094f;
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
                this.f51092c[0] = true;
                if (this.d > 0) {
                    this.f51091b.S();
                }
                Utilities.Callback callback3 = this.f51093e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f51094f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public a5(t5 t5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f51091b = t5Var;
        this.f51092c = zArr;
        this.d = i10;
        this.f51093e = callback;
        this.f51094f = callback2;
    }
}

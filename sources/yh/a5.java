package yh;

import org.telegram.messenger.Utilities;
public final class a5 implements Utilities.Callback {
    public final int f51089a = 0;
    public final t5 f51090b;
    public final boolean[] f51091c;
    public final int d;
    public final Utilities.Callback f51092e;
    public final Utilities.Callback f51093f;

    public a5(t5 t5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f51090b = t5Var;
        this.d = i10;
        this.f51092e = callback;
        this.f51091c = zArr;
        this.f51093f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f51089a) {
            case 0:
                if (this.d > 0) {
                    this.f51090b.S();
                }
                Utilities.Callback callback = this.f51092e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f51091c[0] = true;
                Utilities.Callback callback2 = this.f51093f;
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
                this.f51091c[0] = true;
                if (this.d > 0) {
                    this.f51090b.S();
                }
                Utilities.Callback callback3 = this.f51092e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f51093f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public a5(t5 t5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f51090b = t5Var;
        this.f51091c = zArr;
        this.d = i10;
        this.f51092e = callback;
        this.f51093f = callback2;
    }
}

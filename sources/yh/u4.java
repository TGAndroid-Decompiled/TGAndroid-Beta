package yh;

import org.telegram.messenger.Utilities;
public final class u4 implements Utilities.Callback {
    public final int f53407a = 0;
    public final n5 f53408b;
    public final boolean[] f53409c;
    public final int d;
    public final Utilities.Callback f53410e;
    public final Utilities.Callback f53411f;

    public u4(n5 n5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f53408b = n5Var;
        this.d = i10;
        this.f53410e = callback;
        this.f53409c = zArr;
        this.f53411f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f53407a) {
            case 0:
                if (this.d > 0) {
                    this.f53408b.S();
                }
                Utilities.Callback callback = this.f53410e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f53409c[0] = true;
                Utilities.Callback callback2 = this.f53411f;
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
                this.f53409c[0] = true;
                if (this.d > 0) {
                    this.f53408b.S();
                }
                Utilities.Callback callback3 = this.f53410e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f53411f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public u4(n5 n5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f53408b = n5Var;
        this.f53409c = zArr;
        this.d = i10;
        this.f53410e = callback;
        this.f53411f = callback2;
    }
}

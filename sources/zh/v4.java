package zh;

import org.telegram.messenger.Utilities;
public final class v4 implements Utilities.Callback {
    public final int f51247a = 0;
    public final n5 f51248b;
    public final boolean[] f51249c;
    public final int d;
    public final Utilities.Callback e;
    public final Utilities.Callback f51250f;

    public v4(n5 n5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f51248b = n5Var;
        this.d = i10;
        this.e = callback;
        this.f51249c = zArr;
        this.f51250f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f51247a) {
            case 0:
                if (this.d > 0) {
                    this.f51248b.S();
                }
                Utilities.Callback callback = this.e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f51249c[0] = true;
                Utilities.Callback callback2 = this.f51250f;
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
                this.f51249c[0] = true;
                if (this.d > 0) {
                    this.f51248b.S();
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
                Utilities.Callback callback4 = this.f51250f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public v4(n5 n5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f51248b = n5Var;
        this.f51249c = zArr;
        this.d = i10;
        this.e = callback;
        this.f51250f = callback2;
    }
}

package yh;

import org.telegram.messenger.Utilities;
public final class c5 implements Utilities.Callback {
    public final int f46987a = 0;
    public final u5 f46988b;
    public final boolean[] f46989c;
    public final int d;
    public final Utilities.Callback e;
    public final Utilities.Callback f46990f;

    public c5(u5 u5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f46988b = u5Var;
        this.d = i10;
        this.e = callback;
        this.f46989c = zArr;
        this.f46990f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f46987a) {
            case 0:
                if (this.d > 0) {
                    this.f46988b.S();
                }
                Utilities.Callback callback = this.e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f46989c[0] = true;
                Utilities.Callback callback2 = this.f46990f;
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
                this.f46989c[0] = true;
                if (this.d > 0) {
                    this.f46988b.S();
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
                Utilities.Callback callback4 = this.f46990f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public c5(u5 u5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f46988b = u5Var;
        this.f46989c = zArr;
        this.d = i10;
        this.e = callback;
        this.f46990f = callback2;
    }
}

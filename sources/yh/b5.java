package yh;

import org.telegram.messenger.Utilities;
public final class b5 implements Utilities.Callback {
    public final int f51149a = 0;
    public final u5 f51150b;
    public final boolean[] f51151c;
    public final int d;
    public final Utilities.Callback f51152e;
    public final Utilities.Callback f51153f;

    public b5(u5 u5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f51150b = u5Var;
        this.d = i10;
        this.f51152e = callback;
        this.f51151c = zArr;
        this.f51153f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f51149a) {
            case 0:
                if (this.d > 0) {
                    this.f51150b.S();
                }
                Utilities.Callback callback = this.f51152e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f51151c[0] = true;
                Utilities.Callback callback2 = this.f51153f;
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
                this.f51151c[0] = true;
                if (this.d > 0) {
                    this.f51150b.S();
                }
                Utilities.Callback callback3 = this.f51152e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f51153f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public b5(u5 u5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f51150b = u5Var;
        this.f51151c = zArr;
        this.d = i10;
        this.f51152e = callback;
        this.f51153f = callback2;
    }
}

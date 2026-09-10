package xh;

import org.telegram.messenger.Utilities;
public final class b5 implements Utilities.Callback {
    public final int f45276a = 0;
    public final v5 f45277b;
    public final boolean[] f45278c;
    public final int d;
    public final Utilities.Callback e;
    public final Utilities.Callback f45279f;

    public b5(v5 v5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f45277b = v5Var;
        this.d = i10;
        this.e = callback;
        this.f45278c = zArr;
        this.f45279f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f45276a) {
            case 0:
                if (this.d > 0) {
                    this.f45277b.S();
                }
                Utilities.Callback callback = this.e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f45278c[0] = true;
                Utilities.Callback callback2 = this.f45279f;
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
                this.f45278c[0] = true;
                if (this.d > 0) {
                    this.f45277b.S();
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
                Utilities.Callback callback4 = this.f45279f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public b5(v5 v5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f45277b = v5Var;
        this.f45278c = zArr;
        this.d = i10;
        this.e = callback;
        this.f45279f = callback2;
    }
}

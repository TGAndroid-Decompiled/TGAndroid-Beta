package yh;

import org.telegram.messenger.Utilities;
public final class u4 implements Utilities.Callback {
    public final int f53284a = 0;
    public final m5 f53285b;
    public final boolean[] f53286c;
    public final int d;
    public final Utilities.Callback f53287e;
    public final Utilities.Callback f53288f;

    public u4(m5 m5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f53285b = m5Var;
        this.d = i10;
        this.f53287e = callback;
        this.f53286c = zArr;
        this.f53288f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f53284a) {
            case 0:
                if (this.d > 0) {
                    this.f53285b.S();
                }
                Utilities.Callback callback = this.f53287e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f53286c[0] = true;
                Utilities.Callback callback2 = this.f53288f;
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
                this.f53286c[0] = true;
                if (this.d > 0) {
                    this.f53285b.S();
                }
                Utilities.Callback callback3 = this.f53287e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f53288f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public u4(m5 m5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f53285b = m5Var;
        this.f53286c = zArr;
        this.d = i10;
        this.f53287e = callback;
        this.f53288f = callback2;
    }
}

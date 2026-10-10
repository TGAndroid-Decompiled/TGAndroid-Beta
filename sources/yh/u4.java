package yh;

import org.telegram.messenger.Utilities;
public final class u4 implements Utilities.Callback {
    public final int f53330a = 0;
    public final m5 f53331b;
    public final boolean[] f53332c;
    public final int d;
    public final Utilities.Callback f53333e;
    public final Utilities.Callback f53334f;

    public u4(m5 m5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f53331b = m5Var;
        this.d = i10;
        this.f53333e = callback;
        this.f53332c = zArr;
        this.f53334f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f53330a) {
            case 0:
                if (this.d > 0) {
                    this.f53331b.S();
                }
                Utilities.Callback callback = this.f53333e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f53332c[0] = true;
                Utilities.Callback callback2 = this.f53334f;
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
                this.f53332c[0] = true;
                if (this.d > 0) {
                    this.f53331b.S();
                }
                Utilities.Callback callback3 = this.f53333e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f53334f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public u4(m5 m5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f53331b = m5Var;
        this.f53332c = zArr;
        this.d = i10;
        this.f53333e = callback;
        this.f53334f = callback2;
    }
}

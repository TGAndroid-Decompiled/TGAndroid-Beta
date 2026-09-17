package zh;

import org.telegram.messenger.Utilities;
public final class z4 implements Utilities.Callback {
    public final int f52946a = 0;
    public final s5 f52947b;
    public final boolean[] f52948c;
    public final int d;
    public final Utilities.Callback f52949e;
    public final Utilities.Callback f52950f;

    public z4(s5 s5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f52947b = s5Var;
        this.d = i10;
        this.f52949e = callback;
        this.f52948c = zArr;
        this.f52950f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f52946a) {
            case 0:
                if (this.d > 0) {
                    this.f52947b.S();
                }
                Utilities.Callback callback = this.f52949e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f52948c[0] = true;
                Utilities.Callback callback2 = this.f52950f;
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
                this.f52948c[0] = true;
                if (this.d > 0) {
                    this.f52947b.S();
                }
                Utilities.Callback callback3 = this.f52949e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f52950f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public z4(s5 s5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f52947b = s5Var;
        this.f52948c = zArr;
        this.d = i10;
        this.f52949e = callback;
        this.f52950f = callback2;
    }
}

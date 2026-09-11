package zh;

import org.telegram.messenger.Utilities;
public final class z4 implements Utilities.Callback {
    public final int f52914a = 0;
    public final s5 f52915b;
    public final boolean[] f52916c;
    public final int d;
    public final Utilities.Callback f52917e;
    public final Utilities.Callback f52918f;

    public z4(s5 s5Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f52915b = s5Var;
        this.d = i10;
        this.f52917e = callback;
        this.f52916c = zArr;
        this.f52918f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f52914a) {
            case 0:
                if (this.d > 0) {
                    this.f52915b.S();
                }
                Utilities.Callback callback = this.f52917e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f52916c[0] = true;
                Utilities.Callback callback2 = this.f52918f;
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
                this.f52916c[0] = true;
                if (this.d > 0) {
                    this.f52915b.S();
                }
                Utilities.Callback callback3 = this.f52917e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f52918f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public z4(s5 s5Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f52915b = s5Var;
        this.f52916c = zArr;
        this.d = i10;
        this.f52917e = callback;
        this.f52918f = callback2;
    }
}

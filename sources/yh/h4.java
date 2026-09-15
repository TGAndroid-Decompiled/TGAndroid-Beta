package yh;

import org.telegram.messenger.Utilities;
public final class h4 implements Utilities.Callback2 {
    public final int f47248a = 0;
    public final boolean[] f47249b;
    public final Utilities.Callback2 f47250c;
    public final Utilities.Callback d;

    public h4(Utilities.Callback callback, boolean[] zArr, Utilities.Callback2 callback2) {
        this.d = callback;
        this.f47249b = zArr;
        this.f47250c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        Long l4 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f47248a) {
            case 0:
                Utilities.Callback callback = this.d;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f47249b[0] = true;
                Utilities.Callback2 callback2 = this.f47250c;
                if (callback2 != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    callback2.run(str, l4);
                    return;
                }
                return;
            default:
                this.f47249b[0] = true;
                Utilities.Callback2 callback22 = this.f47250c;
                if (callback22 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback22.run(str2, l4);
                }
                Utilities.Callback callback3 = this.d;
                if (callback3 != null) {
                    callback3.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public h4(boolean[] zArr, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.f47249b = zArr;
        this.f47250c = callback2;
        this.d = callback;
    }
}

package yh;

import org.telegram.messenger.Utilities;
public final class e4 implements Utilities.Callback2 {
    public final int f51225a = 0;
    public final boolean[] f51226b;
    public final Utilities.Callback2 f51227c;
    public final Utilities.Callback d;

    public e4(Utilities.Callback callback, boolean[] zArr, Utilities.Callback2 callback2) {
        this.d = callback;
        this.f51226b = zArr;
        this.f51227c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        Long l4 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f51225a) {
            case 0:
                Utilities.Callback callback = this.d;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f51226b[0] = true;
                Utilities.Callback2 callback2 = this.f51227c;
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
                this.f51226b[0] = true;
                Utilities.Callback2 callback22 = this.f51227c;
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

    public e4(boolean[] zArr, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.f51226b = zArr;
        this.f51227c = callback2;
        this.d = callback;
    }
}

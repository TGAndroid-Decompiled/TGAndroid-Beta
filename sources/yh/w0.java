package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w0 implements Utilities.Callback {
    public final int f48149a;
    public final Utilities.Callback f48150b;

    public w0(int i10, Utilities.Callback callback) {
        this.f48149a = i10;
        this.f48150b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48149a) {
            case 0:
                this.f48150b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f48150b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

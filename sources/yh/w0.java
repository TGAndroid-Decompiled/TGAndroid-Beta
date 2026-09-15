package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w0 implements Utilities.Callback {
    public final int f47926a;
    public final Utilities.Callback f47927b;

    public w0(int i10, Utilities.Callback callback) {
        this.f47926a = i10;
        this.f47927b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47926a) {
            case 0:
                this.f47927b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f47927b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

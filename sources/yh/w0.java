package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w0 implements Utilities.Callback {
    public final int f47954a;
    public final Utilities.Callback f47955b;

    public w0(int i10, Utilities.Callback callback) {
        this.f47954a = i10;
        this.f47955b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47954a) {
            case 0:
                this.f47955b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f47955b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

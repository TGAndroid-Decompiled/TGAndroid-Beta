package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w0 implements Utilities.Callback {
    public final int f48159a;
    public final Utilities.Callback f48160b;

    public w0(int i10, Utilities.Callback callback) {
        this.f48159a = i10;
        this.f48160b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48159a) {
            case 0:
                this.f48160b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f48160b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w0 implements Utilities.Callback {
    public final int f48161a;
    public final Utilities.Callback f48162b;

    public w0(int i10, Utilities.Callback callback) {
        this.f48161a = i10;
        this.f48162b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48161a) {
            case 0:
                this.f48162b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f48162b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

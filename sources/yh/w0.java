package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w0 implements Utilities.Callback {
    public final int f52140a;
    public final Utilities.Callback f52141b;

    public w0(int i10, Utilities.Callback callback) {
        this.f52140a = i10;
        this.f52141b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f52140a) {
            case 0:
                this.f52141b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f52141b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

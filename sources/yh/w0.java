package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w0 implements Utilities.Callback {
    public final int f47949a;
    public final Utilities.Callback f47950b;

    public w0(int i10, Utilities.Callback callback) {
        this.f47949a = i10;
        this.f47950b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47949a) {
            case 0:
                this.f47950b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f47950b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

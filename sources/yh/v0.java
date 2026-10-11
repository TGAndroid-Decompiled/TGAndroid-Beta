package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class v0 implements Utilities.Callback {
    public final int f53423a;
    public final Utilities.Callback f53424b;

    public v0(int i10, Utilities.Callback callback) {
        this.f53423a = i10;
        this.f53424b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f53423a) {
            case 0:
                this.f53424b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f53424b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

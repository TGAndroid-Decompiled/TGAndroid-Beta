package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class v0 implements Utilities.Callback {
    public final int f53300a;
    public final Utilities.Callback f53301b;

    public v0(int i10, Utilities.Callback callback) {
        this.f53300a = i10;
        this.f53301b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f53300a) {
            case 0:
                this.f53301b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f53301b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

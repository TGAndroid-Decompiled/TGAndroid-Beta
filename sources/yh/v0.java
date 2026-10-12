package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class v0 implements Utilities.Callback {
    public final int f53526a;
    public final Utilities.Callback f53527b;

    public v0(int i10, Utilities.Callback callback) {
        this.f53526a = i10;
        this.f53527b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f53526a) {
            case 0:
                this.f53527b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f53527b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

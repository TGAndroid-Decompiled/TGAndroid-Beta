package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w0 implements Utilities.Callback {
    public final int f46205a;
    public final Utilities.Callback f46206b;

    public w0(int i10, Utilities.Callback callback) {
        this.f46205a = i10;
        this.f46206b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46205a) {
            case 0:
                this.f46206b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f46206b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class v0 implements Utilities.Callback {
    public final int f51228a;
    public final Utilities.Callback f51229b;

    public v0(int i10, Utilities.Callback callback) {
        this.f51228a = i10;
        this.f51229b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f51228a) {
            case 0:
                this.f51229b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f51229b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

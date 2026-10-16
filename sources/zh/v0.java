package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class v0 implements Utilities.Callback {
    public final int f51229a;
    public final Utilities.Callback f51230b;

    public v0(int i10, Utilities.Callback callback) {
        this.f51229a = i10;
        this.f51230b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f51229a) {
            case 0:
                this.f51230b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f51230b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

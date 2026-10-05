package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class x0 implements Utilities.Callback {
    public final int f52211a;
    public final Utilities.Callback f52212b;

    public x0(int i10, Utilities.Callback callback) {
        this.f52211a = i10;
        this.f52212b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f52211a) {
            case 0:
                this.f52212b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f52212b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

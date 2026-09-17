package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w0 implements Utilities.Callback {
    public final int f52744a;
    public final Utilities.Callback f52745b;

    public w0(int i10, Utilities.Callback callback) {
        this.f52744a = i10;
        this.f52745b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f52744a) {
            case 0:
                this.f52745b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f52745b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w0 implements Utilities.Callback {
    public final int f52774a;
    public final Utilities.Callback f52775b;

    public w0(int i10, Utilities.Callback callback) {
        this.f52774a = i10;
        this.f52775b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f52774a) {
            case 0:
                this.f52775b.run((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f52775b;
                if (callback != null) {
                    callback.run(bool);
                    return;
                }
                return;
        }
    }
}

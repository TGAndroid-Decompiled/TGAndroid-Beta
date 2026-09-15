package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class b2 implements Utilities.Callback2 {
    public final int f47007a;
    public final a4 f47008b;
    public final TL_stars.TL_starGiftUnique f47009c;

    public b2(a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f47007a = i10;
        this.f47008b = a4Var;
        this.f47009c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f47007a) {
            case 0:
                a4.j0(this.f47008b, this.f47009c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                a4.h0(this.f47008b, this.f47009c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                a4.O0(this.f47008b, this.f47009c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

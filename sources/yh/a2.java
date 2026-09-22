package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class a2 implements Utilities.Callback2 {
    public final int f47244a;
    public final y3 f47245b;
    public final TL_stars.TL_starGiftUnique f47246c;

    public a2(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f47244a = i10;
        this.f47245b = y3Var;
        this.f47246c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f47244a) {
            case 0:
                y3.j0(this.f47245b, this.f47246c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                y3.h0(this.f47245b, this.f47246c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                y3.O0(this.f47245b, this.f47246c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

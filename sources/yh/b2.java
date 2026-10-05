package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class b2 implements Utilities.Callback2 {
    public final int f51141a;
    public final y3 f51142b;
    public final TL_stars.TL_starGiftUnique f51143c;

    public b2(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f51141a = i10;
        this.f51142b = y3Var;
        this.f51143c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f51141a) {
            case 0:
                y3.i0(this.f51142b, this.f51143c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                y3.g0(this.f51142b, this.f51143c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                y3.O0(this.f51142b, this.f51143c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class a2 implements Utilities.Callback2 {
    public final int f47245a;
    public final x3 f47246b;
    public final TL_stars.TL_starGiftUnique f47247c;

    public a2(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f47245a = i10;
        this.f47246b = x3Var;
        this.f47247c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f47245a) {
            case 0:
                x3.i0(this.f47246b, this.f47247c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                x3.g0(this.f47246b, this.f47247c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                x3.O0(this.f47246b, this.f47247c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

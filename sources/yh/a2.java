package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class a2 implements Utilities.Callback2 {
    public final int f51082a;
    public final x3 f51083b;
    public final TL_stars.TL_starGiftUnique f51084c;

    public a2(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f51082a = i10;
        this.f51083b = x3Var;
        this.f51084c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f51082a) {
            case 0:
                x3.i0(this.f51083b, this.f51084c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                x3.g0(this.f51083b, this.f51084c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                x3.O0(this.f51083b, this.f51084c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

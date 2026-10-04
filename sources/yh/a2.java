package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class a2 implements Utilities.Callback2 {
    public final int f51081a;
    public final x3 f51082b;
    public final TL_stars.TL_starGiftUnique f51083c;

    public a2(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f51081a = i10;
        this.f51082b = x3Var;
        this.f51083c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f51081a) {
            case 0:
                x3.i0(this.f51082b, this.f51083c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                x3.g0(this.f51082b, this.f51083c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                x3.O0(this.f51082b, this.f51083c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

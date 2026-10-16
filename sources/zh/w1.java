package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w1 implements Utilities.Callback2 {
    public final int f51264a;
    public final r3 f51265b;
    public final TL_stars.TL_starGiftUnique f51266c;

    public w1(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f51264a = i10;
        this.f51265b = r3Var;
        this.f51266c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f51264a) {
            case 0:
                r3.j0(this.f51265b, this.f51266c, (ag.a) obj, (Runnable) obj2);
                return;
            case 1:
                r3.h0(this.f51265b, this.f51266c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                r3.P0(this.f51265b, this.f51266c, (ag.a) obj, (Runnable) obj2);
                return;
        }
    }
}

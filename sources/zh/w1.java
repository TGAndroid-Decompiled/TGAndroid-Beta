package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class w1 implements Utilities.Callback2 {
    public final int f51263a;
    public final r3 f51264b;
    public final TL_stars.TL_starGiftUnique f51265c;

    public w1(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f51263a = i10;
        this.f51264b = r3Var;
        this.f51265c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f51263a) {
            case 0:
                r3.j0(this.f51264b, this.f51265c, (ag.a) obj, (Runnable) obj2);
                return;
            case 1:
                r3.h0(this.f51264b, this.f51265c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                r3.P0(this.f51264b, this.f51265c, (ag.a) obj, (Runnable) obj2);
                return;
        }
    }
}

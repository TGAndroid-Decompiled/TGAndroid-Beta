package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements Utilities.Callback2 {
    public final int f52907a;
    public final w3 f52908b;
    public final TL_stars.TL_starGiftUnique f52909c;

    public z1(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f52907a = i10;
        this.f52908b = w3Var;
        this.f52909c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f52907a) {
            case 0:
                w3.j0(this.f52908b, this.f52909c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                w3.h0(this.f52908b, this.f52909c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                w3.O0(this.f52908b, this.f52909c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

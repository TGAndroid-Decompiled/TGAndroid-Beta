package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class a2 implements Utilities.Callback2 {
    public final int f45236a;
    public final x3 f45237b;
    public final TL_stars.TL_starGiftUnique f45238c;

    public a2(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f45236a = i10;
        this.f45237b = x3Var;
        this.f45238c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f45236a) {
            case 0:
                x3.j0(this.f45237b, this.f45238c, (yf.a) obj, (Runnable) obj2);
                return;
            case 1:
                x3.h0(this.f45237b, this.f45238c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                x3.O0(this.f45237b, this.f45238c, (yf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

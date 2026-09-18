package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class b2 implements Utilities.Callback2 {
    public final int f47035a;
    public final a4 f47036b;
    public final TL_stars.TL_starGiftUnique f47037c;

    public b2(a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f47035a = i10;
        this.f47036b = a4Var;
        this.f47037c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f47035a) {
            case 0:
                a4.j0(this.f47036b, this.f47037c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                a4.h0(this.f47036b, this.f47037c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                a4.O0(this.f47036b, this.f47037c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

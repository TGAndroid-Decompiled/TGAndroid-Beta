package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class b2 implements Utilities.Callback2 {
    public final int f47030a;
    public final a4 f47031b;
    public final TL_stars.TL_starGiftUnique f47032c;

    public b2(a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f47030a = i10;
        this.f47031b = a4Var;
        this.f47032c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f47030a) {
            case 0:
                a4.j0(this.f47031b, this.f47032c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                a4.h0(this.f47031b, this.f47032c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                a4.O0(this.f47031b, this.f47032c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class a2 implements Utilities.Callback2 {
    public final int f46914a;
    public final z3 f46915b;
    public final TL_stars.TL_starGiftUnique f46916c;

    public a2(z3 z3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f46914a = i10;
        this.f46915b = z3Var;
        this.f46916c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f46914a) {
            case 0:
                z3.j0(this.f46915b, this.f46916c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                z3.h0(this.f46915b, this.f46916c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                z3.O0(this.f46915b, this.f46916c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

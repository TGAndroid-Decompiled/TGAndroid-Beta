package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class a2 implements Utilities.Callback2 {
    public final int f46872a;
    public final y3 f46873b;
    public final TL_stars.TL_starGiftUnique f46874c;

    public a2(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f46872a = i10;
        this.f46873b = y3Var;
        this.f46874c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f46872a) {
            case 0:
                y3.i0(this.f46873b, this.f46874c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                y3.g0(this.f46873b, this.f46874c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                y3.O0(this.f46873b, this.f46874c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class x1 implements Utilities.Callback2 {
    public final int f53408a;
    public final s3 f53409b;
    public final TL_stars.TL_starGiftUnique f53410c;

    public x1(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f53408a = i10;
        this.f53409b = s3Var;
        this.f53410c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f53408a) {
            case 0:
                s3.j0(this.f53409b, this.f53410c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                s3.h0(this.f53409b, this.f53410c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                s3.P0(this.f53409b, this.f53410c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class x1 implements Utilities.Callback2 {
    public final int f53599a;
    public final s3 f53600b;
    public final TL_stars.TL_starGiftUnique f53601c;

    public x1(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f53599a = i10;
        this.f53600b = s3Var;
        this.f53601c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f53599a) {
            case 0:
                s3.j0(this.f53600b, this.f53601c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                s3.h0(this.f53600b, this.f53601c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                s3.P0(this.f53600b, this.f53601c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

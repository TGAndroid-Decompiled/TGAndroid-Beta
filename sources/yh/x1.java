package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class x1 implements Utilities.Callback2 {
    public final int f53588a;
    public final s3 f53589b;
    public final TL_stars.TL_starGiftUnique f53590c;

    public x1(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f53588a = i10;
        this.f53589b = s3Var;
        this.f53590c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f53588a) {
            case 0:
                s3.j0(this.f53589b, this.f53590c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                s3.h0(this.f53589b, this.f53590c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                s3.P0(this.f53589b, this.f53590c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

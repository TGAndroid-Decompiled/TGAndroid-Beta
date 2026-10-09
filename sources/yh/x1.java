package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class x1 implements Utilities.Callback2 {
    public final int f53362a;
    public final s3 f53363b;
    public final TL_stars.TL_starGiftUnique f53364c;

    public x1(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f53362a = i10;
        this.f53363b = s3Var;
        this.f53364c = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f53362a) {
            case 0:
                s3.j0(this.f53363b, this.f53364c, (zf.a) obj, (Runnable) obj2);
                return;
            case 1:
                s3.h0(this.f53363b, this.f53364c, (Utilities.Callback) obj, (Boolean) obj2);
                return;
            default:
                s3.P0(this.f53363b, this.f53364c, (zf.a) obj, (Runnable) obj2);
                return;
        }
    }
}

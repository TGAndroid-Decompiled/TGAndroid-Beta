package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 implements RequestDelegate {
    public final int f47241a;
    public final y3 f47242b;
    public final TL_stars.TL_starGiftUnique f47243c;
    public final zf.a d;
    public final Runnable e;

    public a1(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f47241a = i10;
        this.f47242b = y3Var;
        this.f47243c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47241a) {
            case 0:
                y3.M0(this.f47242b, this.f47243c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                y3.t0(this.f47242b, this.f47243c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}

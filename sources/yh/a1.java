package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 implements RequestDelegate {
    public final int f47193a;
    public final x3 f47194b;
    public final TL_stars.TL_starGiftUnique f47195c;
    public final zf.a d;
    public final Runnable e;

    public a1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f47193a = i10;
        this.f47194b = x3Var;
        this.f47195c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47193a) {
            case 0:
                x3.M0(this.f47194b, this.f47195c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                x3.t0(this.f47194b, this.f47195c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}

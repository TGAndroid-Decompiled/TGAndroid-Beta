package xh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 implements RequestDelegate {
    public final int f45233a;
    public final x3 f45234b;
    public final TL_stars.TL_starGiftUnique f45235c;
    public final yf.a d;
    public final Runnable e;

    public a1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, yf.a aVar, Runnable runnable, int i10) {
        this.f45233a = i10;
        this.f45234b = x3Var;
        this.f45235c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45233a) {
            case 0:
                x3.M0(this.f45234b, this.f45235c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                x3.t0(this.f45234b, this.f45235c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}

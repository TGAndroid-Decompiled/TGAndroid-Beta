package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c1 implements RequestDelegate {
    public final int f51173a;
    public final y3 f51174b;
    public final TL_stars.TL_starGiftUnique f51175c;
    public final zf.a d;
    public final Runnable f51176e;

    public c1(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f51173a = i10;
        this.f51174b = y3Var;
        this.f51175c = tL_starGiftUnique;
        this.d = aVar;
        this.f51176e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51173a) {
            case 0:
                y3.M0(this.f51174b, this.f51175c, this.d, this.f51176e, tLObject, tL_error);
                return;
            default:
                y3.t0(this.f51174b, this.f51175c, this.d, this.f51176e, tLObject, tL_error);
                return;
        }
    }
}

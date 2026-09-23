package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 implements RequestDelegate {
    public final int f46869a;
    public final y3 f46870b;
    public final TL_stars.TL_starGiftUnique f46871c;
    public final zf.a d;
    public final Runnable e;

    public a1(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f46869a = i10;
        this.f46870b = y3Var;
        this.f46871c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46869a) {
            case 0:
                y3.M0(this.f46870b, this.f46871c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                y3.t0(this.f46870b, this.f46871c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}

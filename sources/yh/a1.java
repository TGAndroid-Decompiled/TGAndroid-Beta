package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 implements RequestDelegate {
    public final int f46946a;
    public final a4 f46947b;
    public final TL_stars.TL_starGiftUnique f46948c;
    public final zf.a d;
    public final Runnable e;

    public a1(a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f46946a = i10;
        this.f46947b = a4Var;
        this.f46948c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46946a) {
            case 0:
                a4.M0(this.f46947b, this.f46948c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                a4.t0(this.f46947b, this.f46948c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}

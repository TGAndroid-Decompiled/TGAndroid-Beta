package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 implements RequestDelegate {
    public final int f51077a;
    public final x3 f51078b;
    public final TL_stars.TL_starGiftUnique f51079c;
    public final zf.a d;
    public final Runnable f51080e;

    public a1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f51077a = i10;
        this.f51078b = x3Var;
        this.f51079c = tL_starGiftUnique;
        this.d = aVar;
        this.f51080e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51077a) {
            case 0:
                x3.M0(this.f51078b, this.f51079c, this.d, this.f51080e, tLObject, tL_error);
                return;
            default:
                x3.t0(this.f51078b, this.f51079c, this.d, this.f51080e, tLObject, tL_error);
                return;
        }
    }
}

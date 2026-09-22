package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 implements RequestDelegate {
    public final int f46911a;
    public final z3 f46912b;
    public final TL_stars.TL_starGiftUnique f46913c;
    public final zf.a d;
    public final Runnable e;

    public a1(z3 z3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f46911a = i10;
        this.f46912b = z3Var;
        this.f46913c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46911a) {
            case 0:
                z3.M0(this.f46912b, this.f46913c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                z3.t0(this.f46912b, this.f46913c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}

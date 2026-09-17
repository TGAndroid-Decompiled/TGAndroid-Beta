package zh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 implements RequestDelegate {
    public final int f51668a;
    public final w3 f51669b;
    public final TL_stars.TL_starGiftUnique f51670c;
    public final zf.a d;
    public final Runnable f51671e;

    public a1(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f51668a = i10;
        this.f51669b = w3Var;
        this.f51670c = tL_starGiftUnique;
        this.d = aVar;
        this.f51671e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51668a) {
            case 0:
                w3.M0(this.f51669b, this.f51670c, this.d, this.f51671e, tLObject, tL_error);
                return;
            default:
                w3.t0(this.f51669b, this.f51670c, this.d, this.f51671e, tLObject, tL_error);
                return;
        }
    }
}

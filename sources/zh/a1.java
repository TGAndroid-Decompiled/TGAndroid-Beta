package zh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 implements RequestDelegate {
    public final int f51698a;
    public final w3 f51699b;
    public final TL_stars.TL_starGiftUnique f51700c;
    public final zf.a d;
    public final Runnable f51701e;

    public a1(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f51698a = i10;
        this.f51699b = w3Var;
        this.f51700c = tL_starGiftUnique;
        this.d = aVar;
        this.f51701e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51698a) {
            case 0:
                w3.M0(this.f51699b, this.f51700c, this.d, this.f51701e, tLObject, tL_error);
                return;
            default:
                w3.t0(this.f51699b, this.f51700c, this.d, this.f51701e, tLObject, tL_error);
                return;
        }
    }
}

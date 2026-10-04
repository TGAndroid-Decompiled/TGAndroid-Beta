package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 implements RequestDelegate {
    public final int f51084a;
    public final x3 f51085b;
    public final TL_stars.TL_starGiftUnique f51086c;
    public final zf.a d;
    public final Runnable f51087e;

    public a1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f51084a = i10;
        this.f51085b = x3Var;
        this.f51086c = tL_starGiftUnique;
        this.d = aVar;
        this.f51087e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51084a) {
            case 0:
                x3.M0(this.f51085b, this.f51086c, this.d, this.f51087e, tLObject, tL_error);
                return;
            default:
                x3.t0(this.f51085b, this.f51086c, this.d, this.f51087e, tLObject, tL_error);
                return;
        }
    }
}

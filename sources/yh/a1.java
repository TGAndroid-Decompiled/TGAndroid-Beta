package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 implements RequestDelegate {
    public final int f51078a;
    public final x3 f51079b;
    public final TL_stars.TL_starGiftUnique f51080c;
    public final zf.a d;
    public final Runnable f51081e;

    public a1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f51078a = i10;
        this.f51079b = x3Var;
        this.f51080c = tL_starGiftUnique;
        this.d = aVar;
        this.f51081e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51078a) {
            case 0:
                x3.M0(this.f51079b, this.f51080c, this.d, this.f51081e, tLObject, tL_error);
                return;
            default:
                x3.t0(this.f51079b, this.f51080c, this.d, this.f51081e, tLObject, tL_error);
                return;
        }
    }
}

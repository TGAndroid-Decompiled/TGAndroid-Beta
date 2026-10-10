package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z0 implements RequestDelegate {
    public final int f53498a;
    public final s3 f53499b;
    public final TL_stars.TL_starGiftUnique f53500c;
    public final zf.a d;
    public final Runnable f53501e;

    public z0(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f53498a = i10;
        this.f53499b = s3Var;
        this.f53500c = tL_starGiftUnique;
        this.d = aVar;
        this.f53501e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53498a) {
            case 0:
                s3.N0(this.f53499b, this.f53500c, this.d, this.f53501e, tLObject, tL_error);
                return;
            default:
                s3.u0(this.f53499b, this.f53500c, this.d, this.f53501e, tLObject, tL_error);
                return;
        }
    }
}

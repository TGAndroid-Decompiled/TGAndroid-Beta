package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z0 implements RequestDelegate {
    public final int f53683a;
    public final s3 f53684b;
    public final TL_stars.TL_starGiftUnique f53685c;
    public final zf.a d;
    public final Runnable f53686e;

    public z0(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f53683a = i10;
        this.f53684b = s3Var;
        this.f53685c = tL_starGiftUnique;
        this.d = aVar;
        this.f53686e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53683a) {
            case 0:
                s3.N0(this.f53684b, this.f53685c, this.d, this.f53686e, tLObject, tL_error);
                return;
            default:
                s3.u0(this.f53684b, this.f53685c, this.d, this.f53686e, tLObject, tL_error);
                return;
        }
    }
}

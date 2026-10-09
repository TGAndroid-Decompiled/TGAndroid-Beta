package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z0 implements RequestDelegate {
    public final int f53454a;
    public final s3 f53455b;
    public final TL_stars.TL_starGiftUnique f53456c;
    public final zf.a d;
    public final Runnable f53457e;

    public z0(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f53454a = i10;
        this.f53455b = s3Var;
        this.f53456c = tL_starGiftUnique;
        this.d = aVar;
        this.f53457e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53454a) {
            case 0:
                s3.N0(this.f53455b, this.f53456c, this.d, this.f53457e, tLObject, tL_error);
                return;
            default:
                s3.u0(this.f53455b, this.f53456c, this.d, this.f53457e, tLObject, tL_error);
                return;
        }
    }
}

package yh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z0 implements RequestDelegate {
    public final int f53575a;
    public final s3 f53576b;
    public final TL_stars.TL_starGiftUnique f53577c;
    public final zf.a d;
    public final Runnable f53578e;

    public z0(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f53575a = i10;
        this.f53576b = s3Var;
        this.f53577c = tL_starGiftUnique;
        this.d = aVar;
        this.f53578e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53575a) {
            case 0:
                s3.N0(this.f53576b, this.f53577c, this.d, this.f53578e, tLObject, tL_error);
                return;
            default:
                s3.u0(this.f53576b, this.f53577c, this.d, this.f53578e, tLObject, tL_error);
                return;
        }
    }
}

package zh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z0 implements RequestDelegate {
    public final int f51364a;
    public final r3 f51365b;
    public final TL_stars.TL_starGiftUnique f51366c;
    public final ag.a d;
    public final Runnable e;

    public z0(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.f51364a = i10;
        this.f51365b = r3Var;
        this.f51366c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51364a) {
            case 0:
                r3.N0(this.f51365b, this.f51366c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                r3.u0(this.f51365b, this.f51366c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}

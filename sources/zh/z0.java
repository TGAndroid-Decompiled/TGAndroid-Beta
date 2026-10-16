package zh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z0 implements RequestDelegate {
    public final int f51365a;
    public final r3 f51366b;
    public final TL_stars.TL_starGiftUnique f51367c;
    public final ag.a d;
    public final Runnable e;

    public z0(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.f51365a = i10;
        this.f51366b = r3Var;
        this.f51367c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51365a) {
            case 0:
                r3.N0(this.f51366b, this.f51367c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                r3.u0(this.f51366b, this.f51367c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}

package wg;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n implements RequestDelegate {
    public final int f59835a;
    public final x10 f59836b;
    public final x10 f59837c;

    public n(x10 x10Var, x10 x10Var2, int i7) {
        this.f59835a = i7;
        this.f59836b = x10Var;
        this.f59837c = x10Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f59835a) {
            case 0:
                org.telegram.messenger.g0.g3(new p(tL_error, this.f59836b, this.f59837c, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new p4.s0(tL_error, this.f59836b, tLObject, this.f59837c, 6));
                return;
        }
    }
}

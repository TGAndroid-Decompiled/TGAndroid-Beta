package wg;

import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n implements RequestDelegate {
    public final int f59906a;
    public final w10 f59907b;
    public final w10 f59908c;

    public n(w10 w10Var, w10 w10Var2, int i7) {
        this.f59906a = i7;
        this.f59907b = w10Var;
        this.f59908c = w10Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f59906a) {
            case 0:
                org.telegram.messenger.g0.g3(new p(tL_error, this.f59907b, this.f59908c, 1));
                return;
            default:
                org.telegram.messenger.g0.g3(new p4.l0(tL_error, this.f59907b, tLObject, this.f59908c, 7));
                return;
        }
    }
}

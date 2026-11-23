package wg;

import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n implements RequestDelegate {
    public final int f59804a;
    public final y10 f59805b;
    public final y10 f59806c;

    public n(y10 y10Var, y10 y10Var2, int i7) {
        this.f59804a = i7;
        this.f59805b = y10Var;
        this.f59806c = y10Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f59804a) {
            case 0:
                org.telegram.messenger.g0.g3(new p(tL_error, this.f59805b, this.f59806c, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new p4.s0(tL_error, this.f59805b, tLObject, this.f59806c, 6));
                return;
        }
    }
}

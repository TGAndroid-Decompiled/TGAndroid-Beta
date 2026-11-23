package wg;

import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n implements RequestDelegate {
    public final int f59839a;
    public final y10 f59840b;
    public final y10 f59841c;

    public n(y10 y10Var, y10 y10Var2, int i7) {
        this.f59839a = i7;
        this.f59840b = y10Var;
        this.f59841c = y10Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f59839a) {
            case 0:
                org.telegram.messenger.g0.g3(new p(tL_error, this.f59840b, this.f59841c, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new p4.s0(tL_error, this.f59840b, tLObject, this.f59841c, 6));
                return;
        }
    }
}

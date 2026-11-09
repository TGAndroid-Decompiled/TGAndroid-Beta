package wg;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s31;
public final class n implements RequestDelegate {
    public final int f57779a;
    public final c20 f57780b;
    public final c20 f57781c;

    public n(c20 c20Var, c20 c20Var2, int i7) {
        this.f57779a = i7;
        this.f57780b = c20Var;
        this.f57781c = c20Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f57779a) {
            case 0:
                org.telegram.messenger.g0.h3(new s31(tL_error, this.f57780b, this.f57781c));
                return;
            default:
                org.telegram.messenger.g0.h3(new q(tL_error, this.f57780b, tLObject, this.f57781c));
                return;
        }
    }
}

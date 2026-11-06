package wg;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l31;
public final class n implements RequestDelegate {
    public final int f57664a;
    public final c20 f57665b;
    public final c20 f57666c;

    public n(c20 c20Var, c20 c20Var2, int i7) {
        this.f57664a = i7;
        this.f57665b = c20Var;
        this.f57666c = c20Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f57664a) {
            case 0:
                org.telegram.messenger.g0.h3(new l31(tL_error, this.f57665b, this.f57666c));
                return;
            default:
                org.telegram.messenger.g0.h3(new r(tL_error, this.f57665b, tLObject, this.f57666c));
                return;
        }
    }
}

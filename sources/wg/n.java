package wg;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r31;
public final class n implements RequestDelegate {
    public final int f57781a;
    public final c20 f57782b;
    public final c20 f57783c;

    public n(c20 c20Var, c20 c20Var2, int i7) {
        this.f57781a = i7;
        this.f57782b = c20Var;
        this.f57783c = c20Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f57781a) {
            case 0:
                org.telegram.messenger.g0.h3(new r31(tL_error, this.f57782b, this.f57783c));
                return;
            default:
                org.telegram.messenger.g0.h3(new r(tL_error, this.f57782b, tLObject, this.f57783c));
                return;
        }
    }
}

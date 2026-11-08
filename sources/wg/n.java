package wg;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r31;
public final class n implements RequestDelegate {
    public final int f57780a;
    public final c20 f57781b;
    public final c20 f57782c;

    public n(c20 c20Var, c20 c20Var2, int i7) {
        this.f57780a = i7;
        this.f57781b = c20Var;
        this.f57782c = c20Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f57780a) {
            case 0:
                org.telegram.messenger.g0.h3(new r31(tL_error, this.f57781b, this.f57782c));
                return;
            default:
                org.telegram.messenger.g0.h3(new r(tL_error, this.f57781b, tLObject, this.f57782c));
                return;
        }
    }
}

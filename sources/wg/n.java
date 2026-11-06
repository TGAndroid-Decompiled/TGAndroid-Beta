package wg;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q31;
public final class n implements RequestDelegate {
    public final int f57689a;
    public final c20 f57690b;
    public final c20 f57691c;

    public n(c20 c20Var, c20 c20Var2, int i7) {
        this.f57689a = i7;
        this.f57690b = c20Var;
        this.f57691c = c20Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f57689a) {
            case 0:
                org.telegram.messenger.g0.h3(new q31(tL_error, this.f57690b, this.f57691c));
                return;
            default:
                org.telegram.messenger.g0.h3(new r(tL_error, this.f57690b, tLObject, this.f57691c));
                return;
        }
    }
}

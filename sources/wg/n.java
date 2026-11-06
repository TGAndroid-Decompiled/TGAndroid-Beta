package wg;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r31;
public final class n implements RequestDelegate {
    public final int f57688a;
    public final c20 f57689b;
    public final c20 f57690c;

    public n(c20 c20Var, c20 c20Var2, int i7) {
        this.f57688a = i7;
        this.f57689b = c20Var;
        this.f57690c = c20Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f57688a) {
            case 0:
                org.telegram.messenger.g0.h3(new r31(tL_error, this.f57689b, this.f57690c));
                return;
            default:
                org.telegram.messenger.g0.h3(new r(tL_error, this.f57689b, tLObject, this.f57690c));
                return;
        }
    }
}

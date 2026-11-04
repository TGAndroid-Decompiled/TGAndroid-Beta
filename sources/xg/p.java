package xg;

import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iv0;
public final class p implements RequestDelegate {
    public final int f58743a;
    public final u10 f58744b;
    public final u10 f58745c;

    public p(u10 u10Var, u10 u10Var2, int i3) {
        this.f58743a = i3;
        this.f58744b = u10Var;
        this.f58745c = u10Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f58743a) {
            case 0:
                org.telegram.messenger.g0.h3(new iv0(tL_error, this.f58744b, this.f58745c, 27));
                return;
            default:
                org.telegram.messenger.g0.h3(new ui.b(tL_error, this.f58744b, tLObject, this.f58745c, 2));
                return;
        }
    }
}

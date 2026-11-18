package wg;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sv0;
public final class n implements RequestDelegate {
    public final int f59794a;
    public final x10 f59795b;
    public final x10 f59796c;

    public n(x10 x10Var, x10 x10Var2, int i7) {
        this.f59794a = i7;
        this.f59795b = x10Var;
        this.f59796c = x10Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f59794a) {
            case 0:
                org.telegram.messenger.g0.g3(new sv0(tL_error, this.f59795b, this.f59796c, 29));
                return;
            default:
                org.telegram.messenger.g0.g3(new p4.s0(tL_error, this.f59795b, tLObject, this.f59796c, 6));
                return;
        }
    }
}

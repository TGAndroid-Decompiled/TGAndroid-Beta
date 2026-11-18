package wg;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sv0;
public final class n implements RequestDelegate {
    public final int f59793a;
    public final x10 f59794b;
    public final x10 f59795c;

    public n(x10 x10Var, x10 x10Var2, int i7) {
        this.f59793a = i7;
        this.f59794b = x10Var;
        this.f59795c = x10Var2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f59793a) {
            case 0:
                org.telegram.messenger.g0.g3(new sv0(tL_error, this.f59794b, this.f59795c, 29));
                return;
            default:
                org.telegram.messenger.g0.g3(new p4.s0(tL_error, this.f59794b, tLObject, this.f59795c, 6));
                return;
        }
    }
}

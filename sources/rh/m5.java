package rh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ow0;
public final class m5 implements RequestDelegate {
    public final int f47216a;
    public final r20 f47217b;

    public m5(r20 r20Var, int i10) {
        this.f47216a = i10;
        this.f47217b = r20Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47216a) {
            case 0:
                org.telegram.messenger.i0.g3(new ow0(tLObject, this.f47217b, 1));
                return;
            default:
                org.telegram.messenger.i0.g3(new th.o0(6, this.f47217b, tL_error));
                return;
        }
    }
}

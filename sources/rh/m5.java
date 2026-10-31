package rh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nw0;
public final class m5 implements RequestDelegate {
    public final int f47202a;
    public final q20 f47203b;

    public m5(q20 q20Var, int i10) {
        this.f47202a = i10;
        this.f47203b = q20Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47202a) {
            case 0:
                org.telegram.messenger.i0.g3(new nw0(tLObject, this.f47203b, 1));
                return;
            default:
                org.telegram.messenger.i0.g3(new th.o0(5, this.f47203b, tL_error));
                return;
        }
    }
}

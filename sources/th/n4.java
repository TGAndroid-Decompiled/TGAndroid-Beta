package th;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t70;
public final class n4 implements RequestDelegate {
    public final long f49270a;
    public final t70 f49271b;
    public final e5 f49272c;

    public n4(e5 e5Var, long j10, t70 t70Var) {
        this.f49272c = e5Var;
        this.f49270a = j10;
        this.f49271b = t70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new ag.a3(this, tLObject, this.f49270a, this.f49271b, 24));
    }
}

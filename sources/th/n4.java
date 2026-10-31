package th;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.u70;
public final class n4 implements RequestDelegate {
    public final long f49256a;
    public final u70 f49257b;
    public final e5 f49258c;

    public n4(e5 e5Var, long j10, u70 u70Var) {
        this.f49258c = e5Var;
        this.f49256a = j10;
        this.f49257b = u70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new ag.a3(this, tLObject, this.f49256a, this.f49257b, 24));
    }
}

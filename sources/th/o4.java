package th;

import org.telegram.messenger.q20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o4 implements RequestDelegate {
    public final long f49277a;
    public final q20 f49278b;
    public final e5 f49279c;

    public o4(e5 e5Var, long j10, q20 q20Var) {
        this.f49279c = e5Var;
        this.f49277a = j10;
        this.f49278b = q20Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new ag.a3(this, tLObject, this.f49277a, this.f49278b, 25));
    }
}

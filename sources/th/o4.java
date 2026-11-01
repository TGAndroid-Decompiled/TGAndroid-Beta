package th;

import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o4 implements RequestDelegate {
    public final long f49291a;
    public final r20 f49292b;
    public final e5 f49293c;

    public o4(e5 e5Var, long j10, r20 r20Var) {
        this.f49293c = e5Var;
        this.f49291a = j10;
        this.f49292b = r20Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new ag.a3(this, tLObject, this.f49291a, this.f49292b, 25));
    }
}

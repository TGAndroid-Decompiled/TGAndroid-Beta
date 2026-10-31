package rh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h1 implements RequestDelegate {
    public final int f46994a = 1;
    public final e4 f46995b;
    public final long f46996c;
    public final long d;
    public final long e;
    public final Object f46997f;

    public h1(e4 e4Var, long j10, long j11, q20 q20Var, long j12) {
        this.f46995b = e4Var;
        this.f46996c = j10;
        this.d = j11;
        this.f46997f = q20Var;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46994a) {
            case 0:
                org.telegram.messenger.i0.g3(new n1(this.f46995b, (org.telegram.ui.ActionBar.x1) this.f46997f, tLObject, this.f46996c, this.d, this.e, tL_error));
                return;
            default:
                org.telegram.messenger.i0.g3(new n1(this.f46995b, tLObject, this.f46996c, this.d, (q20) this.f46997f, tL_error, this.e));
                return;
        }
    }

    public h1(e4 e4Var, org.telegram.ui.ActionBar.x1 x1Var, long j10, long j11, long j12) {
        this.f46995b = e4Var;
        this.f46997f = x1Var;
        this.f46996c = j10;
        this.d = j11;
        this.e = j12;
    }
}

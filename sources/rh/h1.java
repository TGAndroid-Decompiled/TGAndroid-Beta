package rh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h1 implements RequestDelegate {
    public final int f47008a = 1;
    public final e4 f47009b;
    public final long f47010c;
    public final long d;
    public final long e;
    public final Object f47011f;

    public h1(e4 e4Var, long j10, long j11, r20 r20Var, long j12) {
        this.f47009b = e4Var;
        this.f47010c = j10;
        this.d = j11;
        this.f47011f = r20Var;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47008a) {
            case 0:
                org.telegram.messenger.i0.g3(new n1(this.f47009b, (org.telegram.ui.ActionBar.x1) this.f47011f, tLObject, this.f47010c, this.d, this.e, tL_error));
                return;
            default:
                org.telegram.messenger.i0.g3(new n1(this.f47009b, tLObject, this.f47010c, this.d, (r20) this.f47011f, tL_error, this.e));
                return;
        }
    }

    public h1(e4 e4Var, org.telegram.ui.ActionBar.x1 x1Var, long j10, long j11, long j12) {
        this.f47009b = e4Var;
        this.f47011f = x1Var;
        this.f47010c = j10;
        this.d = j11;
        this.e = j12;
    }
}

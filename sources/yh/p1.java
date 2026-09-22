package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f47549a = 1;
    public final z3 f47550b;
    public final TLObject f47551c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f47552f;
    public final long h;
    public final Object f47553n;

    public p1(z3 z3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f47550b = z3Var;
        this.f47551c = tLObject;
        this.d = j3;
        this.e = j10;
        this.f47553n = callback;
        this.f47552f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f47549a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f47552f;
                z3.H0(this.f47550b, (org.telegram.ui.ActionBar.b2) this.f47553n, this.f47551c, this.d, this.e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f47552f;
                long j10 = this.h;
                z3.g0(this.f47550b, this.f47551c, this.d, this.e, (Utilities.Callback) this.f47553n, tL_error2, j10);
                return;
        }
    }

    public p1(z3 z3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f47550b = z3Var;
        this.f47553n = b2Var;
        this.f47551c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f47552f = tL_error;
    }
}

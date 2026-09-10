package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f45852a = 1;
    public final x3 f45853b;
    public final TLObject f45854c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f45855f;
    public final long h;
    public final Object f45856n;

    public p1(x3 x3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f45853b = x3Var;
        this.f45854c = tLObject;
        this.d = j3;
        this.e = j10;
        this.f45856n = callback;
        this.f45855f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f45852a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f45855f;
                x3.H0(this.f45853b, (org.telegram.ui.ActionBar.d2) this.f45856n, this.f45854c, this.d, this.e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f45855f;
                long j10 = this.h;
                x3.g0(this.f45853b, this.f45854c, this.d, this.e, (Utilities.Callback) this.f45856n, tL_error2, j10);
                return;
        }
    }

    public p1(x3 x3Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f45853b = x3Var;
        this.f45856n = d2Var;
        this.f45854c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f45855f = tL_error;
    }
}

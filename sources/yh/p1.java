package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f47525a = 1;
    public final y3 f47526b;
    public final TLObject f47527c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f47528f;
    public final long h;
    public final Object f47529n;

    public p1(y3 y3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f47526b = y3Var;
        this.f47527c = tLObject;
        this.d = j3;
        this.e = j10;
        this.f47529n = callback;
        this.f47528f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f47525a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f47528f;
                y3.H0(this.f47526b, (org.telegram.ui.ActionBar.b2) this.f47529n, this.f47527c, this.d, this.e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f47528f;
                long j10 = this.h;
                y3.f0(this.f47526b, this.f47527c, this.d, this.e, (Utilities.Callback) this.f47529n, tL_error2, j10);
                return;
        }
    }

    public p1(y3 y3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f47526b = y3Var;
        this.f47529n = b2Var;
        this.f47527c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f47528f = tL_error;
    }
}

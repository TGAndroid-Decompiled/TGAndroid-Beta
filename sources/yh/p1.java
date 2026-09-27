package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f47903a = 1;
    public final x3 f47904b;
    public final TLObject f47905c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f47906f;
    public final long h;
    public final Object f47907n;

    public p1(x3 x3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f47904b = x3Var;
        this.f47905c = tLObject;
        this.d = j3;
        this.e = j10;
        this.f47907n = callback;
        this.f47906f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f47903a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f47906f;
                x3.H0(this.f47904b, (org.telegram.ui.ActionBar.c2) this.f47907n, this.f47905c, this.d, this.e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f47906f;
                long j10 = this.h;
                x3.f0(this.f47904b, this.f47905c, this.d, this.e, (Utilities.Callback) this.f47907n, tL_error2, j10);
                return;
        }
    }

    public p1(x3 x3Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f47904b = x3Var;
        this.f47907n = c2Var;
        this.f47905c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f47906f = tL_error;
    }
}

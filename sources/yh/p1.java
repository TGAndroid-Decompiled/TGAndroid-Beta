package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f47630a = 1;
    public final a4 f47631b;
    public final TLObject f47632c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f47633f;
    public final long h;
    public final Object f47634n;

    public p1(a4 a4Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f47631b = a4Var;
        this.f47632c = tLObject;
        this.d = j3;
        this.e = j10;
        this.f47634n = callback;
        this.f47633f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f47630a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f47633f;
                a4.H0(this.f47631b, (org.telegram.ui.ActionBar.c2) this.f47634n, this.f47632c, this.d, this.e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f47633f;
                long j10 = this.h;
                a4.g0(this.f47631b, this.f47632c, this.d, this.e, (Utilities.Callback) this.f47634n, tL_error2, j10);
                return;
        }
    }

    public p1(a4 a4Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f47631b = a4Var;
        this.f47634n = c2Var;
        this.f47632c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f47633f = tL_error;
    }
}

package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f47625a = 1;
    public final a4 f47626b;
    public final TLObject f47627c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f47628f;
    public final long h;
    public final Object f47629n;

    public p1(a4 a4Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f47626b = a4Var;
        this.f47627c = tLObject;
        this.d = j3;
        this.e = j10;
        this.f47629n = callback;
        this.f47628f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f47625a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f47628f;
                a4.H0(this.f47626b, (org.telegram.ui.ActionBar.c2) this.f47629n, this.f47627c, this.d, this.e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f47628f;
                long j10 = this.h;
                a4.g0(this.f47626b, this.f47627c, this.d, this.e, (Utilities.Callback) this.f47629n, tL_error2, j10);
                return;
        }
    }

    public p1(a4 a4Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f47626b = a4Var;
        this.f47629n = c2Var;
        this.f47627c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f47628f = tL_error;
    }
}

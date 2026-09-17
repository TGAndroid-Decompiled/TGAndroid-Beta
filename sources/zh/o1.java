package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Runnable {
    public final int f52393a = 1;
    public final w3 f52394b;
    public final TLObject f52395c;
    public final long d;
    public final long f52396e;
    public final TLRPC.TL_error f52397f;
    public final long h;
    public final Object f52398n;

    public o1(w3 w3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f52394b = w3Var;
        this.f52395c = tLObject;
        this.d = j3;
        this.f52396e = j10;
        this.f52398n = callback;
        this.f52397f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f52393a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f52397f;
                w3.H0(this.f52394b, (org.telegram.ui.ActionBar.b2) this.f52398n, this.f52395c, this.d, this.f52396e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f52397f;
                long j10 = this.h;
                w3.g0(this.f52394b, this.f52395c, this.d, this.f52396e, (Utilities.Callback) this.f52398n, tL_error2, j10);
                return;
        }
    }

    public o1(w3 w3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f52394b = w3Var;
        this.f52398n = b2Var;
        this.f52395c = tLObject;
        this.d = j3;
        this.f52396e = j10;
        this.h = j11;
        this.f52397f = tL_error;
    }
}

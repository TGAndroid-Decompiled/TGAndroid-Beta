package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Runnable {
    public final int f52361a = 1;
    public final w3 f52362b;
    public final TLObject f52363c;
    public final long d;
    public final long f52364e;
    public final TLRPC.TL_error f52365f;
    public final long h;
    public final Object f52366n;

    public o1(w3 w3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f52362b = w3Var;
        this.f52363c = tLObject;
        this.d = j3;
        this.f52364e = j10;
        this.f52366n = callback;
        this.f52365f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f52361a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f52365f;
                w3.H0(this.f52362b, (org.telegram.ui.ActionBar.b2) this.f52366n, this.f52363c, this.d, this.f52364e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f52365f;
                long j10 = this.h;
                w3.g0(this.f52362b, this.f52363c, this.d, this.f52364e, (Utilities.Callback) this.f52366n, tL_error2, j10);
                return;
        }
    }

    public o1(w3 w3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f52362b = w3Var;
        this.f52366n = b2Var;
        this.f52363c = tLObject;
        this.d = j3;
        this.f52364e = j10;
        this.h = j11;
        this.f52365f = tL_error;
    }
}

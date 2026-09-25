package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f47855a = 1;
    public final x3 f47856b;
    public final TLObject f47857c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f47858f;
    public final long h;
    public final Object f47859n;

    public p1(x3 x3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f47856b = x3Var;
        this.f47857c = tLObject;
        this.d = j3;
        this.e = j10;
        this.f47859n = callback;
        this.f47858f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f47855a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f47858f;
                x3.H0(this.f47856b, (org.telegram.ui.ActionBar.a2) this.f47859n, this.f47857c, this.d, this.e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f47858f;
                long j10 = this.h;
                x3.f0(this.f47856b, this.f47857c, this.d, this.e, (Utilities.Callback) this.f47859n, tL_error2, j10);
                return;
        }
    }

    public p1(x3 x3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f47856b = x3Var;
        this.f47859n = a2Var;
        this.f47857c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f47858f = tL_error;
    }
}

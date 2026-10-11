package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f52984a = 1;
    public final s3 f52985b;
    public final TLObject f52986c;
    public final long d;
    public final long f52987e;
    public final TLRPC.TL_error f52988f;
    public final long h;
    public final Object f52989n;

    public n1(s3 s3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f52985b = s3Var;
        this.f52986c = tLObject;
        this.d = j3;
        this.f52987e = j10;
        this.f52989n = callback;
        this.f52988f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f52984a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f52988f;
                s3.I0(this.f52985b, (org.telegram.ui.ActionBar.a2) this.f52989n, this.f52986c, this.d, this.f52987e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f52988f;
                long j10 = this.h;
                s3.g0(this.f52985b, this.f52986c, this.d, this.f52987e, (Utilities.Callback) this.f52989n, tL_error2, j10);
                return;
        }
    }

    public n1(s3 s3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f52985b = s3Var;
        this.f52989n = a2Var;
        this.f52986c = tLObject;
        this.d = j3;
        this.f52987e = j10;
        this.h = j11;
        this.f52988f = tL_error;
    }
}

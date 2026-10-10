package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f52961a = 1;
    public final s3 f52962b;
    public final TLObject f52963c;
    public final long d;
    public final long f52964e;
    public final TLRPC.TL_error f52965f;
    public final long h;
    public final Object f52966n;

    public n1(s3 s3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f52962b = s3Var;
        this.f52963c = tLObject;
        this.d = j3;
        this.f52964e = j10;
        this.f52966n = callback;
        this.f52965f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f52961a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f52965f;
                s3.I0(this.f52962b, (org.telegram.ui.ActionBar.b2) this.f52966n, this.f52963c, this.d, this.f52964e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f52965f;
                long j10 = this.h;
                s3.g0(this.f52962b, this.f52963c, this.d, this.f52964e, (Utilities.Callback) this.f52966n, tL_error2, j10);
                return;
        }
    }

    public n1(s3 s3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f52962b = s3Var;
        this.f52966n = b2Var;
        this.f52963c = tLObject;
        this.d = j3;
        this.f52964e = j10;
        this.h = j11;
        this.f52965f = tL_error;
    }
}

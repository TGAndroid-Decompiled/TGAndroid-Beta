package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f53018a = 1;
    public final s3 f53019b;
    public final TLObject f53020c;
    public final long d;
    public final long f53021e;
    public final TLRPC.TL_error f53022f;
    public final long h;
    public final Object f53023n;

    public n1(s3 s3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f53019b = s3Var;
        this.f53020c = tLObject;
        this.d = j3;
        this.f53021e = j10;
        this.f53023n = callback;
        this.f53022f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f53018a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f53022f;
                s3.I0(this.f53019b, (org.telegram.ui.ActionBar.a2) this.f53023n, this.f53020c, this.d, this.f53021e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f53022f;
                long j10 = this.h;
                s3.g0(this.f53019b, this.f53020c, this.d, this.f53021e, (Utilities.Callback) this.f53023n, tL_error2, j10);
                return;
        }
    }

    public n1(s3 s3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f53019b = s3Var;
        this.f53023n = a2Var;
        this.f53020c = tLObject;
        this.d = j3;
        this.f53021e = j10;
        this.h = j11;
        this.f53022f = tL_error;
    }
}

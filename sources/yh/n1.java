package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f52917a = 1;
    public final s3 f52918b;
    public final TLObject f52919c;
    public final long d;
    public final long f52920e;
    public final TLRPC.TL_error f52921f;
    public final long h;
    public final Object f52922n;

    public n1(s3 s3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f52918b = s3Var;
        this.f52919c = tLObject;
        this.d = j3;
        this.f52920e = j10;
        this.f52922n = callback;
        this.f52921f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f52917a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f52921f;
                s3.I0(this.f52918b, (org.telegram.ui.ActionBar.b2) this.f52922n, this.f52919c, this.d, this.f52920e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f52921f;
                long j10 = this.h;
                s3.g0(this.f52918b, this.f52919c, this.d, this.f52920e, (Utilities.Callback) this.f52922n, tL_error2, j10);
                return;
        }
    }

    public n1(s3 s3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f52918b = s3Var;
        this.f52922n = b2Var;
        this.f52919c = tLObject;
        this.d = j3;
        this.f52920e = j10;
        this.h = j11;
        this.f52921f = tL_error;
    }
}

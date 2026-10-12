package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f53121a = 1;
    public final s3 f53122b;
    public final TLObject f53123c;
    public final long d;
    public final long f53124e;
    public final TLRPC.TL_error f53125f;
    public final long h;
    public final Object f53126n;

    public n1(s3 s3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f53122b = s3Var;
        this.f53123c = tLObject;
        this.d = j3;
        this.f53124e = j10;
        this.f53126n = callback;
        this.f53125f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f53121a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f53125f;
                s3.I0(this.f53122b, (org.telegram.ui.ActionBar.a2) this.f53126n, this.f53123c, this.d, this.f53124e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f53125f;
                long j10 = this.h;
                s3.g0(this.f53122b, this.f53123c, this.d, this.f53124e, (Utilities.Callback) this.f53126n, tL_error2, j10);
                return;
        }
    }

    public n1(s3 s3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f53122b = s3Var;
        this.f53126n = a2Var;
        this.f53123c = tLObject;
        this.d = j3;
        this.f53124e = j10;
        this.h = j11;
        this.f53125f = tL_error;
    }
}

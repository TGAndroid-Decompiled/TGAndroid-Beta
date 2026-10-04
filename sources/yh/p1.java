package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f51786a = 1;
    public final x3 f51787b;
    public final TLObject f51788c;
    public final long d;
    public final long f51789e;
    public final TLRPC.TL_error f51790f;
    public final long h;
    public final Object f51791n;

    public p1(x3 x3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f51787b = x3Var;
        this.f51788c = tLObject;
        this.d = j3;
        this.f51789e = j10;
        this.f51791n = callback;
        this.f51790f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f51786a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f51790f;
                x3.H0(this.f51787b, (org.telegram.ui.ActionBar.b2) this.f51791n, this.f51788c, this.d, this.f51789e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f51790f;
                long j10 = this.h;
                x3.f0(this.f51787b, this.f51788c, this.d, this.f51789e, (Utilities.Callback) this.f51791n, tL_error2, j10);
                return;
        }
    }

    public p1(x3 x3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f51787b = x3Var;
        this.f51791n = b2Var;
        this.f51788c = tLObject;
        this.d = j3;
        this.f51789e = j10;
        this.h = j11;
        this.f51790f = tL_error;
    }
}

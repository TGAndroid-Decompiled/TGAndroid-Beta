package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f51783a = 1;
    public final x3 f51784b;
    public final TLObject f51785c;
    public final long d;
    public final long f51786e;
    public final TLRPC.TL_error f51787f;
    public final long h;
    public final Object f51788n;

    public p1(x3 x3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f51784b = x3Var;
        this.f51785c = tLObject;
        this.d = j3;
        this.f51786e = j10;
        this.f51788n = callback;
        this.f51787f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f51783a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f51787f;
                x3.H0(this.f51784b, (org.telegram.ui.ActionBar.b2) this.f51788n, this.f51785c, this.d, this.f51786e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f51787f;
                long j10 = this.h;
                x3.f0(this.f51784b, this.f51785c, this.d, this.f51786e, (Utilities.Callback) this.f51788n, tL_error2, j10);
                return;
        }
    }

    public p1(x3 x3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f51784b = x3Var;
        this.f51788n = b2Var;
        this.f51785c = tLObject;
        this.d = j3;
        this.f51786e = j10;
        this.h = j11;
        this.f51787f = tL_error;
    }
}

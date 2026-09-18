package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f47833a = 1;
    public final y3 f47834b;
    public final TLObject f47835c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f47836f;
    public final long h;
    public final Object f47837n;

    public p1(y3 y3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f47834b = y3Var;
        this.f47835c = tLObject;
        this.d = j3;
        this.e = j10;
        this.f47837n = callback;
        this.f47836f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f47833a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f47836f;
                y3.H0(this.f47834b, (org.telegram.ui.ActionBar.b2) this.f47837n, this.f47835c, this.d, this.e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f47836f;
                long j10 = this.h;
                y3.g0(this.f47834b, this.f47835c, this.d, this.e, (Utilities.Callback) this.f47837n, tL_error2, j10);
                return;
        }
    }

    public p1(y3 y3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f47834b = y3Var;
        this.f47837n = b2Var;
        this.f47835c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f47836f = tL_error;
    }
}

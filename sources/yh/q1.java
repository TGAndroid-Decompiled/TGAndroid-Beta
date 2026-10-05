package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q1 implements Runnable {
    public final int f51847a = 1;
    public final y3 f51848b;
    public final TLObject f51849c;
    public final long d;
    public final long f51850e;
    public final TLRPC.TL_error f51851f;
    public final long h;
    public final Object f51852n;

    public q1(y3 y3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        this.f51848b = y3Var;
        this.f51849c = tLObject;
        this.d = j3;
        this.f51850e = j10;
        this.f51852n = callback;
        this.f51851f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f51847a) {
            case 0:
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f51851f;
                y3.H0(this.f51848b, (org.telegram.ui.ActionBar.b2) this.f51852n, this.f51849c, this.d, this.f51850e, j3, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f51851f;
                long j10 = this.h;
                y3.f0(this.f51848b, this.f51849c, this.d, this.f51850e, (Utilities.Callback) this.f51852n, tL_error2, j10);
                return;
        }
    }

    public q1(y3 y3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f51848b = y3Var;
        this.f51852n = b2Var;
        this.f51849c = tLObject;
        this.d = j3;
        this.f51850e = j10;
        this.h = j11;
        this.f51851f = tL_error;
    }
}

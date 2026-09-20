package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f47402a = 1;
    public final y3 f47403b;
    public final long f47404c;
    public final long d;
    public final long e;
    public final Object f47405f;

    public f1(y3 y3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f47403b = y3Var;
        this.f47404c = j3;
        this.d = j10;
        this.f47405f = callback;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47402a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p1(this.f47403b, (org.telegram.ui.ActionBar.b2) this.f47405f, tLObject, this.f47404c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p1(this.f47403b, tLObject, this.f47404c, this.d, (Utilities.Callback) this.f47405f, tL_error, this.e));
                return;
        }
    }

    public f1(y3 y3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f47403b = y3Var;
        this.f47405f = b2Var;
        this.f47404c = j3;
        this.d = j10;
        this.e = j11;
    }
}

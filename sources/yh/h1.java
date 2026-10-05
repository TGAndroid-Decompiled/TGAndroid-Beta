package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h1 implements RequestDelegate {
    public final int f51407a = 1;
    public final y3 f51408b;
    public final long f51409c;
    public final long d;
    public final long f51410e;
    public final Object f51411f;

    public h1(y3 y3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f51408b = y3Var;
        this.f51409c = j3;
        this.d = j10;
        this.f51411f = callback;
        this.f51410e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51407a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1(this.f51408b, (org.telegram.ui.ActionBar.b2) this.f51411f, tLObject, this.f51409c, this.d, this.f51410e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(this.f51408b, tLObject, this.f51409c, this.d, (Utilities.Callback) this.f51411f, tL_error, this.f51410e));
                return;
        }
    }

    public h1(y3 y3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f51408b = y3Var;
        this.f51411f = b2Var;
        this.f51409c = j3;
        this.d = j10;
        this.f51410e = j11;
    }
}

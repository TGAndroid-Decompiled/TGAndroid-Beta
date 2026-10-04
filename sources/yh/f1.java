package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f51260a = 1;
    public final x3 f51261b;
    public final long f51262c;
    public final long d;
    public final long f51263e;
    public final Object f51264f;

    public f1(x3 x3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f51261b = x3Var;
        this.f51262c = j3;
        this.d = j10;
        this.f51264f = callback;
        this.f51263e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51260a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p1(this.f51261b, (org.telegram.ui.ActionBar.b2) this.f51264f, tLObject, this.f51262c, this.d, this.f51263e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p1(this.f51261b, tLObject, this.f51262c, this.d, (Utilities.Callback) this.f51264f, tL_error, this.f51263e));
                return;
        }
    }

    public f1(x3 x3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f51261b = x3Var;
        this.f51264f = b2Var;
        this.f51262c = j3;
        this.d = j10;
        this.f51263e = j11;
    }
}

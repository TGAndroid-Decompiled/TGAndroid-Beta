package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f51261a = 1;
    public final x3 f51262b;
    public final long f51263c;
    public final long d;
    public final long f51264e;
    public final Object f51265f;

    public f1(x3 x3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f51262b = x3Var;
        this.f51263c = j3;
        this.d = j10;
        this.f51265f = callback;
        this.f51264e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51261a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p1(this.f51262b, (org.telegram.ui.ActionBar.b2) this.f51265f, tLObject, this.f51263c, this.d, this.f51264e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p1(this.f51262b, tLObject, this.f51263c, this.d, (Utilities.Callback) this.f51265f, tL_error, this.f51264e));
                return;
        }
    }

    public f1(x3 x3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f51262b = x3Var;
        this.f51265f = b2Var;
        this.f51263c = j3;
        this.d = j10;
        this.f51264e = j11;
    }
}

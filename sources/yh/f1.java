package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f51267a = 1;
    public final x3 f51268b;
    public final long f51269c;
    public final long d;
    public final long f51270e;
    public final Object f51271f;

    public f1(x3 x3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f51268b = x3Var;
        this.f51269c = j3;
        this.d = j10;
        this.f51271f = callback;
        this.f51270e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51267a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p1(this.f51268b, (org.telegram.ui.ActionBar.b2) this.f51271f, tLObject, this.f51269c, this.d, this.f51270e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p1(this.f51268b, tLObject, this.f51269c, this.d, (Utilities.Callback) this.f51271f, tL_error, this.f51270e));
                return;
        }
    }

    public f1(x3 x3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f51268b = x3Var;
        this.f51271f = b2Var;
        this.f51269c = j3;
        this.d = j10;
        this.f51270e = j11;
    }
}

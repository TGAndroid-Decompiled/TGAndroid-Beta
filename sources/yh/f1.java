package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f47085a = 1;
    public final z3 f47086b;
    public final long f47087c;
    public final long d;
    public final long e;
    public final Object f47088f;

    public f1(z3 z3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f47086b = z3Var;
        this.f47087c = j3;
        this.d = j10;
        this.f47088f = callback;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47085a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p1(this.f47086b, (org.telegram.ui.ActionBar.b2) this.f47088f, tLObject, this.f47087c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p1(this.f47086b, tLObject, this.f47087c, this.d, (Utilities.Callback) this.f47088f, tL_error, this.e));
                return;
        }
    }

    public f1(z3 z3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f47086b = z3Var;
        this.f47088f = b2Var;
        this.f47087c = j3;
        this.d = j10;
        this.e = j11;
    }
}

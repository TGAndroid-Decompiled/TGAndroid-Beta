package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f47423a = 1;
    public final y3 f47424b;
    public final long f47425c;
    public final long d;
    public final long e;
    public final Object f47426f;

    public f1(y3 y3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f47424b = y3Var;
        this.f47425c = j3;
        this.d = j10;
        this.f47426f = callback;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47423a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p1(this.f47424b, (org.telegram.ui.ActionBar.b2) this.f47426f, tLObject, this.f47425c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p1(this.f47424b, tLObject, this.f47425c, this.d, (Utilities.Callback) this.f47426f, tL_error, this.e));
                return;
        }
    }

    public f1(y3 y3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f47424b = y3Var;
        this.f47426f = b2Var;
        this.f47425c = j3;
        this.d = j10;
        this.e = j11;
    }
}

package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f47360a = 1;
    public final x3 f47361b;
    public final long f47362c;
    public final long d;
    public final long e;
    public final Object f47363f;

    public f1(x3 x3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f47361b = x3Var;
        this.f47362c = j3;
        this.d = j10;
        this.f47363f = callback;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47360a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p1(this.f47361b, (org.telegram.ui.ActionBar.a2) this.f47363f, tLObject, this.f47362c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p1(this.f47361b, tLObject, this.f47362c, this.d, (Utilities.Callback) this.f47363f, tL_error, this.e));
                return;
        }
    }

    public f1(x3 x3Var, org.telegram.ui.ActionBar.a2 a2Var, long j3, long j10, long j11) {
        this.f47361b = x3Var;
        this.f47363f = a2Var;
        this.f47362c = j3;
        this.d = j10;
        this.e = j11;
    }
}

package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f45394a = 1;
    public final x3 f45395b;
    public final long f45396c;
    public final long d;
    public final long e;
    public final Object f45397f;

    public f1(x3 x3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f45395b = x3Var;
        this.f45396c = j3;
        this.d = j10;
        this.f45397f = callback;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45394a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p1(this.f45395b, (org.telegram.ui.ActionBar.d2) this.f45397f, tLObject, this.f45396c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p1(this.f45395b, tLObject, this.f45396c, this.d, (Utilities.Callback) this.f45397f, tL_error, this.e));
                return;
        }
    }

    public f1(x3 x3Var, org.telegram.ui.ActionBar.d2 d2Var, long j3, long j10, long j11) {
        this.f45395b = x3Var;
        this.f45397f = d2Var;
        this.f45396c = j3;
        this.d = j10;
        this.e = j11;
    }
}

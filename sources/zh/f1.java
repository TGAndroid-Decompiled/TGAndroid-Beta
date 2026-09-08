package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f51884a = 1;
    public final w3 f51885b;
    public final long f51886c;
    public final long d;
    public final long f51887e;
    public final Object f51888f;

    public f1(w3 w3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f51885b = w3Var;
        this.f51886c = j3;
        this.d = j10;
        this.f51888f = callback;
        this.f51887e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51884a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o1(this.f51885b, (org.telegram.ui.ActionBar.b2) this.f51888f, tLObject, this.f51886c, this.d, this.f51887e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o1(this.f51885b, tLObject, this.f51886c, this.d, (Utilities.Callback) this.f51888f, tL_error, this.f51887e));
                return;
        }
    }

    public f1(w3 w3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f51885b = w3Var;
        this.f51888f = b2Var;
        this.f51886c = j3;
        this.d = j10;
        this.f51887e = j11;
    }
}

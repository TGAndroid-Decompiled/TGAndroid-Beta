package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f51885a = 1;
    public final w3 f51886b;
    public final long f51887c;
    public final long d;
    public final long f51888e;
    public final Object f51889f;

    public f1(w3 w3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f51886b = w3Var;
        this.f51887c = j3;
        this.d = j10;
        this.f51889f = callback;
        this.f51888e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51885a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o1(this.f51886b, (org.telegram.ui.ActionBar.b2) this.f51889f, tLObject, this.f51887c, this.d, this.f51888e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o1(this.f51886b, tLObject, this.f51887c, this.d, (Utilities.Callback) this.f51889f, tL_error, this.f51888e));
                return;
        }
    }

    public f1(w3 w3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f51886b = w3Var;
        this.f51889f = b2Var;
        this.f51887c = j3;
        this.d = j10;
        this.f51888e = j11;
    }
}

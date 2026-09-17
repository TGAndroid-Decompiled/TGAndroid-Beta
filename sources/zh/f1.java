package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f51854a = 1;
    public final w3 f51855b;
    public final long f51856c;
    public final long d;
    public final long f51857e;
    public final Object f51858f;

    public f1(w3 w3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f51855b = w3Var;
        this.f51856c = j3;
        this.d = j10;
        this.f51858f = callback;
        this.f51857e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51854a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o1(this.f51855b, (org.telegram.ui.ActionBar.b2) this.f51858f, tLObject, this.f51856c, this.d, this.f51857e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o1(this.f51855b, tLObject, this.f51856c, this.d, (Utilities.Callback) this.f51858f, tL_error, this.f51857e));
                return;
        }
    }

    public f1(w3 w3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f51855b = w3Var;
        this.f51858f = b2Var;
        this.f51856c = j3;
        this.d = j10;
        this.f51857e = j11;
    }
}

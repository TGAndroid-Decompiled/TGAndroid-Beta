package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f51853a = 1;
    public final w3 f51854b;
    public final long f51855c;
    public final long d;
    public final long f51856e;
    public final Object f51857f;

    public f1(w3 w3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f51854b = w3Var;
        this.f51855c = j3;
        this.d = j10;
        this.f51857f = callback;
        this.f51856e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51853a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o1(this.f51854b, (org.telegram.ui.ActionBar.b2) this.f51857f, tLObject, this.f51855c, this.d, this.f51856e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o1(this.f51854b, tLObject, this.f51855c, this.d, (Utilities.Callback) this.f51857f, tL_error, this.f51856e));
                return;
        }
    }

    public f1(w3 w3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f51854b = w3Var;
        this.f51857f = b2Var;
        this.f51855c = j3;
        this.d = j10;
        this.f51856e = j11;
    }
}

package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e1 implements RequestDelegate {
    public final int f50409a = 1;
    public final r3 f50410b;
    public final long f50411c;
    public final long d;
    public final long e;
    public final Object f50412f;

    public e1(r3 r3Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f50410b = r3Var;
        this.f50411c = j10;
        this.d = j11;
        this.f50412f = callback;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50409a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m1(this.f50410b, (org.telegram.ui.ActionBar.a2) this.f50412f, tLObject, this.f50411c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m1(this.f50410b, tLObject, this.f50411c, this.d, (Utilities.Callback) this.f50412f, tL_error, this.e));
                return;
        }
    }

    public e1(r3 r3Var, org.telegram.ui.ActionBar.a2 a2Var, long j10, long j11, long j12) {
        this.f50410b = r3Var;
        this.f50412f = a2Var;
        this.f50411c = j10;
        this.d = j11;
        this.e = j12;
    }
}

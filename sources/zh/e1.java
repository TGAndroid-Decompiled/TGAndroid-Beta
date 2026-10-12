package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e1 implements RequestDelegate {
    public final int f50408a = 1;
    public final r3 f50409b;
    public final long f50410c;
    public final long d;
    public final long e;
    public final Object f50411f;

    public e1(r3 r3Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.f50409b = r3Var;
        this.f50410c = j10;
        this.d = j11;
        this.f50411f = callback;
        this.e = j12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50408a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m1(this.f50409b, (org.telegram.ui.ActionBar.a2) this.f50411f, tLObject, this.f50410c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m1(this.f50409b, tLObject, this.f50410c, this.d, (Utilities.Callback) this.f50411f, tL_error, this.e));
                return;
        }
    }

    public e1(r3 r3Var, org.telegram.ui.ActionBar.a2 a2Var, long j10, long j11, long j12) {
        this.f50409b = r3Var;
        this.f50411f = a2Var;
        this.f50410c = j10;
        this.d = j11;
        this.e = j12;
    }
}

package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e1 implements RequestDelegate {
    public final int f52544a = 1;
    public final s3 f52545b;
    public final long f52546c;
    public final long d;
    public final long f52547e;
    public final Object f52548f;

    public e1(s3 s3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f52545b = s3Var;
        this.f52546c = j3;
        this.d = j10;
        this.f52548f = callback;
        this.f52547e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52544a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n1(this.f52545b, (org.telegram.ui.ActionBar.a2) this.f52548f, tLObject, this.f52546c, this.d, this.f52547e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n1(this.f52545b, tLObject, this.f52546c, this.d, (Utilities.Callback) this.f52548f, tL_error, this.f52547e));
                return;
        }
    }

    public e1(s3 s3Var, org.telegram.ui.ActionBar.a2 a2Var, long j3, long j10, long j11) {
        this.f52545b = s3Var;
        this.f52548f = a2Var;
        this.f52546c = j3;
        this.d = j10;
        this.f52547e = j11;
    }
}

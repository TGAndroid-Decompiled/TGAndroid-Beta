package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e1 implements RequestDelegate {
    public final int f52510a = 1;
    public final s3 f52511b;
    public final long f52512c;
    public final long d;
    public final long f52513e;
    public final Object f52514f;

    public e1(s3 s3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f52511b = s3Var;
        this.f52512c = j3;
        this.d = j10;
        this.f52514f = callback;
        this.f52513e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52510a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n1(this.f52511b, (org.telegram.ui.ActionBar.a2) this.f52514f, tLObject, this.f52512c, this.d, this.f52513e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n1(this.f52511b, tLObject, this.f52512c, this.d, (Utilities.Callback) this.f52514f, tL_error, this.f52513e));
                return;
        }
    }

    public e1(s3 s3Var, org.telegram.ui.ActionBar.a2 a2Var, long j3, long j10, long j11) {
        this.f52511b = s3Var;
        this.f52514f = a2Var;
        this.f52512c = j3;
        this.d = j10;
        this.f52513e = j11;
    }
}

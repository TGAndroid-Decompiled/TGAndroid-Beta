package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e1 implements RequestDelegate {
    public final int f52423a = 1;
    public final s3 f52424b;
    public final long f52425c;
    public final long d;
    public final long f52426e;
    public final Object f52427f;

    public e1(s3 s3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f52424b = s3Var;
        this.f52425c = j3;
        this.d = j10;
        this.f52427f = callback;
        this.f52426e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52423a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n1(this.f52424b, (org.telegram.ui.ActionBar.b2) this.f52427f, tLObject, this.f52425c, this.d, this.f52426e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n1(this.f52424b, tLObject, this.f52425c, this.d, (Utilities.Callback) this.f52427f, tL_error, this.f52426e));
                return;
        }
    }

    public e1(s3 s3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.f52424b = s3Var;
        this.f52427f = b2Var;
        this.f52425c = j3;
        this.d = j10;
        this.f52426e = j11;
    }
}

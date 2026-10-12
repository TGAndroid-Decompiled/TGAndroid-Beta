package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e1 implements RequestDelegate {
    public final int f52653a = 1;
    public final s3 f52654b;
    public final long f52655c;
    public final long d;
    public final long f52656e;
    public final Object f52657f;

    public e1(s3 s3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f52654b = s3Var;
        this.f52655c = j3;
        this.d = j10;
        this.f52657f = callback;
        this.f52656e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52653a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n1(this.f52654b, (org.telegram.ui.ActionBar.a2) this.f52657f, tLObject, this.f52655c, this.d, this.f52656e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n1(this.f52654b, tLObject, this.f52655c, this.d, (Utilities.Callback) this.f52657f, tL_error, this.f52656e));
                return;
        }
    }

    public e1(s3 s3Var, org.telegram.ui.ActionBar.a2 a2Var, long j3, long j10, long j11) {
        this.f52654b = s3Var;
        this.f52657f = a2Var;
        this.f52655c = j3;
        this.d = j10;
        this.f52656e = j11;
    }
}

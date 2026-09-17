package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 implements RequestDelegate {
    public final int f47164a = 1;
    public final a4 f47165b;
    public final long f47166c;
    public final long d;
    public final long e;
    public final Object f47167f;

    public f1(a4 a4Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.f47165b = a4Var;
        this.f47166c = j3;
        this.d = j10;
        this.f47167f = callback;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47164a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p1(this.f47165b, (org.telegram.ui.ActionBar.c2) this.f47167f, tLObject, this.f47166c, this.d, this.e, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p1(this.f47165b, tLObject, this.f47166c, this.d, (Utilities.Callback) this.f47167f, tL_error, this.e));
                return;
        }
    }

    public f1(a4 a4Var, org.telegram.ui.ActionBar.c2 c2Var, long j3, long j10, long j11) {
        this.f47165b = a4Var;
        this.f47167f = c2Var;
        this.f47166c = j3;
        this.d = j10;
        this.e = j11;
    }
}

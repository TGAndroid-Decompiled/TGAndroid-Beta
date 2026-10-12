package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m1 implements Runnable {
    public final int f50811a = 1;
    public final r3 f50812b;
    public final TLObject f50813c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f50814f;
    public final long h;
    public final Object f50815n;

    public m1(r3 r3Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f50812b = r3Var;
        this.f50813c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f50815n = callback;
        this.f50814f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f50811a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f50814f;
                r3.I0(this.f50812b, (org.telegram.ui.ActionBar.a2) this.f50815n, this.f50813c, this.d, this.e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f50814f;
                long j11 = this.h;
                r3.g0(this.f50812b, this.f50813c, this.d, this.e, (Utilities.Callback) this.f50815n, tL_error2, j11);
                return;
        }
    }

    public m1(r3 r3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f50812b = r3Var;
        this.f50815n = a2Var;
        this.f50813c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f50814f = tL_error;
    }
}

package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m1 implements Runnable {
    public final int f50812a = 1;
    public final r3 f50813b;
    public final TLObject f50814c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f50815f;
    public final long h;
    public final Object f50816n;

    public m1(r3 r3Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f50813b = r3Var;
        this.f50814c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f50816n = callback;
        this.f50815f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f50812a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f50815f;
                r3.I0(this.f50813b, (org.telegram.ui.ActionBar.a2) this.f50816n, this.f50814c, this.d, this.e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f50815f;
                long j11 = this.h;
                r3.g0(this.f50813b, this.f50814c, this.d, this.e, (Utilities.Callback) this.f50816n, tL_error2, j11);
                return;
        }
    }

    public m1(r3 r3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f50813b = r3Var;
        this.f50816n = a2Var;
        this.f50814c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f50815f = tL_error;
    }
}

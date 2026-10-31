package rh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class a2 implements RequestDelegate {
    public final int f46604a;
    public final e4 f46605b;
    public final TwoStepVerificationActivity f46606c;
    public final boolean d;

    public a2(e4 e4Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i10) {
        this.f46604a = i10;
        this.f46605b = e4Var;
        this.f46606c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46604a) {
            case 0:
                org.telegram.messenger.i0.g3(new u0(this.f46605b, tLObject, this.f46606c, this.d, tL_error));
                return;
            default:
                org.telegram.messenger.i0.g3(new u0(this.f46605b, tL_error, this.f46606c, tLObject, this.d));
                return;
        }
    }
}

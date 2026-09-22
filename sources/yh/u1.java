package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u1 implements RequestDelegate {
    public final int f47787a;
    public final z3 f47788b;
    public final TwoStepVerificationActivity f47789c;

    public u1(z3 z3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47787a = i10;
        this.f47788b = z3Var;
        this.f47789c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47787a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f47788b, tL_error, this.f47789c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this.f47788b, tL_error, tLObject, this.f47789c));
                return;
        }
    }
}

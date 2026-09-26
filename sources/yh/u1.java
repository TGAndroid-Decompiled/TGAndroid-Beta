package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u1 implements RequestDelegate {
    public final int f48074a;
    public final x3 f48075b;
    public final TwoStepVerificationActivity f48076c;

    public u1(x3 x3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f48074a = i10;
        this.f48075b = x3Var;
        this.f48076c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48074a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f48075b, tL_error, this.f48076c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this.f48075b, tL_error, tLObject, this.f48076c));
                return;
        }
    }
}

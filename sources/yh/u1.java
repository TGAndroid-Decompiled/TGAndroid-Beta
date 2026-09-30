package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u1 implements RequestDelegate {
    public final int f48075a;
    public final x3 f48076b;
    public final TwoStepVerificationActivity f48077c;

    public u1(x3 x3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f48075a = i10;
        this.f48076b = x3Var;
        this.f48077c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48075a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f48076b, tL_error, this.f48077c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this.f48076b, tL_error, tLObject, this.f48077c));
                return;
        }
    }
}

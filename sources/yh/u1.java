package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u1 implements RequestDelegate {
    public final int f48182a;
    public final x3 f48183b;
    public final TwoStepVerificationActivity f48184c;

    public u1(x3 x3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f48182a = i10;
        this.f48183b = x3Var;
        this.f48184c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48182a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f48183b, tL_error, this.f48184c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this.f48183b, tL_error, tLObject, this.f48184c));
                return;
        }
    }
}

package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u1 implements RequestDelegate {
    public final int f48077a;
    public final y3 f48078b;
    public final TwoStepVerificationActivity f48079c;

    public u1(y3 y3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f48077a = i10;
        this.f48078b = y3Var;
        this.f48079c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48077a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f48078b, tL_error, this.f48079c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this.f48078b, tL_error, tLObject, this.f48079c));
                return;
        }
    }
}

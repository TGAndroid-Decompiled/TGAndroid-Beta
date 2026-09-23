package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u1 implements RequestDelegate {
    public final int f47766a;
    public final y3 f47767b;
    public final TwoStepVerificationActivity f47768c;

    public u1(y3 y3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47766a = i10;
        this.f47767b = y3Var;
        this.f47768c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47766a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f47767b, tL_error, this.f47768c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this.f47767b, tL_error, tLObject, this.f47768c));
                return;
        }
    }
}

package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u1 implements RequestDelegate {
    public final int f46091a;
    public final x3 f46092b;
    public final TwoStepVerificationActivity f46093c;

    public u1(x3 x3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f46091a = i10;
        this.f46092b = x3Var;
        this.f46093c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46091a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f46092b, tL_error, this.f46093c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this.f46092b, tL_error, tLObject, this.f46093c));
                return;
        }
    }
}

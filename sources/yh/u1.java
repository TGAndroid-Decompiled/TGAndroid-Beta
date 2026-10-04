package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u1 implements RequestDelegate {
    public final int f52051a;
    public final x3 f52052b;
    public final TwoStepVerificationActivity f52053c;

    public u1(x3 x3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f52051a = i10;
        this.f52052b = x3Var;
        this.f52053c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52051a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f52052b, tL_error, this.f52053c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this.f52052b, tL_error, tLObject, this.f52053c));
                return;
        }
    }
}

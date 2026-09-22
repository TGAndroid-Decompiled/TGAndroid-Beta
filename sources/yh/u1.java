package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u1 implements RequestDelegate {
    public final int f48116a;
    public final y3 f48117b;
    public final TwoStepVerificationActivity f48118c;

    public u1(y3 y3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f48116a = i10;
        this.f48117b = y3Var;
        this.f48118c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48116a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f48117b, tL_error, this.f48118c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this.f48117b, tL_error, tLObject, this.f48118c));
                return;
        }
    }
}

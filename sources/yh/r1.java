package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class r1 implements RequestDelegate {
    public final int f53203a;
    public final s3 f53204b;
    public final TwoStepVerificationActivity f53205c;

    public r1(s3 s3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f53203a = i10;
        this.f53204b = s3Var;
        this.f53205c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53203a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s0(this.f53204b, tL_error, this.f53205c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s0(this.f53204b, tL_error, tLObject, this.f53205c));
                return;
        }
    }
}

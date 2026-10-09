package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class r1 implements RequestDelegate {
    public final int f53116a;
    public final s3 f53117b;
    public final TwoStepVerificationActivity f53118c;

    public r1(s3 s3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f53116a = i10;
        this.f53117b = s3Var;
        this.f53118c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53116a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s0(this.f53117b, tL_error, this.f53118c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s0(this.f53117b, tL_error, tLObject, this.f53118c));
                return;
        }
    }
}

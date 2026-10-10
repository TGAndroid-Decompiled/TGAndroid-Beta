package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class r1 implements RequestDelegate {
    public final int f53160a;
    public final s3 f53161b;
    public final TwoStepVerificationActivity f53162c;

    public r1(s3 s3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f53160a = i10;
        this.f53161b = s3Var;
        this.f53162c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53160a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s0(this.f53161b, tL_error, this.f53162c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s0(this.f53161b, tL_error, tLObject, this.f53162c));
                return;
        }
    }
}

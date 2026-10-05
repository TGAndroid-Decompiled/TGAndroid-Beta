package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v1 implements RequestDelegate {
    public final int f52121a;
    public final y3 f52122b;
    public final TwoStepVerificationActivity f52123c;

    public v1(y3 y3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f52121a = i10;
        this.f52122b = y3Var;
        this.f52123c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52121a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u0(this.f52122b, tL_error, this.f52123c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new u0(this.f52122b, tL_error, tLObject, this.f52123c));
                return;
        }
    }
}

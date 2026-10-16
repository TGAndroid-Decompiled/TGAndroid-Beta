package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q1 implements RequestDelegate {
    public final int f51004a;
    public final r3 f51005b;
    public final TwoStepVerificationActivity f51006c;

    public q1(r3 r3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f51004a = i10;
        this.f51005b = r3Var;
        this.f51006c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51004a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s0(this.f51005b, tL_error, this.f51006c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s0(this.f51005b, tL_error, tLObject, this.f51006c));
                return;
        }
    }
}

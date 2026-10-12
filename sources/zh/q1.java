package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q1 implements RequestDelegate {
    public final int f51003a;
    public final r3 f51004b;
    public final TwoStepVerificationActivity f51005c;

    public q1(r3 r3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f51003a = i10;
        this.f51004b = r3Var;
        this.f51005c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51003a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s0(this.f51004b, tL_error, this.f51005c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s0(this.f51004b, tL_error, tLObject, this.f51005c));
                return;
        }
    }
}

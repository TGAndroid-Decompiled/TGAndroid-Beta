package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t1 implements RequestDelegate {
    public final int f52604a;
    public final w3 f52605b;
    public final TwoStepVerificationActivity f52606c;

    public t1(w3 w3Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f52604a = i10;
        this.f52605b = w3Var;
        this.f52606c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52604a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f52605b, tL_error, this.f52606c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this.f52605b, tL_error, tLObject, this.f52606c));
                return;
        }
    }
}

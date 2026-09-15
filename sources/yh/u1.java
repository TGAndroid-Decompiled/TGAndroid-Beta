package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u1 implements RequestDelegate {
    public final int f47843a;
    public final a4 f47844b;
    public final TwoStepVerificationActivity f47845c;

    public u1(a4 a4Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f47843a = i10;
        this.f47844b = a4Var;
        this.f47845c = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47843a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f47844b, tL_error, this.f47845c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t0(this.f47844b, tL_error, tLObject, this.f47845c));
                return;
        }
    }
}

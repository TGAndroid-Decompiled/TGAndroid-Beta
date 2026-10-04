package yh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t0 implements Runnable {
    public final int f51989a = 0;
    public final x3 f51990b;
    public final TLRPC.TL_error f51991c;
    public final TwoStepVerificationActivity d;
    public final TLObject f51992e;

    public t0(x3 x3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f51990b = x3Var;
        this.f51991c = tL_error;
        this.f51992e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f51989a) {
            case 0:
                x3 x3Var = this.f51990b;
                x3Var.getClass();
                if (this.f51991c == null) {
                    TL_account.Password password = (TL_account.Password) this.f51992e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    x3Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                x3.W0(this.f51990b, this.f51991c, this.f51992e, twoStepVerificationActivity2);
                return;
        }
    }

    public t0(x3 x3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f51990b = x3Var;
        this.f51991c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f51992e = tLObject;
    }
}

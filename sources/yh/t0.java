package yh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t0 implements Runnable {
    public final int f51990a = 0;
    public final x3 f51991b;
    public final TLRPC.TL_error f51992c;
    public final TwoStepVerificationActivity d;
    public final TLObject f51993e;

    public t0(x3 x3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f51991b = x3Var;
        this.f51992c = tL_error;
        this.f51993e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f51990a) {
            case 0:
                x3 x3Var = this.f51991b;
                x3Var.getClass();
                if (this.f51992c == null) {
                    TL_account.Password password = (TL_account.Password) this.f51993e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    x3Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                x3.W0(this.f51991b, this.f51992c, this.f51993e, twoStepVerificationActivity2);
                return;
        }
    }

    public t0(x3 x3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f51991b = x3Var;
        this.f51992c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f51993e = tLObject;
    }
}

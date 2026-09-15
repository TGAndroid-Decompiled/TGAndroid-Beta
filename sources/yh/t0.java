package yh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t0 implements Runnable {
    public final int f47811a = 0;
    public final a4 f47812b;
    public final TLRPC.TL_error f47813c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;

    public t0(a4 a4Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f47812b = a4Var;
        this.f47813c = tL_error;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47811a) {
            case 0:
                a4 a4Var = this.f47812b;
                a4Var.getClass();
                if (this.f47813c == null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    a4Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                a4.W0(this.f47812b, this.f47813c, this.e, twoStepVerificationActivity2);
                return;
        }
    }

    public t0(a4 a4Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f47812b = a4Var;
        this.f47813c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
    }
}

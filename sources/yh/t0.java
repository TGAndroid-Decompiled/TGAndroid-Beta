package yh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t0 implements Runnable {
    public final int f47745a = 0;
    public final z3 f47746b;
    public final TLRPC.TL_error f47747c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;

    public t0(z3 z3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f47746b = z3Var;
        this.f47747c = tL_error;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f47745a) {
            case 0:
                z3 z3Var = this.f47746b;
                z3Var.getClass();
                if (this.f47747c == null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    z3Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                z3.W0(this.f47746b, this.f47747c, this.e, twoStepVerificationActivity2);
                return;
        }
    }

    public t0(z3 z3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f47746b = z3Var;
        this.f47747c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
    }
}

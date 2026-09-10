package xh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t0 implements Runnable {
    public final int f46043a = 0;
    public final x3 f46044b;
    public final TLRPC.TL_error f46045c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;

    public t0(x3 x3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f46044b = x3Var;
        this.f46045c = tL_error;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f46043a) {
            case 0:
                x3 x3Var = this.f46044b;
                x3Var.getClass();
                if (this.f46045c == null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    x3Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                x3.W0(this.f46044b, this.f46045c, this.e, twoStepVerificationActivity2);
                return;
        }
    }

    public t0(x3 x3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f46044b = x3Var;
        this.f46045c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
    }
}

package zh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t0 implements Runnable {
    public final int f52631a = 0;
    public final w3 f52632b;
    public final TLRPC.TL_error f52633c;
    public final TwoStepVerificationActivity d;
    public final TLObject f52634e;

    public t0(w3 w3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f52632b = w3Var;
        this.f52633c = tL_error;
        this.f52634e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f52631a) {
            case 0:
                w3 w3Var = this.f52632b;
                w3Var.getClass();
                if (this.f52633c == null) {
                    TL_account.Password password = (TL_account.Password) this.f52634e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    w3Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                w3.W0(this.f52632b, this.f52633c, this.f52634e, twoStepVerificationActivity2);
                return;
        }
    }

    public t0(w3 w3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f52632b = w3Var;
        this.f52633c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f52634e = tLObject;
    }
}

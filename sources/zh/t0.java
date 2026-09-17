package zh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t0 implements Runnable {
    public final int f52632a = 0;
    public final w3 f52633b;
    public final TLRPC.TL_error f52634c;
    public final TwoStepVerificationActivity d;
    public final TLObject f52635e;

    public t0(w3 w3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f52633b = w3Var;
        this.f52634c = tL_error;
        this.f52635e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f52632a) {
            case 0:
                w3 w3Var = this.f52633b;
                w3Var.getClass();
                if (this.f52634c == null) {
                    TL_account.Password password = (TL_account.Password) this.f52635e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    w3Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                w3.W0(this.f52633b, this.f52634c, this.f52635e, twoStepVerificationActivity2);
                return;
        }
    }

    public t0(w3 w3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f52633b = w3Var;
        this.f52634c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f52635e = tLObject;
    }
}

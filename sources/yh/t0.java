package yh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class t0 implements Runnable {
    public final int f48056a = 0;
    public final y3 f48057b;
    public final TLRPC.TL_error f48058c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;

    public t0(y3 y3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f48057b = y3Var;
        this.f48058c = tL_error;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f48056a) {
            case 0:
                y3 y3Var = this.f48057b;
                y3Var.getClass();
                if (this.f48058c == null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    y3Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                y3.W0(this.f48057b, this.f48058c, this.e, twoStepVerificationActivity2);
                return;
        }
    }

    public t0(y3 y3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f48057b = y3Var;
        this.f48058c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
    }
}

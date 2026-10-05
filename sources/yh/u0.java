package yh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u0 implements Runnable {
    public final int f52064a = 0;
    public final y3 f52065b;
    public final TLRPC.TL_error f52066c;
    public final TwoStepVerificationActivity d;
    public final TLObject f52067e;

    public u0(y3 y3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f52065b = y3Var;
        this.f52066c = tL_error;
        this.f52067e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f52064a) {
            case 0:
                y3 y3Var = this.f52065b;
                y3Var.getClass();
                if (this.f52066c == null) {
                    TL_account.Password password = (TL_account.Password) this.f52067e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    y3Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                y3.W0(this.f52065b, this.f52066c, this.f52067e, twoStepVerificationActivity2);
                return;
        }
    }

    public u0(y3 y3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f52065b = y3Var;
        this.f52066c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f52067e = tLObject;
    }
}

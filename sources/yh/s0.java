package yh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class s0 implements Runnable {
    public final int f53142a = 0;
    public final s3 f53143b;
    public final TLRPC.TL_error f53144c;
    public final TwoStepVerificationActivity d;
    public final TLObject f53145e;

    public s0(s3 s3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f53143b = s3Var;
        this.f53144c = tL_error;
        this.f53145e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f53142a) {
            case 0:
                s3 s3Var = this.f53143b;
                s3Var.getClass();
                if (this.f53144c == null) {
                    TL_account.Password password = (TL_account.Password) this.f53145e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    s3Var.N1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                s3.X0(this.f53143b, this.f53144c, this.f53145e, twoStepVerificationActivity2);
                return;
        }
    }

    public s0(s3 s3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f53143b = s3Var;
        this.f53144c = tL_error;
        this.d = twoStepVerificationActivity;
        this.f53145e = tLObject;
    }
}

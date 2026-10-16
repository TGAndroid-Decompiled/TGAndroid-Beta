package zh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class s0 implements Runnable {
    public final int f51128a = 0;
    public final r3 f51129b;
    public final TLRPC.TL_error f51130c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;

    public s0(r3 r3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f51129b = r3Var;
        this.f51130c = tL_error;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f51128a) {
            case 0:
                r3 r3Var = this.f51129b;
                r3Var.getClass();
                if (this.f51130c == null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    r3Var.N1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                r3.X0(this.f51129b, this.f51130c, this.e, twoStepVerificationActivity2);
                return;
        }
    }

    public s0(r3 r3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.f51129b = r3Var;
        this.f51130c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
    }
}

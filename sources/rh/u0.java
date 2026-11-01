package rh;

import org.telegram.messenger.e20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u0 implements Runnable {
    public final int f47528a = 0;
    public final e4 f47529b;
    public final TLRPC.TL_error f47530c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;
    public final boolean f47531f;

    public u0(e4 e4Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.f47529b = e4Var;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f47531f = z10;
        this.f47530c = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f47528a) {
            case 0:
                TLObject tLObject = this.e;
                boolean z10 = tLObject instanceof TL_account.tmpPassword;
                e4 e4Var = this.f47529b;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                boolean z11 = this.f47531f;
                if (z10) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    e20.i(e4Var.f21584a).f15534y = tmppassword;
                    e20.i(e4Var.f21584a).v(false);
                    e4Var.J1(tmppassword.tmp_password, twoStepVerificationActivity2, z11, null);
                    return;
                }
                e4Var.Q1(this.f47530c, twoStepVerificationActivity2, z11);
                return;
            default:
                if (this.f47530c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    e4 e4Var2 = this.f47529b;
                    ConnectionsManager.getInstance(e4Var2.f21584a).sendRequest(gettmppassword, new a2(e4Var2, twoStepVerificationActivity, this.f47531f, 0));
                    return;
                }
                return;
        }
    }

    public u0(e4 e4Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.f47529b = e4Var;
        this.f47530c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f47531f = z10;
    }
}

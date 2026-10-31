package rh;

import org.telegram.messenger.d20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u0 implements Runnable {
    public final int f47520a = 0;
    public final e4 f47521b;
    public final TLRPC.TL_error f47522c;
    public final TwoStepVerificationActivity d;
    public final TLObject e;
    public final boolean f47523f;

    public u0(e4 e4Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.f47521b = e4Var;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f47523f = z10;
        this.f47522c = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.f47520a) {
            case 0:
                TLObject tLObject = this.e;
                boolean z10 = tLObject instanceof TL_account.tmpPassword;
                e4 e4Var = this.f47521b;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                boolean z11 = this.f47523f;
                if (z10) {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    d20.i(e4Var.f21583a).f15175y = tmppassword;
                    d20.i(e4Var.f21583a).v(false);
                    e4Var.J1(tmppassword.tmp_password, twoStepVerificationActivity2, z11, null);
                    return;
                }
                e4Var.Q1(this.f47522c, twoStepVerificationActivity2, z11);
                return;
            default:
                if (this.f47522c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.q0(password);
                    TLRPC.TL_inputCheckPasswordSRP p02 = twoStepVerificationActivity.p0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = p02;
                    gettmppassword.period = 600;
                    e4 e4Var2 = this.f47521b;
                    ConnectionsManager.getInstance(e4Var2.f21583a).sendRequest(gettmppassword, new a2(e4Var2, twoStepVerificationActivity, this.f47523f, 0));
                    return;
                }
                return;
        }
    }

    public u0(e4 e4Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.f47521b = e4Var;
        this.f47522c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f47523f = z10;
    }
}

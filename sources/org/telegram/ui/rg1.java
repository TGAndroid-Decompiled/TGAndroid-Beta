package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class rg1 implements org.telegram.ui.ActionBar.z1 {
    public final int f39515a;
    public final TwoStepVerificationActivity f39516b;

    public rg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f39515a = i10;
        this.f39516b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39515a) {
            case 0:
                this.f39516b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f39516b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new sg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f39516b.k0();
                return;
            case 3:
                this.f39516b.u0();
                return;
            default:
                this.f39516b.u0();
                return;
        }
    }
}

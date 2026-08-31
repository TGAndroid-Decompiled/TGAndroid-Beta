package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class tf1 implements org.telegram.ui.ActionBar.c2 {
    public final int f41609a;
    public final TwoStepVerificationActivity f41610b;

    public tf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41609a = i10;
        this.f41610b = twoStepVerificationActivity;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f41609a) {
            case 0:
                this.f41610b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f41610b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new uf1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f41610b.k0();
                return;
            case 3:
                this.f41610b.u0();
                return;
            default:
                this.f41610b.u0();
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class sg1 implements org.telegram.ui.ActionBar.z1 {
    public final int f40139a;
    public final TwoStepVerificationActivity f40140b;

    public sg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40139a = i10;
        this.f40140b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40139a) {
            case 0:
                this.f40140b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40140b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new tg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f40140b.k0();
                return;
            case 3:
                this.f40140b.u0();
                return;
            default:
                this.f40140b.u0();
                return;
        }
    }
}

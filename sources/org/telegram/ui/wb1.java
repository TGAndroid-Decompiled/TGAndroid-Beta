package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class wb1 implements org.telegram.ui.ActionBar.u1 {
    public final int f42923a;
    public final TwoStepVerificationActivity f42924b;

    public wb1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f42923a = i10;
        this.f42924b = twoStepVerificationActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f42923a) {
            case 0:
                this.f42924b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f42924b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new xb1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f42924b.o0();
                return;
            case 3:
                this.f42924b.y0();
                return;
            default:
                this.f42924b.y0();
                return;
        }
    }
}

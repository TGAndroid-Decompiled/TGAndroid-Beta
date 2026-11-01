package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ub1 implements org.telegram.ui.ActionBar.u1 {
    public final int f41906a;
    public final TwoStepVerificationActivity f41907b;

    public ub1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41906a = i10;
        this.f41907b = twoStepVerificationActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f41906a) {
            case 0:
                this.f41907b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f41907b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new vb1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f41907b.p0();
                return;
            case 3:
                this.f41907b.z0();
                return;
            default:
                this.f41907b.z0();
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class rf1 implements org.telegram.ui.ActionBar.c2 {
    public final int f38040a;
    public final TwoStepVerificationActivity f38041b;

    public rf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38040a = i10;
        this.f38041b = twoStepVerificationActivity;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38040a) {
            case 0:
                this.f38041b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f38041b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new sf1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f38041b.k0();
                return;
            case 3:
                this.f38041b.u0();
                return;
            default:
                this.f38041b.u0();
                return;
        }
    }
}

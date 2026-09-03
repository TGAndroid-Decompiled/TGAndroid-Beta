package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class zf1 implements org.telegram.ui.ActionBar.c2 {
    public final int f43953a;
    public final TwoStepVerificationActivity f43954b;

    public zf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f43953a = i10;
        this.f43954b = twoStepVerificationActivity;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f43953a) {
            case 0:
                this.f43954b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f43954b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ag1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f43954b.k0();
                return;
            case 3:
                this.f43954b.u0();
                return;
            default:
                this.f43954b.u0();
                return;
        }
    }
}

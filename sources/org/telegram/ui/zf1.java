package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class zf1 implements org.telegram.ui.ActionBar.c2 {
    public final int f40468a;
    public final TwoStepVerificationActivity f40469b;

    public zf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40468a = i10;
        this.f40469b = twoStepVerificationActivity;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f40468a) {
            case 0:
                this.f40469b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40469b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ag1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f40469b.k0();
                return;
            case 3:
                this.f40469b.u0();
                return;
            default:
                this.f40469b.u0();
                return;
        }
    }
}

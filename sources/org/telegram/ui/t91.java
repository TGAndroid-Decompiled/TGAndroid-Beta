package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class t91 implements org.telegram.ui.ActionBar.p1 {
    public final int f49749a;
    public final TwoStepVerificationActivity f49750b;

    public t91(TwoStepVerificationActivity twoStepVerificationActivity, int i3) {
        this.f49749a = i3;
        this.f49750b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f49749a) {
            case 0:
                this.f49750b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f49750b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new u91(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f49750b.p0();
                return;
            case 3:
                this.f49750b.z0();
                return;
            default:
                this.f49750b.z0();
                return;
        }
    }
}

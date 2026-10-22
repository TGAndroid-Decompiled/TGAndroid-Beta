package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ye1 implements org.telegram.ui.ActionBar.a2 {
    public final int f43479a;
    public final TwoStepVerificationActivity f43480b;

    public ye1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f43479a = i10;
        this.f43480b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43479a) {
            case 0:
                this.f43480b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f43480b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ze1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f43480b.k0();
                return;
            case 3:
                this.f43480b.u0();
                return;
            default:
                this.f43480b.u0();
                return;
        }
    }
}

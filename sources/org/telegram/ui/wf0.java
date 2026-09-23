package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wf0 implements Runnable {
    public final int f38933a;
    public final ag0 f38934b;

    public wf0(ag0 ag0Var, int i10) {
        this.f38933a = i10;
        this.f38934b = ag0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38933a) {
            case 0:
                rg0 rg0Var = this.f38934b.v;
                rg0Var.u1(0, true, null, true);
                rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                rg0 rg0Var2 = this.f38934b.v;
                rg0Var2.u1(0, true, null, true);
                rg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f38934b.p();
                return;
            case 3:
                this.f38934b.f31786b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                rg0 rg0Var3 = this.f38934b.v;
                i10 = ((org.telegram.ui.ActionBar.n2) rg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                rg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}

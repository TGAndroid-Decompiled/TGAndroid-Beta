package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tf0 implements Runnable {
    public final int f38652a;
    public final wf0 f38653b;

    public tf0(wf0 wf0Var, int i10) {
        this.f38652a = i10;
        this.f38653b = wf0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38652a) {
            case 0:
                ng0 ng0Var = this.f38653b.v;
                ng0Var.u1(0, true, null, true);
                ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                ng0 ng0Var2 = this.f38653b.v;
                ng0Var2.u1(0, true, null, true);
                ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f38653b.p();
                return;
            case 3:
                this.f38653b.f39726b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ng0 ng0Var3 = this.f38653b.v;
                i10 = ((org.telegram.ui.ActionBar.p2) ng0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                ng0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}

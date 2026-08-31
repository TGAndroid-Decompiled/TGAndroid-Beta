package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uf0 implements Runnable {
    public final int f41920a;
    public final xf0 f41921b;

    public uf0(xf0 xf0Var, int i10) {
        this.f41920a = i10;
        this.f41921b = xf0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41920a) {
            case 0:
                og0 og0Var = this.f41921b.v;
                og0Var.u1(0, true, null, true);
                og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                og0 og0Var2 = this.f41921b.v;
                og0Var2.u1(0, true, null, true);
                og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f41921b.p();
                return;
            case 3:
                this.f41921b.f43044b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                og0 og0Var3 = this.f41921b.v;
                i10 = ((org.telegram.ui.ActionBar.p2) og0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                og0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}

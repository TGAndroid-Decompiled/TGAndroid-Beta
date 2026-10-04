package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zf0 implements Runnable {
    public final int f43767a;
    public final dg0 f43768b;

    public zf0(dg0 dg0Var, int i10) {
        this.f43767a = i10;
        this.f43768b = dg0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43767a) {
            case 0:
                ug0 ug0Var = this.f43768b.v;
                ug0Var.u1(0, true, null, true);
                ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                ug0 ug0Var2 = this.f43768b.v;
                ug0Var2.u1(0, true, null, true);
                ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f43768b.p();
                return;
            case 3:
                this.f43768b.f35761b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ug0 ug0Var3 = this.f43768b.v;
                i10 = ((org.telegram.ui.ActionBar.n2) ug0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                ug0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vf0 implements Runnable {
    public final int f38710a;
    public final zf0 f38711b;

    public vf0(zf0 zf0Var, int i10) {
        this.f38710a = i10;
        this.f38711b = zf0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38710a) {
            case 0:
                qg0 qg0Var = this.f38711b.v;
                qg0Var.u1(0, true, null, true);
                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                qg0 qg0Var2 = this.f38711b.v;
                qg0Var2.u1(0, true, null, true);
                qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f38711b.p();
                return;
            case 3:
                this.f38711b.f40461b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                qg0 qg0Var3 = this.f38711b.v;
                i10 = ((org.telegram.ui.ActionBar.m2) qg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                qg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}

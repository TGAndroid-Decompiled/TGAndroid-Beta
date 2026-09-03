package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vf0 implements Runnable {
    public final int f39085a;
    public final yf0 f39086b;

    public vf0(yf0 yf0Var, int i10) {
        this.f39085a = i10;
        this.f39086b = yf0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39085a) {
            case 0:
                pg0 pg0Var = this.f39086b.v;
                pg0Var.u1(0, true, null, true);
                pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                pg0 pg0Var2 = this.f39086b.v;
                pg0Var2.u1(0, true, null, true);
                pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f39086b.p();
                return;
            case 3:
                this.f39086b.f40260b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                pg0 pg0Var3 = this.f39086b.v;
                i10 = ((org.telegram.ui.ActionBar.p2) pg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                pg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}

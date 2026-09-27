package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yf0 implements Runnable {
    public final int f40205a;
    public final cg0 f40206b;

    public yf0(cg0 cg0Var, int i10) {
        this.f40205a = i10;
        this.f40206b = cg0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40205a) {
            case 0:
                tg0 tg0Var = this.f40206b.v;
                tg0Var.u1(0, true, null, true);
                tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 1:
                tg0 tg0Var2 = this.f40206b.v;
                tg0Var2.u1(0, true, null, true);
                tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                return;
            case 2:
                this.f40206b.p();
                return;
            case 3:
                this.f40206b.f32710b.setLoading(false);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                tg0 tg0Var3 = this.f40206b.v;
                i10 = ((org.telegram.ui.ActionBar.o2) tg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                tg0Var3.presentFragment(premiumPreviewFragment);
                return;
        }
    }
}

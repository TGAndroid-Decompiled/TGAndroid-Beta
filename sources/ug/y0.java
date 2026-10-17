package ug;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.PrivacyControlActivity;
public final class y0 implements Runnable {
    public final int f47839a;
    public final l1 f47840b;

    public y0(l1 l1Var, int i10) {
        this.f47839a = i10;
        this.f47840b = l1Var;
    }

    @Override
    public final void run() {
        switch (this.f47839a) {
            case 0:
                this.f47840b.c0(true);
                return;
            case 1:
                this.f47840b.f47725d0.setVisibility(8);
                return;
            case 2:
                l1 l1Var = this.f47840b;
                l1Var.X();
                l1Var.j0(true, false);
                return;
            case 3:
                f1 f1Var = this.f47840b.Z;
                f1Var.f50169b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                f1 f1Var2 = this.f47840b.Z;
                f1Var2.f50169b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                l1 l1Var2 = this.f47840b;
                l1Var2.X();
                l1Var2.j0(true, false);
                return;
            case 6:
                this.f47840b.d0(true);
                return;
            case 7:
                this.f47840b.f47725d0.setVisibility(8);
                return;
            case 8:
                l1 l1Var3 = this.f47840b;
                l1Var3.X();
                l1Var3.j0(true, false);
                return;
            case 9:
                n2 n2Var = this.f47840b.f24915n;
                if (n2Var != 0) {
                    ?? obj = new Object();
                    obj.f21552a = true;
                    n2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f47840b.i0(true, true);
                return;
            case 11:
                this.f47840b.dismiss();
                return;
            default:
                l1 l1Var4 = this.f47840b;
                l1Var4.X();
                l1Var4.j0(true, false);
                return;
        }
    }
}

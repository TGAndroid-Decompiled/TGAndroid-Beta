package ug;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.PrivacyControlActivity;
public final class z0 implements Runnable {
    public final int f47820a;
    public final m1 f47821b;

    public z0(m1 m1Var, int i10) {
        this.f47820a = i10;
        this.f47821b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f47820a) {
            case 0:
                this.f47821b.c0(true);
                return;
            case 1:
                this.f47821b.f47706d0.setVisibility(8);
                return;
            case 2:
                m1 m1Var = this.f47821b;
                m1Var.X();
                m1Var.j0(true, false);
                return;
            case 3:
                g1 g1Var = this.f47821b.Z;
                g1Var.f50148b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                g1 g1Var2 = this.f47821b.Z;
                g1Var2.f50148b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                m1 m1Var2 = this.f47821b;
                m1Var2.X();
                m1Var2.j0(true, false);
                return;
            case 6:
                this.f47821b.d0(true);
                return;
            case 7:
                this.f47821b.f47706d0.setVisibility(8);
                return;
            case 8:
                m1 m1Var3 = this.f47821b;
                m1Var3.X();
                m1Var3.j0(true, false);
                return;
            case 9:
                n2 n2Var = this.f47821b.f24915n;
                if (n2Var != 0) {
                    ?? obj = new Object();
                    obj.f21552a = true;
                    n2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f47821b.i0(true, true);
                return;
            case 11:
                this.f47821b.dismiss();
                return;
            default:
                m1 m1Var4 = this.f47821b;
                m1Var4.X();
                m1Var4.j0(true, false);
                return;
        }
    }
}

package tg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.PrivacyControlActivity;
public final class z0 implements Runnable {
    public final int f48543a;
    public final m1 f48544b;

    public z0(m1 m1Var, int i10) {
        this.f48543a = i10;
        this.f48544b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f48543a) {
            case 0:
                this.f48544b.c0(true);
                return;
            case 1:
                this.f48544b.f48425d0.setVisibility(8);
                return;
            case 2:
                m1 m1Var = this.f48544b;
                m1Var.X();
                m1Var.j0(true, false);
                return;
            case 3:
                h1 h1Var = this.f48544b.Z;
                h1Var.f51231b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                h1 h1Var2 = this.f48544b.Z;
                h1Var2.f51231b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                m1 m1Var2 = this.f48544b;
                m1Var2.X();
                m1Var2.j0(true, false);
                return;
            case 6:
                this.f48544b.d0(true);
                return;
            case 7:
                this.f48544b.f48425d0.setVisibility(8);
                return;
            case 8:
                m1 m1Var3 = this.f48544b;
                m1Var3.X();
                m1Var3.j0(true, false);
                return;
            case 9:
                m2 m2Var = this.f48544b.f25523n;
                if (m2Var != 0) {
                    ?? obj = new Object();
                    obj.f21313a = true;
                    m2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f48544b.i0(true, true);
                return;
            case 11:
                this.f48544b.dismiss();
                return;
            default:
                m1 m1Var4 = this.f48544b;
                m1Var4.X();
                m1Var4.j0(true, false);
                return;
        }
    }
}

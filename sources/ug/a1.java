package ug;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.PrivacyControlActivity;
public final class a1 implements Runnable {
    public final int f46278a;
    public final m1 f46279b;

    public a1(m1 m1Var, int i10) {
        this.f46278a = i10;
        this.f46279b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f46278a) {
            case 0:
                this.f46279b.c0(true);
                return;
            case 1:
                this.f46279b.f46343d0.setVisibility(8);
                return;
            case 2:
                m1 m1Var = this.f46279b;
                m1Var.X();
                m1Var.j0(true, false);
                return;
            case 3:
                h1 h1Var = this.f46279b.Z;
                h1Var.f48768b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                h1 h1Var2 = this.f46279b.Z;
                h1Var2.f48768b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                m1 m1Var2 = this.f46279b;
                m1Var2.X();
                m1Var2.j0(true, false);
                return;
            case 6:
                this.f46279b.d0(true);
                return;
            case 7:
                this.f46279b.f46343d0.setVisibility(8);
                return;
            case 8:
                m1 m1Var3 = this.f46279b;
                m1Var3.X();
                m1Var3.j0(true, false);
                return;
            case 9:
                m2 m2Var = this.f46279b.f24345n;
                if (m2Var != 0) {
                    ?? obj = new Object();
                    obj.f20469a = true;
                    m2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f46279b.i0(true, true);
                return;
            case 11:
                this.f46279b.dismiss();
                return;
            default:
                m1 m1Var4 = this.f46279b;
                m1Var4.X();
                m1Var4.j0(true, false);
                return;
        }
    }
}

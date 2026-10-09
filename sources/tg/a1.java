package tg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.PrivacyControlActivity;
public final class a1 implements Runnable {
    public final int f48288a;
    public final m1 f48289b;

    public a1(m1 m1Var, int i10) {
        this.f48288a = i10;
        this.f48289b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f48288a) {
            case 0:
                this.f48289b.c0(true);
                return;
            case 1:
                this.f48289b.f48356d0.setVisibility(8);
                return;
            case 2:
                m1 m1Var = this.f48289b;
                m1Var.X();
                m1Var.j0(true, false);
                return;
            case 3:
                h1 h1Var = this.f48289b.Z;
                h1Var.f51142b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                h1 h1Var2 = this.f48289b.Z;
                h1Var2.f51142b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                m1 m1Var2 = this.f48289b;
                m1Var2.X();
                m1Var2.j0(true, false);
                return;
            case 6:
                this.f48289b.d0(true);
                return;
            case 7:
                this.f48289b.f48356d0.setVisibility(8);
                return;
            case 8:
                m1 m1Var3 = this.f48289b;
                m1Var3.X();
                m1Var3.j0(true, false);
                return;
            case 9:
                n2 n2Var = this.f48289b.f26025n;
                if (n2Var != 0) {
                    ?? obj = new Object();
                    obj.f21357a = true;
                    n2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f48289b.i0(true, true);
                return;
            case 11:
                this.f48289b.dismiss();
                return;
            default:
                m1 m1Var4 = this.f48289b;
                m1Var4.X();
                m1Var4.j0(true, false);
                return;
        }
    }
}

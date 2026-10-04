package tg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.PrivacyControlActivity;
public final class a1 implements Runnable {
    public final int f46974a;
    public final m1 f46975b;

    public a1(m1 m1Var, int i10) {
        this.f46974a = i10;
        this.f46975b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f46974a) {
            case 0:
                this.f46975b.b0(true);
                return;
            case 1:
                this.f46975b.f47043d0.setVisibility(8);
                return;
            case 2:
                m1 m1Var = this.f46975b;
                m1Var.U();
                m1Var.i0(true, false);
                return;
            case 3:
                h1 h1Var = this.f46975b.Z;
                h1Var.f49851b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                h1 h1Var2 = this.f46975b.Z;
                h1Var2.f49851b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                m1 m1Var2 = this.f46975b;
                m1Var2.U();
                m1Var2.i0(true, false);
                return;
            case 6:
                this.f46975b.c0(true);
                return;
            case 7:
                this.f46975b.f47043d0.setVisibility(8);
                return;
            case 8:
                m1 m1Var3 = this.f46975b;
                m1Var3.U();
                m1Var3.i0(true, false);
                return;
            case 9:
                n2 n2Var = this.f46975b.f25303n;
                if (n2Var != 0) {
                    ?? obj = new Object();
                    obj.f21349a = true;
                    n2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f46975b.h0(true, true);
                return;
            case 11:
                this.f46975b.dismiss();
                return;
            default:
                m1 m1Var4 = this.f46975b;
                m1Var4.U();
                m1Var4.i0(true, false);
                return;
        }
    }
}

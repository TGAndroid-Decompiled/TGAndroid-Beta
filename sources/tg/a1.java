package tg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.PrivacyControlActivity;
public final class a1 implements Runnable {
    public final int f43376a;
    public final m1 f43377b;

    public a1(m1 m1Var, int i10) {
        this.f43376a = i10;
        this.f43377b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f43376a) {
            case 0:
                this.f43377b.b0(true);
                return;
            case 1:
                this.f43377b.f43440d0.setVisibility(8);
                return;
            case 2:
                m1 m1Var = this.f43377b;
                m1Var.W();
                m1Var.i0(true, false);
                return;
            case 3:
                h1 h1Var = this.f43377b.Z;
                h1Var.f46052b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                h1 h1Var2 = this.f43377b.Z;
                h1Var2.f46052b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                m1 m1Var2 = this.f43377b;
                m1Var2.W();
                m1Var2.i0(true, false);
                return;
            case 6:
                this.f43377b.c0(true);
                return;
            case 7:
                this.f43377b.f43440d0.setVisibility(8);
                return;
            case 8:
                m1 m1Var3 = this.f43377b;
                m1Var3.W();
                m1Var3.i0(true, false);
                return;
            case 9:
                m2 m2Var = this.f43377b.f22958n;
                if (m2Var != 0) {
                    ?? obj = new Object();
                    obj.f19582a = true;
                    m2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f43377b.h0(true, true);
                return;
            case 11:
                this.f43377b.dismiss();
                return;
            default:
                m1 m1Var4 = this.f43377b;
                m1Var4.W();
                m1Var4.i0(true, false);
                return;
        }
    }
}

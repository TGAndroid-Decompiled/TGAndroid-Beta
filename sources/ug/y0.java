package ug;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.PrivacyControlActivity;
public final class y0 implements Runnable {
    public final int f48263a;
    public final l1 f48264b;

    public y0(l1 l1Var, int i10) {
        this.f48263a = i10;
        this.f48264b = l1Var;
    }

    @Override
    public final void run() {
        switch (this.f48263a) {
            case 0:
                this.f48264b.b0(true);
                return;
            case 1:
                this.f48264b.f48149d0.setVisibility(8);
                return;
            case 2:
                l1 l1Var = this.f48264b;
                l1Var.W();
                l1Var.i0(true, false);
                return;
            case 3:
                f1 f1Var = this.f48264b.Z;
                f1Var.f50596b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                f1 f1Var2 = this.f48264b.Z;
                f1Var2.f50596b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                l1 l1Var2 = this.f48264b;
                l1Var2.W();
                l1Var2.i0(true, false);
                return;
            case 6:
                this.f48264b.c0(true);
                return;
            case 7:
                this.f48264b.f48149d0.setVisibility(8);
                return;
            case 8:
                l1 l1Var3 = this.f48264b;
                l1Var3.W();
                l1Var3.i0(true, false);
                return;
            case 9:
                o2 o2Var = this.f48264b.f33212n;
                if (o2Var != 0) {
                    ?? obj = new Object();
                    obj.f21637a = true;
                    o2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f48264b.h0(true, true);
                return;
            case 11:
                this.f48264b.dismiss();
                return;
            default:
                l1 l1Var4 = this.f48264b;
                l1Var4.W();
                l1Var4.i0(true, false);
                return;
        }
    }
}

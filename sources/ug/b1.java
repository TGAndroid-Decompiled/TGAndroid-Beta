package ug;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.PrivacyControlActivity;
public final class b1 implements Runnable {
    public final int f47092a;
    public final n1 f47093b;

    public b1(n1 n1Var, int i10) {
        this.f47092a = i10;
        this.f47093b = n1Var;
    }

    @Override
    public final void run() {
        switch (this.f47092a) {
            case 0:
                this.f47093b.b0(true);
                return;
            case 1:
                this.f47093b.f47160d0.setVisibility(8);
                return;
            case 2:
                n1 n1Var = this.f47093b;
                n1Var.W();
                n1Var.i0(true, false);
                return;
            case 3:
                i1 i1Var = this.f47093b.Z;
                i1Var.f50180b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                i1 i1Var2 = this.f47093b.Z;
                i1Var2.f50180b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                n1 n1Var2 = this.f47093b;
                n1Var2.W();
                n1Var2.i0(true, false);
                return;
            case 6:
                this.f47093b.c0(true);
                return;
            case 7:
                this.f47093b.f47160d0.setVisibility(8);
                return;
            case 8:
                n1 n1Var3 = this.f47093b;
                n1Var3.W();
                n1Var3.i0(true, false);
                return;
            case 9:
                n2 n2Var = this.f47093b.f24649n;
                if (n2Var != 0) {
                    ?? obj = new Object();
                    obj.f21142a = true;
                    n2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f47093b.h0(true, true);
                return;
            case 11:
                this.f47093b.dismiss();
                return;
            default:
                n1 n1Var4 = this.f47093b;
                n1Var4.W();
                n1Var4.i0(true, false);
                return;
        }
    }
}

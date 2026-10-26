package vg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.PrivacyControlActivity;
public final class a1 implements Runnable {
    public final int f50142a;
    public final n1 f50143b;

    public a1(n1 n1Var, int i10) {
        this.f50142a = i10;
        this.f50143b = n1Var;
    }

    @Override
    public final void run() {
        switch (this.f50142a) {
            case 0:
                this.f50143b.b0(true);
                return;
            case 1:
                this.f50143b.f50212d0.setVisibility(8);
                return;
            case 2:
                n1 n1Var = this.f50143b;
                n1Var.W();
                n1Var.i0(true, false);
                return;
            case 3:
                h1 h1Var = this.f50143b.Z;
                h1Var.f52877b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                h1 h1Var2 = this.f50143b.Z;
                h1Var2.f52877b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                n1 n1Var2 = this.f50143b;
                n1Var2.W();
                n1Var2.i0(true, false);
                return;
            case 6:
                this.f50143b.c0(true);
                return;
            case 7:
                this.f50143b.f50212d0.setVisibility(8);
                return;
            case 8:
                n1 n1Var3 = this.f50143b;
                n1Var3.W();
                n1Var3.i0(true, false);
                return;
            case 9:
                r2 r2Var = this.f50143b.f26811n;
                if (r2Var != 0) {
                    ?? obj = new Object();
                    obj.f22928a = true;
                    r2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f50143b.h0(true, true);
                return;
            case 11:
                this.f50143b.dismiss();
                return;
            default:
                n1 n1Var4 = this.f50143b;
                n1Var4.W();
                n1Var4.i0(true, false);
                return;
        }
    }
}

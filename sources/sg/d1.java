package sg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.PrivacyControlActivity;
public final class d1 implements Runnable {
    public final int f41906a;
    public final p1 f41907b;

    public d1(p1 p1Var, int i10) {
        this.f41906a = i10;
        this.f41907b = p1Var;
    }

    @Override
    public final void run() {
        switch (this.f41906a) {
            case 0:
                this.f41907b.b0(true);
                return;
            case 1:
                this.f41907b.f41970d0.setVisibility(8);
                return;
            case 2:
                p1 p1Var = this.f41907b;
                p1Var.W();
                p1Var.i0(true, false);
                return;
            case 3:
                k1 k1Var = this.f41907b.Z;
                k1Var.f43999b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                k1 k1Var2 = this.f41907b.Z;
                k1Var2.f43999b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                p1 p1Var2 = this.f41907b;
                p1Var2.W();
                p1Var2.i0(true, false);
                return;
            case 6:
                this.f41907b.c0(true);
                return;
            case 7:
                this.f41907b.f41970d0.setVisibility(8);
                return;
            case 8:
                p1 p1Var3 = this.f41907b;
                p1Var3.W();
                p1Var3.i0(true, false);
                return;
            case 9:
                p2 p2Var = this.f41907b.f21452n;
                if (p2Var != 0) {
                    ?? obj = new Object();
                    obj.f18485a = true;
                    p2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f41907b.h0(true, true);
                return;
            case 11:
                this.f41907b.dismiss();
                return;
            default:
                p1 p1Var4 = this.f41907b;
                p1Var4.W();
                p1Var4.i0(true, false);
                return;
        }
    }
}

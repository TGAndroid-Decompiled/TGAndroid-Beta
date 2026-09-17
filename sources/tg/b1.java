package tg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.PrivacyControlActivity;
public final class b1 implements Runnable {
    public final int f43134a;
    public final n1 f43135b;

    public b1(n1 n1Var, int i10) {
        this.f43134a = i10;
        this.f43135b = n1Var;
    }

    @Override
    public final void run() {
        switch (this.f43134a) {
            case 0:
                this.f43135b.b0(true);
                return;
            case 1:
                this.f43135b.f43200d0.setVisibility(8);
                return;
            case 2:
                n1 n1Var = this.f43135b;
                n1Var.W();
                n1Var.i0(true, false);
                return;
            case 3:
                i1 i1Var = this.f43135b.Z;
                i1Var.f45796b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                i1 i1Var2 = this.f43135b.Z;
                i1Var2.f45796b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                n1 n1Var2 = this.f43135b;
                n1Var2.W();
                n1Var2.i0(true, false);
                return;
            case 6:
                this.f43135b.c0(true);
                return;
            case 7:
                this.f43135b.f43200d0.setVisibility(8);
                return;
            case 8:
                n1 n1Var3 = this.f43135b;
                n1Var3.W();
                n1Var3.i0(true, false);
                return;
            case 9:
                o2 o2Var = this.f43135b.f30451n;
                if (o2Var != 0) {
                    ?? obj = new Object();
                    obj.f19397a = true;
                    o2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f43135b.h0(true, true);
                return;
            case 11:
                this.f43135b.dismiss();
                return;
            default:
                n1 n1Var4 = this.f43135b;
                n1Var4.W();
                n1Var4.i0(true, false);
                return;
        }
    }
}

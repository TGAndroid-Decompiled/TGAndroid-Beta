package wg;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ng0;
public final class x0 implements Runnable {
    public final int f57744a;
    public final f1 f57745b;

    public x0(f1 f1Var, int i7) {
        this.f57744a = i7;
        this.f57745b = f1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f57744a;
        f1 f1Var = this.f57745b;
        switch (i7) {
            case 0:
                f1Var.j1(true);
                return;
            case 1:
                f1Var.V1.setVisibility(8);
                return;
            case 2:
                f1Var.e1();
                f1Var.p1(true, false);
                return;
            case 3:
                ng0 ng0Var = f1Var.R1;
                ng0Var.f1097b.r(hd.M0(2131745837, null), true);
                return;
            case 4:
                ng0 ng0Var2 = f1Var.R1;
                ng0Var2.f1097b.r(hd.M0(2131749649, null), true);
                return;
            case 5:
                f1Var.e1();
                f1Var.p1(true, false);
                return;
            case 6:
                ArrayList arrayList = f1Var.f57637b2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ui.b0(f1Var.f28612a).f25810i1);
                    f1Var.o1(true, true);
                    return;
                }
                return;
            case 7:
                f1Var.V1.setVisibility(8);
                return;
            case 8:
                f1Var.e1();
                f1Var.p1(true, false);
                return;
            case 9:
                f2 f2Var = f1Var.f36224o1;
                if (f2Var != 0) {
                    ?? obj = new Object();
                    obj.f27420a = true;
                    f2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                f1Var.o1(true, true);
                return;
            case 11:
                f1Var.dismiss();
                return;
            default:
                f1Var.e1();
                f1Var.p1(true, false);
                return;
        }
    }
}

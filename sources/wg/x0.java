package wg;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ng0;
public final class x0 implements Runnable {
    public final int f57743a;
    public final f1 f57744b;

    public x0(f1 f1Var, int i7) {
        this.f57743a = i7;
        this.f57744b = f1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f57743a;
        f1 f1Var = this.f57744b;
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
                ArrayList arrayList = f1Var.f57636b2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ui.b0(f1Var.f28613a).f25818i1);
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
                f2 f2Var = f1Var.f36263o1;
                if (f2Var != 0) {
                    ?? obj = new Object();
                    obj.f27421a = true;
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

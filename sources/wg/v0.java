package wg;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.si;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ng0;
public final class v0 implements Runnable {
    public final int f59262a;
    public final c1 f59263b;

    public v0(c1 c1Var, int i7) {
        this.f59262a = i7;
        this.f59263b = c1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f59262a;
        c1 c1Var = this.f59263b;
        switch (i7) {
            case 0:
                c1Var.j1(true);
                return;
            case 1:
                c1Var.Z1.setVisibility(8);
                return;
            case 2:
                c1Var.e1();
                c1Var.p1(true, false);
                return;
            case 3:
                ng0 ng0Var = c1Var.V1;
                ng0Var.f1095b.r(hd.M0(2131745836, null), true);
                return;
            case 4:
                ng0 ng0Var2 = c1Var.V1;
                ng0Var2.f1095b.r(hd.M0(2131749650, null), true);
                return;
            case 5:
                c1Var.e1();
                c1Var.p1(true, false);
                return;
            case 6:
                ArrayList arrayList = c1Var.f59148f2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(si.b0(c1Var.f29679a).f26482j1);
                    c1Var.o1(true, true);
                    return;
                }
                return;
            case 7:
                c1Var.Z1.setVisibility(8);
                return;
            case 8:
                c1Var.e1();
                c1Var.p1(true, false);
                return;
            case 9:
                e2 e2Var = c1Var.f35940s1;
                if (e2Var != 0) {
                    ?? obj = new Object();
                    obj.f28476a = true;
                    e2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                c1Var.o1(true, true);
                return;
            case 11:
                c1Var.dismiss();
                return;
            default:
                c1Var.e1();
                c1Var.p1(true, false);
                return;
        }
    }
}

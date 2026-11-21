package wg;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ri;
import org.telegram.ui.sg0;
public final class x0 implements Runnable {
    public final int f59894a;
    public final e1 f59895b;

    public x0(e1 e1Var, int i7) {
        this.f59894a = i7;
        this.f59895b = e1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f59894a;
        e1 e1Var = this.f59895b;
        switch (i7) {
            case 0:
                e1Var.i1(true);
                return;
            case 1:
                e1Var.Z1.setVisibility(8);
                return;
            case 2:
                e1Var.e1();
                e1Var.m1(true, false);
                return;
            case 3:
                sg0 sg0Var = e1Var.V1;
                sg0Var.f1094b.r(gd.N0(2131745640, null), true);
                return;
            case 4:
                sg0 sg0Var2 = e1Var.V1;
                sg0Var2.f1094b.r(gd.N0(2131749477, null), true);
                return;
            case 5:
                e1Var.e1();
                e1Var.m1(true, false);
                return;
            case 6:
                ArrayList arrayList = e1Var.f59787e2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ri.d0(e1Var.f30170a).f26648j1);
                    e1Var.l1(true, true);
                    return;
                }
                return;
            case 7:
                e1Var.Z1.setVisibility(8);
                return;
            case 8:
                e1Var.e1();
                e1Var.m1(true, false);
                return;
            case 9:
                e1Var.l1(true, true);
                return;
            case 10:
                e1Var.dismiss();
                return;
            default:
                e1Var.e1();
                e1Var.m1(true, false);
                return;
        }
    }
}

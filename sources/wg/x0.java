package wg;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ri;
import org.telegram.ui.rg0;
public final class x0 implements Runnable {
    public final int f59852a;
    public final d1 f59853b;

    public x0(d1 d1Var, int i7) {
        this.f59852a = i7;
        this.f59853b = d1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f59852a;
        d1 d1Var = this.f59853b;
        switch (i7) {
            case 0:
                d1Var.i1(true);
                return;
            case 1:
                d1Var.Z1.setVisibility(8);
                return;
            case 2:
                d1Var.e1();
                d1Var.m1(true, false);
                return;
            case 3:
                rg0 rg0Var = d1Var.V1;
                rg0Var.f1094b.r(gd.M0(2131745641, null), true);
                return;
            case 4:
                rg0 rg0Var2 = d1Var.V1;
                rg0Var2.f1094b.r(gd.M0(2131749478, null), true);
                return;
            case 5:
                d1Var.e1();
                d1Var.m1(true, false);
                return;
            case 6:
                ArrayList arrayList = d1Var.f59740e2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ri.d0(d1Var.f30189a).f26622j1);
                    d1Var.l1(true, true);
                    return;
                }
                return;
            case 7:
                d1Var.Z1.setVisibility(8);
                return;
            case 8:
                d1Var.e1();
                d1Var.m1(true, false);
                return;
            case 9:
                d1Var.l1(true, true);
                return;
            case 10:
                d1Var.dismiss();
                return;
            default:
                d1Var.e1();
                d1Var.m1(true, false);
                return;
        }
    }
}

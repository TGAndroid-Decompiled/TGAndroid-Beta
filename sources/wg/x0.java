package wg;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ri;
import org.telegram.ui.sg0;
public final class x0 implements Runnable {
    public final int f59853a;
    public final d1 f59854b;

    public x0(d1 d1Var, int i7) {
        this.f59853a = i7;
        this.f59854b = d1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f59853a;
        d1 d1Var = this.f59854b;
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
                sg0 sg0Var = d1Var.V1;
                sg0Var.f1094b.r(gd.M0(2131745641, null), true);
                return;
            case 4:
                sg0 sg0Var2 = d1Var.V1;
                sg0Var2.f1094b.r(gd.M0(2131749478, null), true);
                return;
            case 5:
                d1Var.e1();
                d1Var.m1(true, false);
                return;
            case 6:
                ArrayList arrayList = d1Var.f59741e2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ri.d0(d1Var.f30187a).f26620j1);
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

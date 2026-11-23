package wg;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.si;
import org.telegram.ui.sg0;
public final class x0 implements Runnable {
    public final int f59898a;
    public final e1 f59899b;

    public x0(e1 e1Var, int i7) {
        this.f59898a = i7;
        this.f59899b = e1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f59898a;
        e1 e1Var = this.f59899b;
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
                sg0Var.f1094b.r(hd.N0(2131745640, null), true);
                return;
            case 4:
                sg0 sg0Var2 = e1Var.V1;
                sg0Var2.f1094b.r(hd.N0(2131749477, null), true);
                return;
            case 5:
                e1Var.e1();
                e1Var.m1(true, false);
                return;
            case 6:
                ArrayList arrayList = e1Var.f59791e2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(si.d0(e1Var.f30173a).f26834j1);
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

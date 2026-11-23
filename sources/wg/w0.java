package wg;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ri;
import org.telegram.ui.qg0;
public final class w0 implements Runnable {
    public final int f59958a;
    public final d1 f59959b;

    public w0(d1 d1Var, int i7) {
        this.f59958a = i7;
        this.f59959b = d1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f59958a;
        d1 d1Var = this.f59959b;
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
                qg0 qg0Var = d1Var.V1;
                qg0Var.f1094b.r(gd.N0(2131745640, null), true);
                return;
            case 4:
                qg0 qg0Var2 = d1Var.V1;
                qg0Var2.f1094b.r(gd.N0(2131749477, null), true);
                return;
            case 5:
                d1Var.e1();
                d1Var.m1(true, false);
                return;
            case 6:
                ArrayList arrayList = d1Var.f59851e2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ri.d0(d1Var.f30223a).f26721j1);
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

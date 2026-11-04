package xg;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.li;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.hg0;
public final class x0 implements Runnable {
    public final int f58787a;
    public final e1 f58788b;

    public x0(e1 e1Var, int i3) {
        this.f58787a = i3;
        this.f58788b = e1Var;
    }

    @Override
    public final void run() {
        int i3 = this.f58787a;
        e1 e1Var = this.f58788b;
        switch (i3) {
            case 0:
                e1Var.j1(true);
                return;
            case 1:
                e1Var.W1.setVisibility(8);
                return;
            case 2:
                e1Var.e1();
                e1Var.p1(true, false);
                return;
            case 3:
                hg0 hg0Var = e1Var.S1;
                hg0Var.f3334b.r(bd.M0(2131745846, null), true);
                return;
            case 4:
                hg0 hg0Var2 = e1Var.S1;
                hg0Var2.f3334b.r(bd.M0(2131749658, null), true);
                return;
            case 5:
                e1Var.e1();
                e1Var.p1(true, false);
                return;
            case 6:
                ArrayList arrayList = e1Var.c2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(li.b0(e1Var.f28583a).f24032j1);
                    e1Var.o1(true, true);
                    return;
                }
                return;
            case 7:
                e1Var.W1.setVisibility(8);
                return;
            case 8:
                e1Var.e1();
                e1Var.p1(true, false);
                return;
            case 9:
                d2 d2Var = e1Var.f36105p1;
                if (d2Var != 0) {
                    ?? obj = new Object();
                    obj.f27395a = true;
                    d2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                e1Var.o1(true, true);
                return;
            case 11:
                e1Var.dismiss();
                return;
            default:
                e1Var.e1();
                e1Var.p1(true, false);
                return;
        }
    }
}

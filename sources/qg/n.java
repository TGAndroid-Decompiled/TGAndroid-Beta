package qg;

import ci.n5;
import java.util.List;
import org.telegram.ui.Components.x01;
import org.telegram.ui.em0;
import w7.x5;
public final class n implements Runnable {
    public final int f41474a;
    public final p0 f41475b;

    public n(p0 p0Var, int i10) {
        this.f41474a = i10;
        this.f41475b = p0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f41474a) {
            case 0:
                p0 p0Var = this.f41475b;
                x01 x01Var = p0Var.f41515a1;
                if (x01Var != null) {
                    p0Var.f41515a1 = null;
                    p0Var.removeView(x01Var);
                    return;
                }
                return;
            case 1:
                p0 p0Var2 = this.f41475b;
                if (p0Var2.E0 != null) {
                    p0Var2.G0.postRunnable(new n(p0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                z1 z1Var = this.f41475b.l1;
                if (z1Var != null) {
                    z1Var.invalidate();
                    return;
                }
                return;
            case 3:
                p0.a0(this.f41475b);
                return;
            default:
                p0 p0Var3 = this.f41475b;
                boolean z10 = pg.s0.e(p0Var3.P1).f40999k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f40907b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        em0 em0Var = new em0(p0Var3, lVar, e, 12);
                        o0 o0Var = new o0(p0Var3, p0Var3.getContext());
                        o0Var.setIcon(e);
                        o0Var.setText(n10);
                        o0Var.setSelected(false);
                        o0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(em0Var, 6));
                        o0Var.setOnLongClickListener(new n5(p0Var3, 6));
                        p0Var3.S1.a(o0Var, x5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

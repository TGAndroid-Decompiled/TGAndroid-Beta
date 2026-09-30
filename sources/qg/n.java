package qg;

import ci.m5;
import java.util.List;
import org.telegram.ui.Components.n11;
import org.telegram.ui.vl0;
import w7.y5;
public final class n implements Runnable {
    public final int f41869a;
    public final n0 f41870b;

    public n(n0 n0Var, int i10) {
        this.f41869a = i10;
        this.f41870b = n0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f41869a) {
            case 0:
                n0 n0Var = this.f41870b;
                n11 n11Var = n0Var.f41871a1;
                if (n11Var != null) {
                    n0Var.f41871a1 = null;
                    n0Var.removeView(n11Var);
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f41870b;
                if (n0Var2.E0 != null) {
                    n0Var2.G0.postRunnable(new n(n0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                x1 x1Var = this.f41870b.l1;
                if (x1Var != null) {
                    x1Var.invalidate();
                    return;
                }
                return;
            case 3:
                n0.a0(this.f41870b);
                return;
            default:
                n0 n0Var3 = this.f41870b;
                boolean z10 = pg.u0.e(n0Var3.P1).f41380k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f41261b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        vl0 vl0Var = new vl0(n0Var3, lVar, e, 12);
                        m0 m0Var = new m0(n0Var3, n0Var3.getContext());
                        m0Var.setIcon(e);
                        m0Var.setText(n10);
                        m0Var.setSelected(false);
                        m0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(vl0Var, 6));
                        m0Var.setOnLongClickListener(new m5(n0Var3, 6));
                        n0Var3.S1.a(m0Var, y5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

package qg;

import ci.n5;
import java.util.List;
import org.telegram.ui.Components.l11;
import org.telegram.ui.fm0;
import w7.y5;
public final class n implements Runnable {
    public final int f41782a;
    public final n0 f41783b;

    public n(n0 n0Var, int i10) {
        this.f41782a = i10;
        this.f41783b = n0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f41782a) {
            case 0:
                n0 n0Var = this.f41783b;
                l11 l11Var = n0Var.f41784a1;
                if (l11Var != null) {
                    n0Var.f41784a1 = null;
                    n0Var.removeView(l11Var);
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f41783b;
                if (n0Var2.E0 != null) {
                    n0Var2.G0.postRunnable(new n(n0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                x1 x1Var = this.f41783b.l1;
                if (x1Var != null) {
                    x1Var.invalidate();
                    return;
                }
                return;
            case 3:
                n0.a0(this.f41783b);
                return;
            default:
                n0 n0Var3 = this.f41783b;
                boolean z10 = pg.u0.e(n0Var3.P1).f41310k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f41192b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        fm0 fm0Var = new fm0(n0Var3, lVar, e, 12);
                        m0 m0Var = new m0(n0Var3, n0Var3.getContext());
                        m0Var.setIcon(e);
                        m0Var.setText(n10);
                        m0Var.setSelected(false);
                        m0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(fm0Var, 6));
                        m0Var.setOnLongClickListener(new n5(n0Var3, 6));
                        n0Var3.S1.a(m0Var, y5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

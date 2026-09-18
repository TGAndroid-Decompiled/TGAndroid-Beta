package qg;

import ci.n5;
import java.util.List;
import org.telegram.ui.Components.m11;
import org.telegram.ui.fm0;
import w7.y5;
public final class n implements Runnable {
    public final int f41802a;
    public final m0 f41803b;

    public n(m0 m0Var, int i10) {
        this.f41802a = i10;
        this.f41803b = m0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f41802a) {
            case 0:
                m0 m0Var = this.f41803b;
                m11 m11Var = m0Var.f41737a1;
                if (m11Var != null) {
                    m0Var.f41737a1 = null;
                    m0Var.removeView(m11Var);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f41803b;
                if (m0Var2.E0 != null) {
                    m0Var2.G0.postRunnable(new n(m0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                w1 w1Var = this.f41803b.l1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 3:
                m0.a0(this.f41803b);
                return;
            default:
                m0 m0Var3 = this.f41803b;
                boolean z10 = pg.u0.e(m0Var3.P1).f41269k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f41151b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        fm0 fm0Var = new fm0(m0Var3, lVar, e, 12);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(e);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(fm0Var, 6));
                        l0Var.setOnLongClickListener(new n5(m0Var3, 6));
                        m0Var3.S1.a(l0Var, y5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

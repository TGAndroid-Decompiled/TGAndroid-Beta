package qg;

import ci.l5;
import java.util.List;
import org.telegram.ui.Components.i21;
import org.telegram.ui.ci0;
import w7.w5;
public final class n implements Runnable {
    public final int f46362a;
    public final m0 f46363b;

    public n(m0 m0Var, int i10) {
        this.f46362a = i10;
        this.f46363b = m0Var;
    }

    @Override
    public final void run() {
        int e7;
        switch (this.f46362a) {
            case 0:
                m0 m0Var = this.f46363b;
                i21 i21Var = m0Var.f46305a1;
                if (i21Var != null) {
                    m0Var.f46305a1 = null;
                    m0Var.removeView(i21Var);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f46363b;
                if (m0Var2.E0 != null) {
                    m0Var2.G0.postRunnable(new n(m0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                w1 w1Var = this.f46363b.l1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 3:
                m0.a0(this.f46363b);
                return;
            default:
                m0 m0Var3 = this.f46363b;
                boolean z10 = pg.t0.e(m0Var3.P1).f45692k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f45571b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e7 = lVar.m();
                        } else {
                            e7 = lVar.e();
                        }
                        String n10 = lVar.n();
                        ci0 ci0Var = new ci0(m0Var3, lVar, e7, 18);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(e7);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(ci0Var, 6));
                        l0Var.setOnLongClickListener(new l5(m0Var3, 6));
                        m0Var3.S1.a(l0Var, w5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

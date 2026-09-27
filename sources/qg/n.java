package qg;

import ci.m5;
import java.util.List;
import org.telegram.ui.Components.m11;
import org.telegram.ui.zl0;
import w7.y5;
public final class n implements Runnable {
    public final int f41836a;
    public final m0 f41837b;

    public n(m0 m0Var, int i10) {
        this.f41836a = i10;
        this.f41837b = m0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f41836a) {
            case 0:
                m0 m0Var = this.f41837b;
                m11 m11Var = m0Var.f41795a1;
                if (m11Var != null) {
                    m0Var.f41795a1 = null;
                    m0Var.removeView(m11Var);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f41837b;
                if (m0Var2.E0 != null) {
                    m0Var2.G0.postRunnable(new n(m0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                w1 w1Var = this.f41837b.l1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 3:
                m0.a0(this.f41837b);
                return;
            default:
                m0 m0Var3 = this.f41837b;
                boolean z10 = pg.u0.e(m0Var3.P1).f41279k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f41160b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        zl0 zl0Var = new zl0(m0Var3, lVar, e, 12);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(e);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(zl0Var, 6));
                        l0Var.setOnLongClickListener(new m5(m0Var3, 6));
                        m0Var3.S1.a(l0Var, y5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

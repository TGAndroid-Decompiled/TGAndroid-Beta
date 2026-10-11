package qg;

import ci.l5;
import java.util.List;
import org.telegram.ui.Components.e21;
import org.telegram.ui.ai0;
import w7.x5;
public final class n implements Runnable {
    public final int f46497a;
    public final m0 f46498b;

    public n(m0 m0Var, int i10) {
        this.f46497a = i10;
        this.f46498b = m0Var;
    }

    @Override
    public final void run() {
        int e7;
        switch (this.f46497a) {
            case 0:
                m0 m0Var = this.f46498b;
                e21 e21Var = m0Var.f46455a1;
                if (e21Var != null) {
                    m0Var.f46455a1 = null;
                    m0Var.removeView(e21Var);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f46498b;
                if (m0Var2.E0 != null) {
                    m0Var2.G0.postRunnable(new n(m0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                w1 w1Var = this.f46498b.l1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 3:
                m0.a0(this.f46498b);
                return;
            default:
                m0 m0Var3 = this.f46498b;
                boolean z10 = pg.u0.e(m0Var3.P1).f45842k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f45714b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e7 = lVar.m();
                        } else {
                            e7 = lVar.e();
                        }
                        String n10 = lVar.n();
                        ai0 ai0Var = new ai0(m0Var3, lVar, e7, 18);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(e7);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new org.telegram.ui.Components.voip.p(ai0Var, 6));
                        l0Var.setOnLongClickListener(new l5(m0Var3, 6));
                        m0Var3.S1.a(l0Var, x5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

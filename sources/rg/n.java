package rg;

import ei.c5;
import java.util.List;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.x31;
import w7.z5;
public final class n implements Runnable {
    public final int f45506a;
    public final m0 f45507b;

    public n(m0 m0Var, int i10) {
        this.f45506a = i10;
        this.f45507b = m0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f45506a) {
            case 0:
                m0 m0Var = this.f45507b;
                u11 u11Var = m0Var.f45465a1;
                if (u11Var != null) {
                    m0Var.f45465a1 = null;
                    m0Var.removeView(u11Var);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f45507b;
                if (m0Var2.E0 != null) {
                    m0Var2.G0.postRunnable(new n(m0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                w1 w1Var = this.f45507b.l1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 3:
                m0.a0(this.f45507b);
                return;
            default:
                m0 m0Var3 = this.f45507b;
                boolean z10 = qg.v0.e(m0Var3.P1).f44676k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.f44546b;
                    if (i10 < list.size()) {
                        qg.l lVar = (qg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        x31 x31Var = new x31(m0Var3, lVar, e, 25);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(e);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new hg.r0(x31Var, 17));
                        l0Var.setOnLongClickListener(new c5(m0Var3, 6));
                        m0Var3.S1.a(l0Var, z5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

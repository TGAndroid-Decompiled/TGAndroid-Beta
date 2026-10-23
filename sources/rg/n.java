package rg;

import ei.c5;
import java.util.List;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.y11;
import w7.z5;
public final class n implements Runnable {
    public final int f45942a;
    public final m0 f45943b;

    public n(m0 m0Var, int i10) {
        this.f45942a = i10;
        this.f45943b = m0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f45942a) {
            case 0:
                m0 m0Var = this.f45943b;
                y11 y11Var = m0Var.f45883a1;
                if (y11Var != null) {
                    m0Var.f45883a1 = null;
                    m0Var.removeView(y11Var);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f45943b;
                if (m0Var2.E0 != null) {
                    m0Var2.G0.postRunnable(new n(m0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                x1 x1Var = this.f45943b.l1;
                if (x1Var != null) {
                    x1Var.invalidate();
                    return;
                }
                return;
            case 3:
                m0.Z(this.f45943b);
                return;
            default:
                m0 m0Var3 = this.f45943b;
                boolean z10 = qg.u0.e(m0Var3.P1).f45098k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.f44974b;
                    if (i10 < list.size()) {
                        qg.l lVar = (qg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        c41 c41Var = new c41(m0Var3, lVar, e, 25);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(e);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new hg.r0(c41Var, 17));
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

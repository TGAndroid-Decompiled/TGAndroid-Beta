package rg;

import ei.c5;
import java.util.List;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.w31;
import w7.z5;
public final class n implements Runnable {
    public final int f45531a;
    public final m0 f45532b;

    public n(m0 m0Var, int i10) {
        this.f45531a = i10;
        this.f45532b = m0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f45531a) {
            case 0:
                m0 m0Var = this.f45532b;
                t11 t11Var = m0Var.f45466a1;
                if (t11Var != null) {
                    m0Var.f45466a1 = null;
                    m0Var.removeView(t11Var);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f45532b;
                if (m0Var2.E0 != null) {
                    m0Var2.G0.postRunnable(new n(m0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                w1 w1Var = this.f45532b.l1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 3:
                m0.a0(this.f45532b);
                return;
            default:
                m0 m0Var3 = this.f45532b;
                boolean z10 = qg.u0.e(m0Var3.P1).f44672k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.f44551b;
                    if (i10 < list.size()) {
                        qg.l lVar = (qg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        w31 w31Var = new w31(m0Var3, lVar, e, 25);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(e);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new hg.r0(w31Var, 17));
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

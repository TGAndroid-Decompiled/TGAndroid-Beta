package pg;

import bi.l6;
import java.util.List;
import org.telegram.ui.Components.k11;
import org.telegram.ui.uu0;
import w7.a6;
public final class n implements Runnable {
    public final int f40164a;
    public final m0 f40165b;

    public n(m0 m0Var, int i10) {
        this.f40164a = i10;
        this.f40165b = m0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f40164a) {
            case 0:
                m0 m0Var = this.f40165b;
                k11 k11Var = m0Var.f40123a1;
                if (k11Var != null) {
                    m0Var.f40123a1 = null;
                    m0Var.removeView(k11Var);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f40165b;
                if (m0Var2.E0 != null) {
                    m0Var2.G0.postRunnable(new n(m0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                w1 w1Var = this.f40165b.l1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 3:
                m0.a0(this.f40165b);
                return;
            default:
                m0 m0Var3 = this.f40165b;
                boolean z10 = og.x0.e(m0Var3.P1).f14559k;
                int i10 = 0;
                while (true) {
                    List list = og.l.f14414b;
                    if (i10 < list.size()) {
                        og.l lVar = (og.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        uu0 uu0Var = new uu0(m0Var3, lVar, e, 9);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(e);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new org.telegram.ui.web.c(uu0Var, 1));
                        l0Var.setOnLongClickListener(new l6(m0Var3, 6));
                        m0Var3.S1.a(l0Var, a6.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

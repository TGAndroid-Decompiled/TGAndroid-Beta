package sg;

import fi.b5;
import java.util.List;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.fx;
public final class n implements Runnable {
    public final int f48417a;
    public final m0 f48418b;

    public n(m0 m0Var, int i10) {
        this.f48417a = i10;
        this.f48418b = m0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f48417a) {
            case 0:
                m0 m0Var = this.f48418b;
                h21 h21Var = m0Var.P0;
                if (h21Var != null) {
                    m0Var.P0 = null;
                    m0Var.removeView(h21Var);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f48418b;
                if (m0Var2.f48382t0 != null) {
                    m0Var2.f48386v0.postRunnable(new n(m0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                x1 x1Var = this.f48418b.f48358a1;
                if (x1Var != null) {
                    x1Var.invalidate();
                    return;
                }
                return;
            case 3:
                m0.Y(this.f48418b);
                return;
            default:
                m0 m0Var3 = this.f48418b;
                boolean z10 = rg.s0.e(m0Var3.E1).f47585k;
                int i10 = 0;
                while (true) {
                    List list = rg.l.f47495b;
                    if (i10 < list.size()) {
                        rg.l lVar = (rg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        fx fxVar = new fx(m0Var3, lVar, e, 25);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(e);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new ig.d0(fxVar, 18));
                        l0Var.setOnLongClickListener(new b5(m0Var3, 6));
                        m0Var3.H1.a(l0Var, kb1.r(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

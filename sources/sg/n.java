package sg;

import fi.b5;
import java.util.List;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.yx;
public final class n implements Runnable {
    public final int f48327a;
    public final n0 f48328b;

    public n(n0 n0Var, int i10) {
        this.f48327a = i10;
        this.f48328b = n0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f48327a) {
            case 0:
                n0 n0Var = this.f48328b;
                g21 g21Var = n0Var.P0;
                if (g21Var != null) {
                    n0Var.P0 = null;
                    n0Var.removeView(g21Var);
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f48328b;
                if (n0Var2.f48353t0 != null) {
                    n0Var2.f48357v0.postRunnable(new n(n0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                y1 y1Var = this.f48328b.f48329a1;
                if (y1Var != null) {
                    y1Var.invalidate();
                    return;
                }
                return;
            case 3:
                n0.Y(this.f48328b);
                return;
            default:
                n0 n0Var3 = this.f48328b;
                boolean z10 = rg.s0.e(n0Var3.E1).f47547k;
                int i10 = 0;
                while (true) {
                    List list = rg.l.f47457b;
                    if (i10 < list.size()) {
                        rg.l lVar = (rg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        yx yxVar = new yx(n0Var3, lVar, e, 24);
                        m0 m0Var = new m0(n0Var3, n0Var3.getContext());
                        m0Var.setIcon(e);
                        m0Var.setText(n10);
                        m0Var.setSelected(false);
                        m0Var.setOnClickListener(new ig.d0(yxVar, 18));
                        m0Var.setOnLongClickListener(new b5(n0Var3, 6));
                        n0Var3.H1.a(m0Var, gb1.r(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

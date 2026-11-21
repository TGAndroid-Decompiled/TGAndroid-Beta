package tg;

import c8.ma;
import hi.n4;
import java.util.List;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.oz0;
public final class n implements Runnable {
    public final int f58059a;
    public final h0 f58060b;

    public n(h0 h0Var, int i7) {
        this.f58059a = i7;
        this.f58060b = h0Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f58059a) {
            case 0:
                h0 h0Var = this.f58060b;
                oz0 oz0Var = h0Var.K0;
                if (oz0Var != null) {
                    h0Var.K0 = null;
                    h0Var.removeView(oz0Var);
                    return;
                }
                return;
            case 1:
                h0 h0Var2 = this.f58060b;
                if (h0Var2.f57919o0 != null) {
                    h0Var2.f57923q0.postRunnable(new n(h0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                n1 n1Var = this.f58060b.V0;
                if (n1Var != null) {
                    n1Var.invalidate();
                    return;
                }
                return;
            case 3:
                h0.Y(this.f58060b);
                return;
            default:
                h0 h0Var3 = this.f58060b;
                boolean z10 = sg.k0.e(h0Var3.f57942z1).f57310k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f57237c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        j01 j01Var = new j01(h0Var3, gVar, e10, 27);
                        g0 g0Var = new g0(h0Var3, h0Var3.getContext());
                        g0Var.setIcon(e10);
                        g0Var.setText(n10);
                        g0Var.setSelected(false);
                        g0Var.setOnClickListener(new u(j01Var, 0));
                        g0Var.setOnLongClickListener(new n4(h0Var3, 6));
                        h0Var3.C1.a(g0Var, ma.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}

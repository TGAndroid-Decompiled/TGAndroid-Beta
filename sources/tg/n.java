package tg;

import c8.ja;
import hi.p4;
import hi.p5;
import java.util.List;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.u11;
public final class n implements Runnable {
    public final int f57455a;
    public final g0 f57456b;

    public n(g0 g0Var, int i7) {
        this.f57455a = i7;
        this.f57456b = g0Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f57455a) {
            case 0:
                g0 g0Var = this.f57456b;
                fz0 fz0Var = g0Var.K0;
                if (fz0Var != null) {
                    g0Var.K0 = null;
                    g0Var.removeView(fz0Var);
                    return;
                }
                return;
            case 1:
                g0 g0Var2 = this.f57456b;
                if (g0Var2.f57283o0 != null) {
                    g0Var2.f57287q0.postRunnable(new n(g0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                m1 m1Var = this.f57456b.V0;
                if (m1Var != null) {
                    m1Var.invalidate();
                    return;
                }
                return;
            case 3:
                g0.Y(this.f57456b);
                return;
            default:
                g0 g0Var3 = this.f57456b;
                boolean z10 = sg.k0.e(g0Var3.f57306z1).f56695k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f56622c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        u11 u11Var = new u11(g0Var3, gVar, e10, 26);
                        f0 f0Var = new f0(g0Var3, g0Var3.getContext());
                        f0Var.setIcon(e10);
                        f0Var.setText(n10);
                        f0Var.setSelected(false);
                        f0Var.setOnClickListener(new p5(u11Var, 29));
                        f0Var.setOnLongClickListener(new p4(g0Var3, 6));
                        g0Var3.C1.a(f0Var, ja.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}

package tg;

import c8.ha;
import fi.s4;
import java.util.List;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.d10;
public final class n implements Runnable {
    public final int f55735a;
    public final g0 f55736b;

    public n(g0 g0Var, int i7) {
        this.f55735a = i7;
        this.f55736b = g0Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f55735a) {
            case 0:
                g0 g0Var = this.f55736b;
                cz0 cz0Var = g0Var.J0;
                if (cz0Var != null) {
                    g0Var.J0 = null;
                    g0Var.removeView(cz0Var);
                    return;
                }
                return;
            case 1:
                g0 g0Var2 = this.f55736b;
                if (g0Var2.f55564n0 != null) {
                    g0Var2.f55567p0.postRunnable(new n(g0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                m1 m1Var = this.f55736b.U0;
                if (m1Var != null) {
                    m1Var.invalidate();
                    return;
                }
                return;
            case 3:
                g0.Y(this.f55736b);
                return;
            default:
                g0 g0Var3 = this.f55736b;
                boolean z9 = sg.l0.e(g0Var3.f55586y1).f55018k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f54935c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z9) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        d10 d10Var = new d10(g0Var3, gVar, e10, 24);
                        f0 f0Var = new f0(g0Var3, g0Var3.getContext());
                        f0Var.setIcon(e10);
                        f0Var.setText(n10);
                        f0Var.setSelected(false);
                        f0Var.setOnClickListener(new ii.g(d10Var, 23));
                        f0Var.setOnLongClickListener(new s4(g0Var3, 6));
                        g0Var3.B1.a(f0Var, ha.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}

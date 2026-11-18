package tg;

import c8.ma;
import hi.o4;
import java.util.List;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.mz0;
public final class n implements Runnable {
    public final int f58036a;
    public final g0 f58037b;

    public n(g0 g0Var, int i7) {
        this.f58036a = i7;
        this.f58037b = g0Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f58036a) {
            case 0:
                g0 g0Var = this.f58037b;
                mz0 mz0Var = g0Var.K0;
                if (mz0Var != null) {
                    g0Var.K0 = null;
                    g0Var.removeView(mz0Var);
                    return;
                }
                return;
            case 1:
                g0 g0Var2 = this.f58037b;
                if (g0Var2.f57865o0 != null) {
                    g0Var2.f57869q0.postRunnable(new n(g0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                m1 m1Var = this.f58037b.V0;
                if (m1Var != null) {
                    m1Var.invalidate();
                    return;
                }
                return;
            case 3:
                g0.Y(this.f58037b);
                return;
            default:
                g0 g0Var3 = this.f58037b;
                boolean z10 = sg.k0.e(g0Var3.f57888z1).f57269k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f57196c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        h01 h01Var = new h01(g0Var3, gVar, e10, 27);
                        f0 f0Var = new f0(g0Var3, g0Var3.getContext());
                        f0Var.setIcon(e10);
                        f0Var.setText(n10);
                        f0Var.setSelected(false);
                        f0Var.setOnClickListener(new sh.b(h01Var, 1));
                        f0Var.setOnLongClickListener(new o4(g0Var3, 6));
                        g0Var3.C1.a(f0Var, ma.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}

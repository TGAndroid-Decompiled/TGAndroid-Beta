package tg;

import c8.na;
import hi.y4;
import java.util.List;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.nz0;
public final class t implements Runnable {
    public final int f58231a;
    public final l0 f58232b;

    public t(l0 l0Var, int i7) {
        this.f58231a = i7;
        this.f58232b = l0Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f58231a) {
            case 0:
                l0 l0Var = this.f58232b;
                nz0 nz0Var = l0Var.K0;
                if (nz0Var != null) {
                    l0Var.K0 = null;
                    l0Var.removeView(nz0Var);
                    return;
                }
                return;
            case 1:
                l0 l0Var2 = this.f58232b;
                if (l0Var2.f58039o0 != null) {
                    l0Var2.f58043q0.postRunnable(new t(l0Var2, 4), 200L);
                    return;
                }
                return;
            case 2:
                r1 r1Var = this.f58232b.V0;
                if (r1Var != null) {
                    r1Var.invalidate();
                    return;
                }
                return;
            case 3:
                r1 r1Var2 = this.f58232b.V0;
                if (r1Var2 != null) {
                    r1Var2.invalidate();
                    return;
                }
                return;
            case 4:
                l0.X(this.f58232b);
                return;
            default:
                l0 l0Var3 = this.f58232b;
                boolean z10 = sg.j0.e(l0Var3.f58062z1).f57384k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f57331c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        e21 e21Var = new e21(l0Var3, gVar, e10, 26);
                        k0 k0Var = new k0(l0Var3, l0Var3.getContext());
                        k0Var.setIcon(e10);
                        k0Var.setText(n10);
                        k0Var.setSelected(false);
                        k0Var.setOnClickListener(new a0(e21Var, 0));
                        k0Var.setOnLongClickListener(new y4(l0Var3, 6));
                        l0Var3.C1.a(k0Var, na.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}

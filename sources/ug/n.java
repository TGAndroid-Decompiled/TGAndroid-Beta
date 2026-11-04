package ug;

import b8.mf;
import gi.p4;
import java.util.List;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.rw;
public final class n implements Runnable {
    public final int f56165a;
    public final f0 f56166b;

    public n(f0 f0Var, int i3) {
        this.f56165a = i3;
        this.f56166b = f0Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f56165a) {
            case 0:
                f0 f0Var = this.f56166b;
                cz0 cz0Var = f0Var.K0;
                if (cz0Var != null) {
                    f0Var.K0 = null;
                    f0Var.removeView(cz0Var);
                    return;
                }
                return;
            case 1:
                f0 f0Var2 = this.f56166b;
                if (f0Var2.f55979o0 != null) {
                    f0Var2.f55983q0.postRunnable(new n(f0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                l1 l1Var = this.f56166b.V0;
                if (l1Var != null) {
                    l1Var.invalidate();
                    return;
                }
                return;
            case 3:
                f0.Y(this.f56166b);
                return;
            default:
                f0 f0Var3 = this.f56166b;
                boolean z10 = tg.k0.e(f0Var3.f56002z1).f55237k;
                int i3 = 0;
                while (true) {
                    List list = tg.g.f55164c;
                    if (i3 < list.size()) {
                        tg.g gVar = (tg.g) list.get(i3);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n4 = gVar.n();
                        rw rwVar = new rw(f0Var3, gVar, e10, 26);
                        e0 e0Var = new e0(f0Var3, f0Var3.getContext());
                        e0Var.setIcon(e10);
                        e0Var.setText(n4);
                        e0Var.setSelected(false);
                        e0Var.setOnClickListener(new ii.m(rwVar, 27));
                        e0Var.setOnLongClickListener(new p4(f0Var3, 6));
                        f0Var3.C1.a(e0Var, mf.o(-1, 48));
                        i3++;
                    } else {
                        return;
                    }
                }
        }
    }
}

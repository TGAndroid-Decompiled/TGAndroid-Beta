package qg;

import ci.m5;
import java.util.List;
import org.telegram.ui.Components.w01;
import org.telegram.ui.yl0;
import w7.x5;
public final class n implements Runnable {
    public final int f41426a;
    public final p0 f41427b;

    public n(p0 p0Var, int i10) {
        this.f41426a = i10;
        this.f41427b = p0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f41426a) {
            case 0:
                p0 p0Var = this.f41427b;
                w01 w01Var = p0Var.f41467a1;
                if (w01Var != null) {
                    p0Var.f41467a1 = null;
                    p0Var.removeView(w01Var);
                    return;
                }
                return;
            case 1:
                p0 p0Var2 = this.f41427b;
                if (p0Var2.E0 != null) {
                    p0Var2.G0.postRunnable(new n(p0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                z1 z1Var = this.f41427b.l1;
                if (z1Var != null) {
                    z1Var.invalidate();
                    return;
                }
                return;
            case 3:
                p0.a0(this.f41427b);
                return;
            default:
                p0 p0Var3 = this.f41427b;
                boolean z10 = pg.t0.e(p0Var3.P1).f40959k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f40847b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        yl0 yl0Var = new yl0(p0Var3, lVar, e, 12);
                        o0 o0Var = new o0(p0Var3, p0Var3.getContext());
                        o0Var.setIcon(e);
                        o0Var.setText(n10);
                        o0Var.setSelected(false);
                        o0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(yl0Var, 6));
                        o0Var.setOnLongClickListener(new m5(p0Var3, 6));
                        p0Var3.S1.a(o0Var, x5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

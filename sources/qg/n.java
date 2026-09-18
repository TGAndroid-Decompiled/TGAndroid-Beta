package qg;

import ci.n5;
import java.util.List;
import org.telegram.ui.Components.y01;
import org.telegram.ui.gm0;
import w7.x5;
public final class n implements Runnable {
    public final int f41501a;
    public final p0 f41502b;

    public n(p0 p0Var, int i10) {
        this.f41501a = i10;
        this.f41502b = p0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f41501a) {
            case 0:
                p0 p0Var = this.f41502b;
                y01 y01Var = p0Var.f41542a1;
                if (y01Var != null) {
                    p0Var.f41542a1 = null;
                    p0Var.removeView(y01Var);
                    return;
                }
                return;
            case 1:
                p0 p0Var2 = this.f41502b;
                if (p0Var2.E0 != null) {
                    p0Var2.G0.postRunnable(new n(p0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                z1 z1Var = this.f41502b.l1;
                if (z1Var != null) {
                    z1Var.invalidate();
                    return;
                }
                return;
            case 3:
                p0.a0(this.f41502b);
                return;
            default:
                p0 p0Var3 = this.f41502b;
                boolean z10 = pg.s0.e(p0Var3.P1).f41026k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f40934b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        gm0 gm0Var = new gm0(p0Var3, lVar, e, 12);
                        o0 o0Var = new o0(p0Var3, p0Var3.getContext());
                        o0Var.setIcon(e);
                        o0Var.setText(n10);
                        o0Var.setSelected(false);
                        o0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(gm0Var, 6));
                        o0Var.setOnLongClickListener(new n5(p0Var3, 6));
                        p0Var3.S1.a(o0Var, x5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

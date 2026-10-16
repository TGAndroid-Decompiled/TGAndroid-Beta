package rg;

import di.l5;
import java.util.List;
import ji.o4;
import org.telegram.ui.Components.z11;
import org.telegram.ui.c90;
import w7.z5;
public final class n implements Runnable {
    public final int f44128a;
    public final o0 f44129b;

    public n(o0 o0Var, int i10) {
        this.f44128a = i10;
        this.f44129b = o0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f44128a) {
            case 0:
                o0 o0Var = this.f44129b;
                z11 z11Var = o0Var.f44159a1;
                if (z11Var != null) {
                    o0Var.f44159a1 = null;
                    o0Var.removeView(z11Var);
                    return;
                }
                return;
            case 1:
                o0 o0Var2 = this.f44129b;
                if (o0Var2.E0 != null) {
                    o0Var2.G0.postRunnable(new n(o0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                y1 y1Var = this.f44129b.l1;
                if (y1Var != null) {
                    y1Var.invalidate();
                    return;
                }
                return;
            case 3:
                o0.a0(this.f44129b);
                return;
            default:
                o0 o0Var3 = this.f44129b;
                boolean z10 = qg.s0.e(o0Var3.P1).f43314k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.f43222b;
                    if (i10 < list.size()) {
                        qg.l lVar = (qg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        c90 c90Var = new c90(o0Var3, lVar, e, 20);
                        n0 n0Var = new n0(o0Var3, o0Var3.getContext());
                        n0Var.setIcon(e);
                        n0Var.setText(n10);
                        n0Var.setSelected(false);
                        n0Var.setOnClickListener(new o4(c90Var, 7));
                        n0Var.setOnLongClickListener(new l5(o0Var3, 6));
                        o0Var3.S1.a(n0Var, z5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

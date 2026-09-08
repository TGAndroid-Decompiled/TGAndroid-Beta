package rg;

import di.n5;
import java.util.List;
import ji.m4;
import org.telegram.ui.Components.w01;
import org.telegram.ui.ai0;
import w7.x5;
public final class o implements Runnable {
    public final int f45364a;
    public final o0 f45365b;

    public o(o0 o0Var, int i10) {
        this.f45364a = i10;
        this.f45365b = o0Var;
    }

    @Override
    public final void run() {
        int e7;
        switch (this.f45364a) {
            case 0:
                o0 o0Var = this.f45365b;
                w01 w01Var = o0Var.f45366a1;
                if (w01Var != null) {
                    o0Var.f45366a1 = null;
                    o0Var.removeView(w01Var);
                    return;
                }
                return;
            case 1:
                o0 o0Var2 = this.f45365b;
                if (o0Var2.E0 != null) {
                    o0Var2.G0.postRunnable(new o(o0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                y1 y1Var = this.f45365b.l1;
                if (y1Var != null) {
                    y1Var.invalidate();
                    return;
                }
                return;
            case 3:
                o0.a0(this.f45365b);
                return;
            default:
                o0 o0Var3 = this.f45365b;
                boolean z10 = qg.s0.e(o0Var3.P1).f44602k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.f44503b;
                    if (i10 < list.size()) {
                        qg.l lVar = (qg.l) list.get(i10);
                        if (z10) {
                            e7 = lVar.m();
                        } else {
                            e7 = lVar.e();
                        }
                        String n10 = lVar.n();
                        ai0 ai0Var = new ai0(o0Var3, lVar, e7, 14);
                        n0 n0Var = new n0(o0Var3, o0Var3.getContext());
                        n0Var.setIcon(e7);
                        n0Var.setText(n10);
                        n0Var.setSelected(false);
                        n0Var.setOnClickListener(new m4(ai0Var, 7));
                        n0Var.setOnLongClickListener(new n5(o0Var3, 6));
                        o0Var3.S1.a(n0Var, x5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

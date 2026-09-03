package qh;

import java.util.List;
import org.telegram.ui.gu0;
public final class z3 implements Runnable {
    public final int f46403a;
    public final a5 f46404b;

    public z3(a5 a5Var, int i10) {
        this.f46403a = i10;
        this.f46404b = a5Var;
    }

    @Override
    public final void run() {
        int e6;
        switch (this.f46403a) {
            case 0:
                eg.r2 r2Var = this.f46404b.f44922a1;
                if (r2Var != null) {
                    r2Var.invalidate();
                    return;
                }
                return;
            case 1:
                new fg.n1((org.telegram.ui.ActionBar.p2) new fg.x1(this.f46404b, 12), 14, true).show();
                return;
            case 2:
                this.f46404b.z0(false);
                return;
            default:
                a5 a5Var = this.f46404b;
                boolean z4 = dg.e1.e(a5Var.C1).f4522k;
                int i10 = 0;
                while (true) {
                    List list = dg.l.f4576b;
                    if (i10 < list.size()) {
                        dg.l lVar = (dg.l) list.get(i10);
                        if (z4) {
                            e6 = lVar.m();
                        } else {
                            e6 = lVar.e();
                        }
                        String n10 = lVar.n();
                        gu0 gu0Var = new gu0(a5Var, lVar, e6, 12);
                        y4 y4Var = new y4(a5Var, a5Var.getContext());
                        y4Var.setIcon(e6);
                        y4Var.setText(n10);
                        y4Var.setSelected(false);
                        y4Var.setOnClickListener(new org.telegram.ui.Components.voip.o(gu0Var, 9));
                        y4Var.setOnLongClickListener(new eg.d0(a5Var, 1));
                        a5Var.F1.a(y4Var, k7.c6.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

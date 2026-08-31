package qh;

import java.util.List;
import org.telegram.ui.bu0;
public final class a4 implements Runnable {
    public final int f44908a;
    public final b5 f44909b;

    public a4(b5 b5Var, int i10) {
        this.f44908a = i10;
        this.f44909b = b5Var;
    }

    @Override
    public final void run() {
        int e6;
        switch (this.f44908a) {
            case 0:
                eg.r2 r2Var = this.f44909b.f44945a1;
                if (r2Var != null) {
                    r2Var.invalidate();
                    return;
                }
                return;
            case 1:
                new fg.n1((org.telegram.ui.ActionBar.p2) new fg.x1(this.f44909b, 12), 14, true).show();
                return;
            case 2:
                this.f44909b.z0(false);
                return;
            default:
                b5 b5Var = this.f44909b;
                boolean z4 = dg.e1.e(b5Var.C1).f4522k;
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
                        bu0 bu0Var = new bu0(b5Var, lVar, e6, 12);
                        z4 z4Var = new z4(b5Var, b5Var.getContext());
                        z4Var.setIcon(e6);
                        z4Var.setText(n10);
                        z4Var.setSelected(false);
                        z4Var.setOnClickListener(new org.telegram.ui.Components.voip.o(bu0Var, 9));
                        z4Var.setOnLongClickListener(new eg.d0(b5Var, 1));
                        b5Var.F1.a(z4Var, k7.c6.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

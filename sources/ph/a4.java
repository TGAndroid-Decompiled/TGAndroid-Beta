package ph;

import java.util.List;
import org.telegram.ui.gu0;
public final class a4 implements Runnable {
    public final int f41297a;
    public final c5 f41298b;

    public a4(c5 c5Var, int i10) {
        this.f41297a = i10;
        this.f41298b = c5Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f41297a) {
            case 0:
                dg.t2 t2Var = this.f41298b.f41366a1;
                if (t2Var != null) {
                    t2Var.invalidate();
                    return;
                }
                return;
            case 1:
                new eg.o1((org.telegram.ui.ActionBar.p2) new eg.y1(this.f41298b, 12), 14, true).show();
                return;
            case 2:
                this.f41298b.z0(false);
                return;
            default:
                c5 c5Var = this.f41298b;
                boolean z4 = cg.f1.e(c5Var.C1).f2382k;
                int i10 = 0;
                while (true) {
                    List list = cg.l.f2425b;
                    if (i10 < list.size()) {
                        cg.l lVar = (cg.l) list.get(i10);
                        if (z4) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        gu0 gu0Var = new gu0(c5Var, lVar, e, 11);
                        a5 a5Var = new a5(c5Var, c5Var.getContext());
                        a5Var.setIcon(e);
                        a5Var.setText(n10);
                        a5Var.setSelected(false);
                        a5Var.setOnClickListener(new oh.n(gu0Var, 9));
                        a5Var.setOnLongClickListener(new dg.f0(c5Var, 1));
                        c5Var.F1.a(a5Var, k7.b6.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

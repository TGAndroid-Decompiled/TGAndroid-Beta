package qg;

import ci.m5;
import java.util.List;
import org.telegram.ui.Components.v11;
import org.telegram.ui.am0;
import w7.z5;
public final class n implements Runnable {
    public final int f45197a;
    public final m0 f45198b;

    public n(m0 m0Var, int i10) {
        this.f45197a = i10;
        this.f45198b = m0Var;
    }

    @Override
    public final void run() {
        int e7;
        switch (this.f45197a) {
            case 0:
                m0 m0Var = this.f45198b;
                v11 v11Var = m0Var.f45155a1;
                if (v11Var != null) {
                    m0Var.f45155a1 = null;
                    m0Var.removeView(v11Var);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f45198b;
                if (m0Var2.E0 != null) {
                    m0Var2.G0.postRunnable(new n(m0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                w1 w1Var = this.f45198b.l1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 3:
                m0.a0(this.f45198b);
                return;
            default:
                m0 m0Var3 = this.f45198b;
                boolean z10 = pg.u0.e(m0Var3.P1).f44647k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f44518b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e7 = lVar.m();
                        } else {
                            e7 = lVar.e();
                        }
                        String n10 = lVar.n();
                        am0 am0Var = new am0(m0Var3, lVar, e7, 12);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(e7);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(am0Var, 6));
                        l0Var.setOnLongClickListener(new m5(m0Var3, 6));
                        m0Var3.S1.a(l0Var, z5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}

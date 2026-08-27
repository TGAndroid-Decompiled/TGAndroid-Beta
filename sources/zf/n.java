package zf;

import h7.z5;
import java.util.List;
import lh.b5;
import lh.c5;
import org.telegram.ui.Components.f01;
import org.telegram.ui.ol0;

public final class n implements Runnable {

    public final int f50578a;

    public final l0 f50579b;

    public n(l0 l0Var, int i10) {
        this.f50578a = i10;
        this.f50579b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f50578a) {
            case 0:
                l0 l0Var = this.f50579b;
                f01 f01Var = l0Var.W0;
                if (f01Var != null) {
                    l0Var.W0 = null;
                    l0Var.removeView(f01Var);
                }
                break;
            case 1:
                l0 l0Var2 = this.f50579b;
                if (l0Var2.A0 != null) {
                    l0Var2.C0.postRunnable(new n(l0Var2, 3), 200L);
                }
                break;
            case 2:
                w1 w1Var = this.f50579b.f50518h1;
                if (w1Var != null) {
                    w1Var.invalidate();
                }
                break;
            case 3:
                l0.a0(this.f50579b);
                break;
            default:
                l0 l0Var3 = this.f50579b;
                boolean z10 = yf.r0.e(l0Var3.L1).f50062k;
                int i10 = 0;
                while (true) {
                    List list = yf.l.f49973b;
                    if (i10 < list.size()) {
                        yf.l lVar = (yf.l) list.get(i10);
                        int iM = z10 ? lVar.m() : lVar.e();
                        String strN = lVar.n();
                        ol0 ol0Var = new ol0(l0Var3, lVar, iM, 18);
                        k0 k0Var = new k0(l0Var3, l0Var3.getContext());
                        k0Var.setIcon(iM);
                        k0Var.setText(strN);
                        k0Var.setSelected(false);
                        k0Var.setOnClickListener(new c5(ol0Var, 26));
                        k0Var.setOnLongClickListener(new b5(l0Var3, 6));
                        l0Var3.O1.a(k0Var, z5.n(-1, 48));
                        i10++;
                    }
                    break;
                }
                break;
        }
    }
}

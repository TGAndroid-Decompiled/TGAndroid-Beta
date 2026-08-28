package yf;

import g7.e6;
import java.util.List;
import kh.d5;
import kh.x8;
import org.telegram.ui.Components.d01;
import org.telegram.ui.jh0;
public final class n implements Runnable {
    public final int f50005a;
    public final l0 f50006b;

    public n(l0 l0Var, int i9) {
        this.f50005a = i9;
        this.f50006b = l0Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f50005a) {
            case 0:
                l0 l0Var = this.f50006b;
                d01 d01Var = l0Var.W0;
                if (d01Var != null) {
                    l0Var.W0 = null;
                    l0Var.removeView(d01Var);
                    return;
                }
                return;
            case 1:
                l0 l0Var2 = this.f50006b;
                if (l0Var2.A0 != null) {
                    l0Var2.C0.postRunnable(new n(l0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                w1 w1Var = this.f50006b.f49940h1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 3:
                l0.a0(this.f50006b);
                return;
            default:
                l0 l0Var3 = this.f50006b;
                boolean z10 = xf.s0.e(l0Var3.L1).f49366k;
                int i9 = 0;
                while (true) {
                    List list = xf.l.f49266b;
                    if (i9 < list.size()) {
                        xf.l lVar = (xf.l) list.get(i9);
                        if (z10) {
                            e10 = lVar.m();
                        } else {
                            e10 = lVar.e();
                        }
                        String n10 = lVar.n();
                        jh0 jh0Var = new jh0(l0Var3, lVar, e10, 18);
                        k0 k0Var = new k0(l0Var3, l0Var3.getContext());
                        k0Var.setIcon(e10);
                        k0Var.setText(n10);
                        k0Var.setSelected(false);
                        k0Var.setOnClickListener(new x8(jh0Var, 24));
                        k0Var.setOnLongClickListener(new d5(l0Var3, 6));
                        l0Var3.O1.a(k0Var, e6.n(-1, 48));
                        i9++;
                    } else {
                        return;
                    }
                }
        }
    }
}

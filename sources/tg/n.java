package tg;

import c8.na;
import hi.o4;
import java.util.List;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.oz0;
public final class n implements Runnable {
    public final int f58028a;
    public final h0 f58029b;

    public n(h0 h0Var, int i7) {
        this.f58028a = i7;
        this.f58029b = h0Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f58028a) {
            case 0:
                h0 h0Var = this.f58029b;
                oz0 oz0Var = h0Var.K0;
                if (oz0Var != null) {
                    h0Var.K0 = null;
                    h0Var.removeView(oz0Var);
                    return;
                }
                return;
            case 1:
                h0 h0Var2 = this.f58029b;
                if (h0Var2.f57888o0 != null) {
                    h0Var2.f57892q0.postRunnable(new n(h0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                n1 n1Var = this.f58029b.V0;
                if (n1Var != null) {
                    n1Var.invalidate();
                    return;
                }
                return;
            case 3:
                h0.Y(this.f58029b);
                return;
            default:
                h0 h0Var3 = this.f58029b;
                boolean z10 = sg.k0.e(h0Var3.f57911z1).f57279k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f57206c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        f21 f21Var = new f21(h0Var3, gVar, e10, 26);
                        g0 g0Var = new g0(h0Var3, h0Var3.getContext());
                        g0Var.setIcon(e10);
                        g0Var.setText(n10);
                        g0Var.setSelected(false);
                        g0Var.setOnClickListener(new u(f21Var, 0));
                        g0Var.setOnLongClickListener(new o4(h0Var3, 6));
                        h0Var3.C1.a(g0Var, na.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}

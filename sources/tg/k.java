package tg;

import android.view.View;
import di.ba;
import di.ta;
public final class k implements View.OnClickListener {
    public final int f57977a;
    public final g0 f57978b;

    public k(g0 g0Var, int i7) {
        this.f57977a = i7;
        this.f57978b = g0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f57977a) {
            case 0:
                g0 g0Var = this.f57978b;
                if (g0Var.D0) {
                    g0Var.r0(null, true);
                    return;
                } else {
                    g0Var.B0(0);
                    return;
                }
            case 1:
                g0 g0Var2 = this.f57978b;
                int i7 = g0Var2.Q0;
                g0Var2.B0(1);
                g0Var2.postDelayed(new n(g0Var2, 1), 350L);
                hi.j2 j2Var = new hi.j2(g0Var2.getContext(), g0Var2.A1, false, false);
                j2Var.f14805z1 = new q(g0Var2);
                j2Var.O0(new ta(g0Var2, 4));
                j2Var.setOnDismissListener(new ba(g0Var2, i7));
                j2Var.show();
                g0Var2.o0(true);
                return;
            case 2:
                g0 g0Var3 = this.f57978b;
                j jVar = g0Var3.C0;
                if ((jVar instanceof m2) && !g0Var3.D0) {
                    m2 m2Var = (m2) jVar;
                    g0Var3.D0 = true;
                    m2Var.q();
                    View focusedView = m2Var.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.g0.I3(focusedView);
                }
                org.telegram.ui.ActionBar.h1 h1Var = g0Var3.B1;
                if (h1Var != null && h1Var.isShowing()) {
                    g0Var3.B1.d(true);
                    return;
                }
                return;
            case 3:
                g0.Z(this.f57978b);
                return;
            default:
                g0 g0Var4 = this.f57978b;
                g0Var4.B0(2);
                if (!(g0Var4.C0 instanceof m2)) {
                    g0Var4.h0(true);
                    return;
                }
                return;
        }
    }
}

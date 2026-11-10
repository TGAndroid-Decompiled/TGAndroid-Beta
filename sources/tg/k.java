package tg;

import android.view.View;
import bi.fc;
import bi.mb;
public final class k implements View.OnClickListener {
    public final int f55809a;
    public final g0 f55810b;

    public k(g0 g0Var, int i7) {
        this.f55809a = i7;
        this.f55810b = g0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f55809a) {
            case 0:
                g0 g0Var = this.f55810b;
                if (g0Var.C0) {
                    g0Var.r0(null, true);
                    return;
                } else {
                    g0Var.B0(0);
                    return;
                }
            case 1:
                g0 g0Var2 = this.f55810b;
                int i7 = g0Var2.P0;
                g0Var2.B0(1);
                g0Var2.postDelayed(new n(g0Var2, 1), 350L);
                fi.k2 k2Var = new fi.k2(g0Var2.getContext(), g0Var2.f55716z1, false, false);
                k2Var.f12265y1 = new q(g0Var2);
                k2Var.N0(new fc(g0Var2, 4));
                k2Var.setOnDismissListener(new mb(g0Var2, i7));
                k2Var.show();
                g0Var2.o0(true);
                return;
            case 2:
                g0 g0Var3 = this.f55810b;
                j jVar = g0Var3.B0;
                if ((jVar instanceof k2) && !g0Var3.C0) {
                    k2 k2Var2 = (k2) jVar;
                    g0Var3.C0 = true;
                    k2Var2.q();
                    View focusedView = k2Var2.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.g0.K3(focusedView);
                }
                org.telegram.ui.ActionBar.g1 g1Var = g0Var3.A1;
                if (g1Var != null && g1Var.isShowing()) {
                    g0Var3.A1.d(true);
                    return;
                }
                return;
            case 3:
                g0.Z(this.f55810b);
                return;
            default:
                g0 g0Var4 = this.f55810b;
                g0Var4.B0(2);
                if (!(g0Var4.B0 instanceof k2)) {
                    g0Var4.h0(true);
                    return;
                }
                return;
        }
    }
}

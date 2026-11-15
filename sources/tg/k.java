package tg;

import android.view.View;
import di.qa;
import di.z9;
public final class k implements View.OnClickListener {
    public final int f57403a;
    public final g0 f57404b;

    public k(g0 g0Var, int i7) {
        this.f57403a = i7;
        this.f57404b = g0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f57403a) {
            case 0:
                g0 g0Var = this.f57404b;
                if (g0Var.D0) {
                    g0Var.r0(null, true);
                    return;
                } else {
                    g0Var.B0(0);
                    return;
                }
            case 1:
                g0 g0Var2 = this.f57404b;
                int i7 = g0Var2.Q0;
                g0Var2.B0(1);
                g0Var2.postDelayed(new n(g0Var2, 1), 350L);
                hi.i2 i2Var = new hi.i2(g0Var2.getContext(), g0Var2.A1, false, false);
                i2Var.f14415z1 = new q(g0Var2);
                i2Var.N0(new qa(g0Var2, 4));
                i2Var.setOnDismissListener(new z9(g0Var2, i7));
                i2Var.show();
                g0Var2.o0(true);
                return;
            case 2:
                g0 g0Var3 = this.f57404b;
                j jVar = g0Var3.C0;
                if ((jVar instanceof o2) && !g0Var3.D0) {
                    o2 o2Var = (o2) jVar;
                    g0Var3.D0 = true;
                    o2Var.q();
                    View focusedView = o2Var.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.g0.J3(focusedView);
                }
                org.telegram.ui.ActionBar.g1 g1Var = g0Var3.B1;
                if (g1Var != null && g1Var.isShowing()) {
                    g0Var3.B1.d(true);
                    return;
                }
                return;
            case 3:
                g0.Z(this.f57404b);
                return;
            default:
                g0 g0Var4 = this.f57404b;
                g0Var4.B0(2);
                if (!(g0Var4.C0 instanceof o2)) {
                    g0Var4.h0(true);
                    return;
                }
                return;
        }
    }
}

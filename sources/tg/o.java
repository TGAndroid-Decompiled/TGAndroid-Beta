package tg;

import android.view.View;
import di.ta;
import hi.a5;
public final class o implements View.OnClickListener {
    public final int f58145a;
    public final l0 f58146b;

    public o(l0 l0Var, int i7) {
        this.f58145a = i7;
        this.f58146b = l0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f58145a) {
            case 0:
                l0 l0Var = this.f58146b;
                if (l0Var.D0) {
                    l0Var.u0(null, true);
                    return;
                } else {
                    l0Var.F0(0);
                    return;
                }
            case 1:
                l0 l0Var2 = this.f58146b;
                int i7 = l0Var2.Q0;
                l0Var2.F0(1);
                l0Var2.postDelayed(new t(l0Var2, 1), 350L);
                b0 b0Var = new b0(l0Var2, l0Var2.getContext(), l0Var2.A1);
                l0Var2.K1 = b0Var;
                b0Var.f15288z1 = new w(l0Var2);
                b0Var.P0(new ta(l0Var2, 4));
                b0Var.setOnDismissListener(new a5(l0Var2, b0Var, i7, 1));
                b0Var.show();
                l0Var2.r0(true);
                return;
            case 2:
                l0 l0Var3 = this.f58146b;
                l0Var3.k0();
                org.telegram.ui.ActionBar.g1 g1Var = l0Var3.B1;
                if (g1Var != null && g1Var.isShowing()) {
                    l0Var3.B1.d(true);
                    return;
                }
                return;
            case 3:
                l0.Y(this.f58146b);
                return;
            default:
                l0 l0Var4 = this.f58146b;
                l0Var4.F0(2);
                if (!(l0Var4.C0 instanceof q2)) {
                    l0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

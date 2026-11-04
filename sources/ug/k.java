package ug;

import android.view.View;
import ci.ab;
import ci.ja;
public final class k implements View.OnClickListener {
    public final int f56112a;
    public final f0 f56113b;

    public k(f0 f0Var, int i3) {
        this.f56112a = i3;
        this.f56113b = f0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f56112a) {
            case 0:
                f0 f0Var = this.f56113b;
                if (f0Var.D0) {
                    f0Var.r0(null, true);
                    return;
                } else {
                    f0Var.B0(0);
                    return;
                }
            case 1:
                f0 f0Var2 = this.f56113b;
                int i3 = f0Var2.Q0;
                f0Var2.B0(1);
                f0Var2.postDelayed(new n(f0Var2, 1), 350L);
                gi.i2 i2Var = new gi.i2(f0Var2.getContext(), f0Var2.A1, false, false);
                i2Var.f12962w1 = new q(f0Var2);
                i2Var.N0(new ab(f0Var2, 4));
                i2Var.setOnDismissListener(new ja(f0Var2, i3));
                i2Var.show();
                f0Var2.o0(true);
                return;
            case 2:
                f0 f0Var3 = this.f56113b;
                j jVar = f0Var3.C0;
                if ((jVar instanceof l2) && !f0Var3.D0) {
                    l2 l2Var = (l2) jVar;
                    f0Var3.D0 = true;
                    l2Var.q();
                    View focusedView = l2Var.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.g0.K3(focusedView);
                }
                org.telegram.ui.ActionBar.f1 f1Var = f0Var3.B1;
                if (f1Var != null && f1Var.isShowing()) {
                    f0Var3.B1.d(true);
                    return;
                }
                return;
            case 3:
                f0.Z(this.f56113b);
                return;
            default:
                f0 f0Var4 = this.f56113b;
                f0Var4.B0(2);
                if (!(f0Var4.C0 instanceof l2)) {
                    f0Var4.h0(true);
                    return;
                }
                return;
        }
    }
}

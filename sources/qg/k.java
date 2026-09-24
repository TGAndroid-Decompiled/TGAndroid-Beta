package qg;

import android.view.View;
import ci.x7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;
public final class k implements View.OnClickListener {
    public final int f41692a;
    public final n0 f41693b;

    public k(n0 n0Var, int i10) {
        this.f41692a = i10;
        this.f41693b = n0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41692a) {
            case 0:
                n0 n0Var = this.f41693b;
                if (n0Var.T0) {
                    n0Var.s0(null, true);
                    return;
                } else {
                    n0Var.C0(0);
                    return;
                }
            case 1:
                n0 n0Var2 = this.f41693b;
                int i10 = n0Var2.f41767g1;
                n0Var2.C0(1);
                n0Var2.postDelayed(new n(n0Var2, 1), 350L);
                ci.s2 s2Var = new ci.s2(n0Var2.getContext(), n0Var2.Q1, false, false);
                s2Var.f5480y = new q(n0Var2);
                s2Var.q0(new x7(n0Var2, 3));
                s2Var.setOnDismissListener(new s(n0Var2, i10));
                s2Var.show();
                PhotoViewer photoViewer = ((st0) n0Var2).f37846o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                n0 n0Var3 = this.f41693b;
                j jVar = n0Var3.S0;
                if ((jVar instanceof v2) && !n0Var3.T0) {
                    v2 v2Var = (v2) jVar;
                    n0Var3.T0 = true;
                    v2Var.q();
                    View focusedView = v2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.m1 m1Var = n0Var3.R1;
                if (m1Var != null && m1Var.isShowing()) {
                    n0Var3.R1.d(true);
                    return;
                }
                return;
            case 3:
                n0.b0(this.f41693b);
                return;
            default:
                n0 n0Var4 = this.f41693b;
                n0Var4.C0(2);
                if (!(n0Var4.S0 instanceof v2)) {
                    n0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

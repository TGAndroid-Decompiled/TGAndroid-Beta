package qg;

import android.view.View;
import ci.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
public final class k implements View.OnClickListener {
    public final int f41720a;
    public final n0 f41721b;

    public k(n0 n0Var, int i10) {
        this.f41720a = i10;
        this.f41721b = n0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41720a) {
            case 0:
                n0 n0Var = this.f41721b;
                if (n0Var.T0) {
                    n0Var.r0(null, true);
                    return;
                } else {
                    n0Var.B0(0);
                    return;
                }
            case 1:
                n0 n0Var2 = this.f41721b;
                int i10 = n0Var2.f41795g1;
                n0Var2.B0(1);
                n0Var2.postDelayed(new n(n0Var2, 1), 350L);
                ci.t2 t2Var = new ci.t2(n0Var2.getContext(), n0Var2.Q1, false, false);
                t2Var.f5556y = new q(n0Var2);
                t2Var.q0(new a8(n0Var2, 3));
                t2Var.setOnDismissListener(new s(n0Var2, i10));
                t2Var.show();
                PhotoViewer photoViewer = ((au0) n0Var2).f32159o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                n0 n0Var3 = this.f41721b;
                j jVar = n0Var3.S0;
                if ((jVar instanceof v2) && !n0Var3.T0) {
                    v2 v2Var = (v2) jVar;
                    n0Var3.T0 = true;
                    v2Var.q();
                    View focusedView = v2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.n1 n1Var = n0Var3.R1;
                if (n1Var != null && n1Var.isShowing()) {
                    n0Var3.R1.d(true);
                    return;
                }
                return;
            case 3:
                n0.b0(this.f41721b);
                return;
            default:
                n0 n0Var4 = this.f41721b;
                n0Var4.B0(2);
                if (!(n0Var4.S0 instanceof v2)) {
                    n0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

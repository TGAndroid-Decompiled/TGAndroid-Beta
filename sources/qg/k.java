package qg;

import android.view.View;
import ci.x7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.tt0;
public final class k implements View.OnClickListener {
    public final int f41377a;
    public final p0 f41378b;

    public k(p0 p0Var, int i10) {
        this.f41377a = i10;
        this.f41378b = p0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41377a) {
            case 0:
                p0 p0Var = this.f41378b;
                if (p0Var.T0) {
                    p0Var.s0(null, true);
                    return;
                } else {
                    p0Var.C0(0);
                    return;
                }
            case 1:
                p0 p0Var2 = this.f41378b;
                int i10 = p0Var2.f41478g1;
                p0Var2.C0(1);
                p0Var2.postDelayed(new n(p0Var2, 1), 350L);
                ci.s2 s2Var = new ci.s2(p0Var2.getContext(), p0Var2.Q1, false, false);
                s2Var.f5480y = new q(p0Var2);
                s2Var.q0(new x7(p0Var2, 3));
                s2Var.setOnDismissListener(new s(p0Var2, i10));
                s2Var.show();
                PhotoViewer photoViewer = ((tt0) p0Var2).f37756o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                p0 p0Var3 = this.f41378b;
                j jVar = p0Var3.S0;
                if ((jVar instanceof x2) && !p0Var3.T0) {
                    x2 x2Var = (x2) jVar;
                    p0Var3.T0 = true;
                    x2Var.q();
                    View focusedView = x2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.n1 n1Var = p0Var3.R1;
                if (n1Var != null && n1Var.isShowing()) {
                    p0Var3.R1.d(true);
                    return;
                }
                return;
            case 3:
                p0.b0(this.f41378b);
                return;
            default:
                p0 p0Var4 = this.f41378b;
                p0Var4.C0(2);
                if (!(p0Var4.S0 instanceof x2)) {
                    p0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

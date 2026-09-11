package rg;

import android.view.View;
import di.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
public final class l implements View.OnClickListener {
    public final int f45270a;
    public final o0 f45271b;

    public l(o0 o0Var, int i10) {
        this.f45270a = i10;
        this.f45271b = o0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45270a) {
            case 0:
                o0 o0Var = this.f45271b;
                if (o0Var.T0) {
                    o0Var.r0(null, true);
                    return;
                } else {
                    o0Var.B0(0);
                    return;
                }
            case 1:
                o0 o0Var2 = this.f45271b;
                int i10 = o0Var2.f45349g1;
                o0Var2.B0(1);
                o0Var2.postDelayed(new o(o0Var2, 1), 350L);
                di.t2 t2Var = new di.t2(o0Var2.getContext(), o0Var2.Q1, false, false);
                t2Var.f8176y = new r(o0Var2);
                t2Var.q0(new a8(o0Var2, 3));
                t2Var.setOnDismissListener(new t(o0Var2, i10));
                t2Var.show();
                PhotoViewer photoViewer = ((zt0) o0Var2).f43515o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                o0 o0Var3 = this.f45271b;
                k kVar = o0Var3.S0;
                if ((kVar instanceof x2) && !o0Var3.T0) {
                    x2 x2Var = (x2) kVar;
                    o0Var3.T0 = true;
                    x2Var.q();
                    View focusedView = x2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.n1 n1Var = o0Var3.R1;
                if (n1Var != null && n1Var.isShowing()) {
                    o0Var3.R1.d(true);
                    return;
                }
                return;
            case 3:
                o0.b0(this.f45271b);
                return;
            default:
                o0 o0Var4 = this.f45271b;
                o0Var4.B0(2);
                if (!(o0Var4.S0 instanceof x2)) {
                    o0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

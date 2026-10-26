package sg;

import android.view.View;
import bi.dc;
import bi.pb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.nt0;
public final class k implements View.OnClickListener {
    public final int f48274a;
    public final n0 f48275b;

    public k(n0 n0Var, int i10) {
        this.f48274a = i10;
        this.f48275b = n0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48274a) {
            case 0:
                n0 n0Var = this.f48275b;
                if (n0Var.I0) {
                    n0Var.q0(null, true);
                    return;
                } else {
                    n0Var.A0(0);
                    return;
                }
            case 1:
                n0 n0Var2 = this.f48275b;
                int i10 = n0Var2.V0;
                n0Var2.A0(1);
                n0Var2.postDelayed(new n(n0Var2, 1), 350L);
                fi.l2 l2Var = new fi.l2(n0Var2.getContext(), n0Var2.F1, false, false);
                l2Var.E = new q(n0Var2);
                l2Var.s0(new dc(n0Var2, 4));
                l2Var.setOnDismissListener(new pb(n0Var2, i10));
                l2Var.show();
                PhotoViewer photoViewer = ((nt0) n0Var2).f41999d2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                n0 n0Var3 = this.f48275b;
                j jVar = n0Var3.H0;
                if ((jVar instanceof x2) && !n0Var3.I0) {
                    x2 x2Var = (x2) jVar;
                    n0Var3.I0 = true;
                    x2Var.q();
                    View focusedView = x2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.o1 o1Var = n0Var3.G1;
                if (o1Var != null && o1Var.isShowing()) {
                    n0Var3.G1.d(true);
                    return;
                }
                return;
            case 3:
                n0.Z(this.f48275b);
                return;
            default:
                n0 n0Var4 = this.f48275b;
                n0Var4.A0(2);
                if (!(n0Var4.H0 instanceof x2)) {
                    n0Var4.h0(true);
                    return;
                }
                return;
        }
    }
}

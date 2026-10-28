package sg;

import android.view.View;
import bi.dc;
import bi.pb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pt0;
public final class k implements View.OnClickListener {
    public final int f48322a;
    public final m0 f48323b;

    public k(m0 m0Var, int i10) {
        this.f48322a = i10;
        this.f48323b = m0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48322a) {
            case 0:
                m0 m0Var = this.f48323b;
                if (m0Var.I0) {
                    m0Var.q0(null, true);
                    return;
                } else {
                    m0Var.A0(0);
                    return;
                }
            case 1:
                m0 m0Var2 = this.f48323b;
                int i10 = m0Var2.V0;
                m0Var2.A0(1);
                m0Var2.postDelayed(new n(m0Var2, 1), 350L);
                fi.l2 l2Var = new fi.l2(m0Var2.getContext(), m0Var2.F1, false, false);
                l2Var.E = new q(m0Var2);
                l2Var.s0(new dc(m0Var2, 4));
                l2Var.setOnDismissListener(new pb(m0Var2, i10));
                l2Var.show();
                PhotoViewer photoViewer = ((pt0) m0Var2).f42502d2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                m0 m0Var3 = this.f48323b;
                j jVar = m0Var3.H0;
                if ((jVar instanceof w2) && !m0Var3.I0) {
                    w2 w2Var = (w2) jVar;
                    m0Var3.I0 = true;
                    w2Var.q();
                    View focusedView = w2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.o1 o1Var = m0Var3.G1;
                if (o1Var != null && o1Var.isShowing()) {
                    m0Var3.G1.d(true);
                    return;
                }
                return;
            case 3:
                m0.Z(this.f48323b);
                return;
            default:
                m0 m0Var4 = this.f48323b;
                m0Var4.A0(2);
                if (!(m0Var4.H0 instanceof w2)) {
                    m0Var4.h0(true);
                    return;
                }
                return;
        }
    }
}

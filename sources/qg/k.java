package qg;

import android.view.View;
import ci.y7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vt0;
public final class k implements View.OnClickListener {
    public final int f45098a;
    public final m0 f45099b;

    public k(m0 m0Var, int i10) {
        this.f45098a = i10;
        this.f45099b = m0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45098a) {
            case 0:
                m0 m0Var = this.f45099b;
                if (m0Var.T0) {
                    m0Var.s0(null, true);
                    return;
                } else {
                    m0Var.C0(0);
                    return;
                }
            case 1:
                m0 m0Var2 = this.f45099b;
                int i10 = m0Var2.f45167g1;
                m0Var2.C0(1);
                m0Var2.postDelayed(new n(m0Var2, 1), 350L);
                ci.s2 s2Var = new ci.s2(m0Var2.getContext(), m0Var2.Q1, false, false);
                s2Var.f5899y = new q(m0Var2);
                s2Var.q0(new y7(m0Var2, 3));
                s2Var.setOnDismissListener(new s(m0Var2, i10));
                s2Var.show();
                PhotoViewer photoViewer = ((vt0) m0Var2).f41815o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                m0 m0Var3 = this.f45099b;
                j jVar = m0Var3.S0;
                if ((jVar instanceof v2) && !m0Var3.T0) {
                    v2 v2Var = (v2) jVar;
                    m0Var3.T0 = true;
                    v2Var.q();
                    View focusedView = v2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.n1 n1Var = m0Var3.R1;
                if (n1Var != null && n1Var.isShowing()) {
                    m0Var3.R1.d(true);
                    return;
                }
                return;
            case 3:
                m0.b0(this.f45099b);
                return;
            default:
                m0 m0Var4 = this.f45099b;
                m0Var4.C0(2);
                if (!(m0Var4.S0 instanceof v2)) {
                    m0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

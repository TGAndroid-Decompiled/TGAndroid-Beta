package qg;

import android.view.View;
import ci.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
public final class k implements View.OnClickListener {
    public final int f41696a;
    public final m0 f41697b;

    public k(m0 m0Var, int i10) {
        this.f41696a = i10;
        this.f41697b = m0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41696a) {
            case 0:
                m0 m0Var = this.f41697b;
                if (m0Var.T0) {
                    m0Var.r0(null, true);
                    return;
                } else {
                    m0Var.B0(0);
                    return;
                }
            case 1:
                m0 m0Var2 = this.f41697b;
                int i10 = m0Var2.f41748g1;
                m0Var2.B0(1);
                m0Var2.postDelayed(new n(m0Var2, 1), 350L);
                ci.t2 t2Var = new ci.t2(m0Var2.getContext(), m0Var2.Q1, false, false);
                t2Var.f5555y = new q(m0Var2);
                t2Var.q0(new a8(m0Var2, 3));
                t2Var.setOnDismissListener(new s(m0Var2, i10));
                t2Var.show();
                PhotoViewer photoViewer = ((au0) m0Var2).f32142o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                m0 m0Var3 = this.f41697b;
                j jVar = m0Var3.S0;
                if ((jVar instanceof u2) && !m0Var3.T0) {
                    u2 u2Var = (u2) jVar;
                    m0Var3.T0 = true;
                    u2Var.q();
                    View focusedView = u2Var.getFocusedView();
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
                m0.b0(this.f41697b);
                return;
            default:
                m0 m0Var4 = this.f41697b;
                m0Var4.B0(2);
                if (!(m0Var4.S0 instanceof u2)) {
                    m0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

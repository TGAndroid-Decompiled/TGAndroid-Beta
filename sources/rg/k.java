package rg;

import ai.jc;
import ai.qb;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.it0;
public final class k implements View.OnClickListener {
    public final int f45425a;
    public final m0 f45426b;

    public k(m0 m0Var, int i10) {
        this.f45425a = i10;
        this.f45426b = m0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45425a) {
            case 0:
                m0 m0Var = this.f45426b;
                if (m0Var.T0) {
                    m0Var.s0(null, true);
                    return;
                } else {
                    m0Var.C0(0);
                    return;
                }
            case 1:
                m0 m0Var2 = this.f45426b;
                int i10 = m0Var2.f45477g1;
                m0Var2.C0(1);
                m0Var2.postDelayed(new n(m0Var2, 1), 350L);
                ei.n2 n2Var = new ei.n2(m0Var2.getContext(), m0Var2.Q1, false, false);
                n2Var.f9508y = new q(m0Var2);
                n2Var.r0(new jc(m0Var2, 4));
                n2Var.setOnDismissListener(new qb(m0Var2, i10));
                n2Var.show();
                PhotoViewer photoViewer = ((it0) m0Var2).f37974o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                m0 m0Var3 = this.f45426b;
                j jVar = m0Var3.S0;
                if ((jVar instanceof u2) && !m0Var3.T0) {
                    u2 u2Var = (u2) jVar;
                    m0Var3.T0 = true;
                    u2Var.q();
                    View focusedView = u2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.m1 m1Var = m0Var3.R1;
                if (m1Var != null && m1Var.isShowing()) {
                    m0Var3.R1.d(true);
                    return;
                }
                return;
            case 3:
                m0.b0(this.f45426b);
                return;
            default:
                m0 m0Var4 = this.f45426b;
                m0Var4.C0(2);
                if (!(m0Var4.S0 instanceof u2)) {
                    m0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

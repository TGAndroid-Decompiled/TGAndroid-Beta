package rg;

import ai.jc;
import ai.qb;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gt0;
public final class k implements View.OnClickListener {
    public final int f45421a;
    public final m0 f45422b;

    public k(m0 m0Var, int i10) {
        this.f45421a = i10;
        this.f45422b = m0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45421a) {
            case 0:
                m0 m0Var = this.f45422b;
                if (m0Var.T0) {
                    m0Var.s0(null, true);
                    return;
                } else {
                    m0Var.C0(0);
                    return;
                }
            case 1:
                m0 m0Var2 = this.f45422b;
                int i10 = m0Var2.f45487g1;
                m0Var2.C0(1);
                m0Var2.postDelayed(new n(m0Var2, 1), 350L);
                ei.n2 n2Var = new ei.n2(m0Var2.getContext(), m0Var2.Q1, false, false);
                n2Var.f9507y = new q(m0Var2);
                n2Var.r0(new jc(m0Var2, 4));
                n2Var.setOnDismissListener(new qb(m0Var2, i10));
                n2Var.show();
                PhotoViewer photoViewer = ((gt0) m0Var2).f37417o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                m0 m0Var3 = this.f45422b;
                j jVar = m0Var3.S0;
                if ((jVar instanceof v2) && !m0Var3.T0) {
                    v2 v2Var = (v2) jVar;
                    m0Var3.T0 = true;
                    v2Var.q();
                    View focusedView = v2Var.getFocusedView();
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
                m0.b0(this.f45422b);
                return;
            default:
                m0 m0Var4 = this.f45422b;
                m0Var4.C0(2);
                if (!(m0Var4.S0 instanceof v2)) {
                    m0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

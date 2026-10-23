package rg;

import ai.kc;
import ai.rb;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.jt0;
public final class k implements View.OnClickListener {
    public final int f45847a;
    public final m0 f45848b;

    public k(m0 m0Var, int i10) {
        this.f45847a = i10;
        this.f45848b = m0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45847a) {
            case 0:
                m0 m0Var = this.f45848b;
                if (m0Var.T0) {
                    m0Var.r0(null, true);
                    return;
                } else {
                    m0Var.B0(0);
                    return;
                }
            case 1:
                m0 m0Var2 = this.f45848b;
                int i10 = m0Var2.f45894g1;
                m0Var2.B0(1);
                m0Var2.postDelayed(new n(m0Var2, 1), 350L);
                ei.n2 n2Var = new ei.n2(m0Var2.getContext(), m0Var2.Q1, false, false);
                n2Var.E = new q(m0Var2);
                n2Var.s0(new kc(m0Var2, 4));
                n2Var.setOnDismissListener(new rb(m0Var2, i10));
                n2Var.show();
                PhotoViewer photoViewer = ((jt0) m0Var2).f38700o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                m0 m0Var3 = this.f45848b;
                j jVar = m0Var3.S0;
                if ((jVar instanceof w2) && !m0Var3.T0) {
                    w2 w2Var = (w2) jVar;
                    m0Var3.T0 = true;
                    w2Var.q();
                    View focusedView = w2Var.getFocusedView();
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
                m0.a0(this.f45848b);
                return;
            default:
                m0 m0Var4 = this.f45848b;
                m0Var4.B0(2);
                if (!(m0Var4.S0 instanceof w2)) {
                    m0Var4.i0(true);
                    return;
                }
                return;
        }
    }
}

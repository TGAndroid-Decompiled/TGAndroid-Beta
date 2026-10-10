package qg;

import android.view.View;
import ci.x7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bu0;
public final class k implements View.OnClickListener {
    public final int f46365a;
    public final m0 f46366b;

    public k(m0 m0Var, int i10) {
        this.f46365a = i10;
        this.f46366b = m0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46365a) {
            case 0:
                m0 m0Var = this.f46366b;
                if (m0Var.T0) {
                    m0Var.s0(null, true);
                    return;
                } else {
                    m0Var.C0(0);
                    return;
                }
            case 1:
                m0 m0Var2 = this.f46366b;
                int i10 = m0Var2.f46415g1;
                m0Var2.C0(1);
                m0Var2.postDelayed(new n(m0Var2, 1), 350L);
                ci.r2 r2Var = new ci.r2(m0Var2.getContext(), m0Var2.Q1, false, false);
                r2Var.f5891y = new q(m0Var2);
                r2Var.r0(new x7(m0Var2, 3));
                r2Var.setOnDismissListener(new s(m0Var2, i10));
                r2Var.show();
                PhotoViewer photoViewer = ((bu0) m0Var2).f36478o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                m0 m0Var3 = this.f46366b;
                j jVar = m0Var3.S0;
                if ((jVar instanceof w2) && !m0Var3.T0) {
                    w2 w2Var = (w2) jVar;
                    m0Var3.T0 = true;
                    w2Var.q();
                    View focusedView = w2Var.getFocusedView();
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
                m0.b0(this.f46366b);
                return;
            default:
                m0 m0Var4 = this.f46366b;
                m0Var4.C0(2);
                if (!(m0Var4.S0 instanceof w2)) {
                    m0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

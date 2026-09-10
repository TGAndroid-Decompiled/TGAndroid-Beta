package pg;

import android.view.View;
import bi.c9;
import bi.f3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
public final class k implements View.OnClickListener {
    public final int f40068a;
    public final m0 f40069b;

    public k(m0 m0Var, int i10) {
        this.f40068a = i10;
        this.f40069b = m0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40068a) {
            case 0:
                m0 m0Var = this.f40069b;
                if (m0Var.T0) {
                    m0Var.r0(null, true);
                    return;
                } else {
                    m0Var.B0(0);
                    return;
                }
            case 1:
                m0 m0Var2 = this.f40069b;
                int i10 = m0Var2.f40134g1;
                m0Var2.B0(1);
                m0Var2.postDelayed(new n(m0Var2, 1), 350L);
                f3 f3Var = new f3(m0Var2.getContext(), m0Var2.Q1, false, false);
                f3Var.f2699y = new q(m0Var2);
                f3Var.q0(new c9(m0Var2, 3));
                f3Var.setOnDismissListener(new s(m0Var2, i10));
                f3Var.show();
                PhotoViewer photoViewer = ((zt0) m0Var2).f39441o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                m0 m0Var3 = this.f40069b;
                j jVar = m0Var3.S0;
                if ((jVar instanceof v2) && !m0Var3.T0) {
                    v2 v2Var = (v2) jVar;
                    m0Var3.T0 = true;
                    v2Var.q();
                    View focusedView = v2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.p1 p1Var = m0Var3.R1;
                if (p1Var != null && p1Var.isShowing()) {
                    m0Var3.R1.d(true);
                    return;
                }
                return;
            case 3:
                m0.b0(this.f40069b);
                return;
            default:
                m0 m0Var4 = this.f40069b;
                m0Var4.B0(2);
                if (!(m0Var4.S0 instanceof v2)) {
                    m0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

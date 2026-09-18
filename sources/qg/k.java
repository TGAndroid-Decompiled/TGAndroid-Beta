package qg;

import android.view.View;
import ci.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cu0;
public final class k implements View.OnClickListener {
    public final int f41452a;
    public final p0 f41453b;

    public k(p0 p0Var, int i10) {
        this.f41452a = i10;
        this.f41453b = p0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41452a) {
            case 0:
                p0 p0Var = this.f41453b;
                if (p0Var.T0) {
                    p0Var.r0(null, true);
                    return;
                } else {
                    p0Var.B0(0);
                    return;
                }
            case 1:
                p0 p0Var2 = this.f41453b;
                int i10 = p0Var2.f41553g1;
                p0Var2.B0(1);
                p0Var2.postDelayed(new n(p0Var2, 1), 350L);
                ci.t2 t2Var = new ci.t2(p0Var2.getContext(), p0Var2.Q1, false, false);
                t2Var.f5555y = new q(p0Var2);
                t2Var.q0(new a8(p0Var2, 3));
                t2Var.setOnDismissListener(new s(p0Var2, i10));
                t2Var.show();
                PhotoViewer photoViewer = ((cu0) p0Var2).f32924o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                p0 p0Var3 = this.f41453b;
                j jVar = p0Var3.S0;
                if ((jVar instanceof x2) && !p0Var3.T0) {
                    x2 x2Var = (x2) jVar;
                    p0Var3.T0 = true;
                    x2Var.q();
                    View focusedView = x2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.o1 o1Var = p0Var3.R1;
                if (o1Var != null && o1Var.isShowing()) {
                    p0Var3.R1.d(true);
                    return;
                }
                return;
            case 3:
                p0.b0(this.f41453b);
                return;
            default:
                p0 p0Var4 = this.f41453b;
                p0Var4.B0(2);
                if (!(p0Var4.S0 instanceof x2)) {
                    p0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

package rg;

import android.view.View;
import di.w7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hu0;
public final class k implements View.OnClickListener {
    public final int f44321a;
    public final o0 f44322b;

    public k(o0 o0Var, int i10) {
        this.f44321a = i10;
        this.f44322b = o0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44321a) {
            case 0:
                o0 o0Var = this.f44322b;
                if (o0Var.T0) {
                    o0Var.s0(null, true);
                    return;
                } else {
                    o0Var.C0(0);
                    return;
                }
            case 1:
                o0 o0Var2 = this.f44322b;
                int i10 = o0Var2.f44411g1;
                o0Var2.C0(1);
                o0Var2.postDelayed(new n(o0Var2, 1), 350L);
                di.r2 r2Var = new di.r2(o0Var2.getContext(), o0Var2.Q1, false, false);
                r2Var.f7696y = new q(o0Var2);
                r2Var.r0(new w7(o0Var2, 3));
                r2Var.setOnDismissListener(new s(o0Var2, i10));
                r2Var.show();
                PhotoViewer photoViewer = ((hu0) o0Var2).f36960o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    return;
                }
                return;
            case 2:
                o0 o0Var3 = this.f44322b;
                j jVar = o0Var3.S0;
                if ((jVar instanceof x2) && !o0Var3.T0) {
                    x2 x2Var = (x2) jVar;
                    o0Var3.T0 = true;
                    x2Var.q();
                    View focusedView = x2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.m1 m1Var = o0Var3.R1;
                if (m1Var != null && m1Var.isShowing()) {
                    o0Var3.R1.d(true);
                    return;
                }
                return;
            case 3:
                o0.b0(this.f44322b);
                return;
            default:
                o0 o0Var4 = this.f44322b;
                o0Var4.C0(2);
                if (!(o0Var4.S0 instanceof x2)) {
                    o0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}

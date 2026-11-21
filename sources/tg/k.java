package tg;

import android.view.View;
import di.ca;
import di.ta;
public final class k implements View.OnClickListener {
    public final int f58025a;
    public final h0 f58026b;

    public k(h0 h0Var, int i7) {
        this.f58025a = i7;
        this.f58026b = h0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f58025a) {
            case 0:
                h0 h0Var = this.f58026b;
                if (h0Var.D0) {
                    h0Var.r0(null, true);
                    return;
                } else {
                    h0Var.B0(0);
                    return;
                }
            case 1:
                h0 h0Var2 = this.f58026b;
                int i7 = h0Var2.Q0;
                h0Var2.B0(1);
                h0Var2.postDelayed(new n(h0Var2, 1), 350L);
                hi.i2 i2Var = new hi.i2(h0Var2.getContext(), h0Var2.A1, false, false);
                i2Var.f14783z1 = new q(h0Var2);
                i2Var.O0(new ta(h0Var2, 4));
                i2Var.setOnDismissListener(new ca(h0Var2, i7));
                i2Var.show();
                h0Var2.o0(true);
                return;
            case 2:
                h0 h0Var3 = this.f58026b;
                j jVar = h0Var3.C0;
                if ((jVar instanceof n2) && !h0Var3.D0) {
                    n2 n2Var = (n2) jVar;
                    h0Var3.D0 = true;
                    n2Var.q();
                    View focusedView = n2Var.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.g0.I3(focusedView);
                }
                org.telegram.ui.ActionBar.g1 g1Var = h0Var3.B1;
                if (g1Var != null && g1Var.isShowing()) {
                    h0Var3.B1.d(true);
                    return;
                }
                return;
            case 3:
                h0.Z(this.f58026b);
                return;
            default:
                h0 h0Var4 = this.f58026b;
                h0Var4.B0(2);
                if (!(h0Var4.C0 instanceof n2)) {
                    h0Var4.h0(true);
                    return;
                }
                return;
        }
    }
}

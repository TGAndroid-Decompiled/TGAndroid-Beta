package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y7 implements View.OnClickListener {
    public final int f40067a;
    public final Object f40068b;

    public y7(Object obj, int i10) {
        this.f40067a = i10;
        this.f40068b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40067a) {
            case 0:
                e8 e8Var = (e8) this.f40068b;
                h8 h8Var = e8Var.f33296x;
                if (e8Var.f33292n != null && h8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < e8Var.d; i12++) {
                        f8 f8Var = (f8) e8Var.f33292n.get(i12, null);
                        if (f8Var != null) {
                            if (i10 == -1) {
                                i10 = f8Var.h;
                            }
                            i11 = f8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        h8Var.P = i10;
                        h8Var.Q = i11;
                        h8Var.t0();
                        h8Var.o0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.qc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f40068b).getSwipeBack().b(true);
                return;
            case 2:
                if (((l81) this.f40068b).f35242a.getImageReceiver().getLottieAnimation() != null && !((l81) this.f40068b).f35242a.getImageReceiver().getLottieAnimation().f25082k0) {
                    ((l81) this.f40068b).f35242a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((l81) this.f40068b).f35242a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((wf1) this.f40068b).H0(true);
                return;
        }
    }
}

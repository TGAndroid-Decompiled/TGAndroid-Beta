package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y7 implements View.OnClickListener {
    public final int f40066a;
    public final Object f40067b;

    public y7(Object obj, int i10) {
        this.f40066a = i10;
        this.f40067b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40066a) {
            case 0:
                e8 e8Var = (e8) this.f40067b;
                h8 h8Var = e8Var.f33295x;
                if (e8Var.f33291n != null && h8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < e8Var.d; i12++) {
                        f8 f8Var = (f8) e8Var.f33291n.get(i12, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f40067b).getSwipeBack().b(true);
                return;
            case 2:
                if (((l81) this.f40067b).f35241a.getImageReceiver().getLottieAnimation() != null && !((l81) this.f40067b).f35241a.getImageReceiver().getLottieAnimation().f25081k0) {
                    ((l81) this.f40067b).f35241a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((l81) this.f40067b).f35241a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((wf1) this.f40067b).H0(true);
                return;
        }
    }
}

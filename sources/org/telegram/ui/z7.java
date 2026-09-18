package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z7 implements View.OnClickListener {
    public final int f40005a;
    public final Object f40006b;

    public z7(Object obj, int i10) {
        this.f40005a = i10;
        this.f40006b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40005a) {
            case 0:
                f8 f8Var = (f8) this.f40006b;
                i8 i8Var = f8Var.f33466x;
                if (f8Var.f33462n != null && i8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < f8Var.d; i12++) {
                        g8 g8Var = (g8) f8Var.f33462n.get(i12, null);
                        if (g8Var != null) {
                            if (i10 == -1) {
                                i10 = g8Var.h;
                            }
                            i11 = g8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        i8Var.P = i10;
                        i8Var.Q = i11;
                        i8Var.t0();
                        i8Var.o0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.qc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f40006b).getSwipeBack().b(true);
                return;
            case 2:
                if (((q81) this.f40006b).f36725a.getImageReceiver().getLottieAnimation() != null && !((q81) this.f40006b).f36725a.getImageReceiver().getLottieAnimation().f24985k0) {
                    ((q81) this.f40006b).f36725a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((q81) this.f40006b).f36725a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((dg1) this.f40006b).H0(true);
                return;
        }
    }
}

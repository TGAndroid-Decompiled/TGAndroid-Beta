package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class w7 implements View.OnClickListener {
    public final int f43257a;
    public final Object f43258b;

    public w7(Object obj, int i10) {
        this.f43257a = i10;
        this.f43258b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43257a) {
            case 0:
                c8 c8Var = (c8) this.f43258b;
                f8 f8Var = c8Var.f36660x;
                if (c8Var.f36656n != null && f8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < c8Var.d; i12++) {
                        d8 d8Var = (d8) c8Var.f36656n.get(i12, null);
                        if (d8Var != null) {
                            if (i10 == -1) {
                                i10 = d8Var.h;
                            }
                            i11 = d8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        f8Var.P = i10;
                        f8Var.Q = i11;
                        f8Var.t0();
                        f8Var.o0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.sc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f43258b).getSwipeBack().b(true);
                return;
            case 2:
                if (((u81) this.f43258b).f42442a.getImageReceiver().getLottieAnimation() != null && !((u81) this.f43258b).f42442a.getImageReceiver().getLottieAnimation().f25818k0) {
                    ((u81) this.f43258b).f42442a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((u81) this.f43258b).f42442a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((eg1) this.f43258b).H0(true);
                return;
        }
    }
}

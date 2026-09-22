package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z7 implements View.OnClickListener {
    public final int f40152a;
    public final Object f40153b;

    public z7(Object obj, int i10) {
        this.f40152a = i10;
        this.f40153b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40152a) {
            case 0:
                f8 f8Var = (f8) this.f40153b;
                i8 i8Var = f8Var.f33564x;
                if (f8Var.f33560n != null && i8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < f8Var.d; i12++) {
                        g8 g8Var = (g8) f8Var.f33560n.get(i12, null);
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
                org.telegram.ui.Components.pc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f40153b).getSwipeBack().b(true);
                return;
            case 2:
                if (((u81) this.f40153b).f37996a.getImageReceiver().getLottieAnimation() != null && !((u81) this.f40153b).f37996a.getImageReceiver().getLottieAnimation().f25724k0) {
                    ((u81) this.f40153b).f37996a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((u81) this.f40153b).f37996a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((fg1) this.f40153b).H0(true);
                return;
        }
    }
}

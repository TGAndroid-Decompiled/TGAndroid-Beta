package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z7 implements View.OnClickListener {
    public final int f40130a;
    public final Object f40131b;

    public z7(Object obj, int i10) {
        this.f40130a = i10;
        this.f40131b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40130a) {
            case 0:
                f8 f8Var = (f8) this.f40131b;
                i8 i8Var = f8Var.f33539x;
                if (f8Var.f33535n != null && i8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < f8Var.d; i12++) {
                        g8 g8Var = (g8) f8Var.f33535n.get(i12, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f40131b).getSwipeBack().b(true);
                return;
            case 2:
                if (((u81) this.f40131b).f37995a.getImageReceiver().getLottieAnimation() != null && !((u81) this.f40131b).f37995a.getImageReceiver().getLottieAnimation().f24691k0) {
                    ((u81) this.f40131b).f37995a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((u81) this.f40131b).f37995a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((fg1) this.f40131b).H0(true);
                return;
        }
    }
}

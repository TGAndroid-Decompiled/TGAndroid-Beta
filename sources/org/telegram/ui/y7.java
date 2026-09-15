package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y7 implements View.OnClickListener {
    public final int f39769a;
    public final Object f39770b;

    public y7(Object obj, int i10) {
        this.f39769a = i10;
        this.f39770b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39769a) {
            case 0:
                e8 e8Var = (e8) this.f39770b;
                h8 h8Var = e8Var.f33269x;
                if (e8Var.f33265n != null && h8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < e8Var.d; i12++) {
                        f8 f8Var = (f8) e8Var.f33265n.get(i12, null);
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
                org.telegram.ui.Components.oc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f39770b).getSwipeBack().b(true);
                return;
            case 2:
                if (((q81) this.f39770b).f36802a.getImageReceiver().getLottieAnimation() != null && !((q81) this.f39770b).f36802a.getImageReceiver().getLottieAnimation().f29960l0) {
                    ((q81) this.f39770b).f36802a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((q81) this.f39770b).f36802a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((dg1) this.f39770b).H0(true);
                return;
        }
    }
}

package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y7 implements View.OnClickListener {
    public final int f43011a;
    public final Object f43012b;

    public y7(Object obj, int i10) {
        this.f43011a = i10;
        this.f43012b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43011a) {
            case 0:
                e8 e8Var = (e8) this.f43012b;
                h8 h8Var = e8Var.f35971x;
                if (e8Var.f35967n != null && h8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < e8Var.d; i12++) {
                        f8 f8Var = (f8) e8Var.f35967n.get(i12, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f43012b).getSwipeBack().b(true);
                return;
            case 2:
                if (((u81) this.f43012b).f40974a.getImageReceiver().getLottieAnimation() != null && !((u81) this.f43012b).f40974a.getImageReceiver().getLottieAnimation().f32566l0) {
                    ((u81) this.f43012b).f40974a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    ((u81) this.f43012b).f40974a.getImageReceiver().getLottieAnimation().F(false);
                    return;
                }
                return;
            default:
                ((eg1) this.f43012b).H0(true);
                return;
        }
    }
}

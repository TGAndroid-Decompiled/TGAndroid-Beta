package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y7 implements View.OnClickListener {
    public final int f40172a;
    public final Object f40173b;

    public y7(Object obj, int i10) {
        this.f40172a = i10;
        this.f40173b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40172a) {
            case 0:
                e8 e8Var = (e8) this.f40173b;
                h8 h8Var = e8Var.f33378x;
                if (e8Var.f33374n != null && h8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < e8Var.d; i12++) {
                        f8 f8Var = (f8) e8Var.f33374n.get(i12, null);
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
                org.telegram.ui.Components.rc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f40173b).getSwipeBack().b(true);
                return;
            case 2:
                if (((l81) this.f40173b).f35332a.getImageReceiver().getLottieAnimation() != null && !((l81) this.f40173b).f35332a.getImageReceiver().getLottieAnimation().f26021k0) {
                    ((l81) this.f40173b).f35332a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((l81) this.f40173b).f35332a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((wf1) this.f40173b).H0(true);
                return;
        }
    }
}

package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class x7 implements View.OnClickListener {
    public final int f43837a;
    public final Object f43838b;

    public x7(Object obj, int i10) {
        this.f43837a = i10;
        this.f43838b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43837a) {
            case 0:
                d8 d8Var = (d8) this.f43838b;
                g8 g8Var = d8Var.f36888x;
                if (d8Var.f36884n != null && g8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < d8Var.d; i12++) {
                        e8 e8Var = (e8) d8Var.f36884n.get(i12, null);
                        if (e8Var != null) {
                            if (i10 == -1) {
                                i10 = e8Var.h;
                            }
                            i11 = e8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        g8Var.P = i10;
                        g8Var.Q = i11;
                        g8Var.t0();
                        g8Var.o0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.tc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f43838b).getSwipeBack().b(true);
                return;
            case 2:
                if (((v81) this.f43838b).f42706a.getImageReceiver().getLottieAnimation() != null && !((v81) this.f43838b).f42706a.getImageReceiver().getLottieAnimation().f25409k0) {
                    ((v81) this.f43838b).f42706a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((v81) this.f43838b).f42706a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((fg1) this.f43838b).H0(true);
                return;
        }
    }
}

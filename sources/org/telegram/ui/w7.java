package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class w7 implements View.OnClickListener {
    public final int f43855a;
    public final Object f43856b;

    public w7(Object obj, int i10) {
        this.f43855a = i10;
        this.f43856b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43855a) {
            case 0:
                c8 c8Var = (c8) this.f43856b;
                f8 f8Var = c8Var.f37036x;
                if (c8Var.f37032n != null && f8Var.C) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < c8Var.d; i12++) {
                        d8 d8Var = (d8) c8Var.f37032n.get(i12, null);
                        if (d8Var != null) {
                            if (i10 == -1) {
                                i10 = d8Var.h;
                            }
                            i11 = d8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        f8Var.L = i10;
                        f8Var.M = i11;
                        f8Var.t0();
                        f8Var.o0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.mc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f43856b).getSwipeBack().b(true);
                return;
            case 2:
                if (((o71) this.f43856b).f40998a.getImageReceiver().getLottieAnimation() != null && !((o71) this.f43856b).f40998a.getImageReceiver().getLottieAnimation().f34742h0) {
                    ((o71) this.f43856b).f40998a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    ((o71) this.f43856b).f40998a.getImageReceiver().getLottieAnimation().F(false);
                    return;
                }
                return;
            default:
                ((ze1) this.f43856b).H0(true);
                return;
        }
    }
}

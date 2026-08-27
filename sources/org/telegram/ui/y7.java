package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class y7 implements View.OnClickListener {

    public final int f44717a;

    public final Object f44718b;

    public y7(Object obj, int i10) {
        this.f44717a = i10;
        this.f44718b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44717a) {
            case 0:
                e8 e8Var = (e8) this.f44718b;
                h8 h8Var = e8Var.f37662x;
                if (e8Var.f37658n != null && h8Var.C) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < e8Var.d; i12++) {
                        f8 f8Var = (f8) e8Var.f37658n.get(i12, null);
                        if (f8Var != null) {
                            if (i10 == -1) {
                                i10 = f8Var.h;
                            }
                            i11 = f8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        h8Var.L = i10;
                        h8Var.M = i11;
                        h8Var.t0();
                        h8Var.o0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.ec.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f44718b).getSwipeBack().b(true);
                break;
            case 2:
                if (((k71) this.f44718b).f39644a.getImageReceiver().getLottieAnimation() != null && !((k71) this.f44718b).f39644a.getImageReceiver().getLottieAnimation().f31317h0) {
                    ((k71) this.f44718b).f39644a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    ((k71) this.f44718b).f39644a.getImageReceiver().getLottieAnimation().F(false);
                    break;
                }
                break;
            default:
                ((we1) this.f44718b).H0(true);
                break;
        }
    }
}

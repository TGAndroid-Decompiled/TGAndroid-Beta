package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class x7 implements View.OnClickListener {
    public final int f44389a;
    public final Object f44390b;

    public x7(Object obj, int i9) {
        this.f44389a = i9;
        this.f44390b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44389a) {
            case 0:
                d8 d8Var = (d8) this.f44390b;
                g8 g8Var = d8Var.f37442x;
                if (d8Var.f37438n != null && g8Var.C) {
                    int i9 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < d8Var.d; i11++) {
                        e8 e8Var = (e8) d8Var.f37438n.get(i11, null);
                        if (e8Var != null) {
                            if (i9 == -1) {
                                i9 = e8Var.h;
                            }
                            i10 = e8Var.h;
                        }
                    }
                    if (i9 >= 0 && i10 >= 0) {
                        g8Var.L = i9;
                        g8Var.M = i10;
                        g8Var.s0();
                        g8Var.n0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.gc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f44390b).getSwipeBack().b(true);
                return;
            case 2:
                if (((l71) this.f44390b).f40073a.getImageReceiver().getLottieAnimation() != null && !((l71) this.f44390b).f40073a.getImageReceiver().getLottieAnimation().f30852h0) {
                    ((l71) this.f44390b).f40073a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    ((l71) this.f44390b).f40073a.getImageReceiver().getLottieAnimation().F(false);
                    return;
                }
                return;
            default:
                ((we1) this.f44390b).G0(true);
                return;
        }
    }
}

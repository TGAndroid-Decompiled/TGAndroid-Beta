package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z7 implements View.OnClickListener {
    public final int f52474a;
    public final Object f52475b;

    public z7(Object obj, int i7) {
        this.f52474a = i7;
        this.f52475b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52474a) {
            case 0:
                e8 e8Var = (e8) this.f52475b;
                h8 h8Var = e8Var.f45231y;
                if (e8Var.f45226n != null && h8Var.G) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < e8Var.d; i11++) {
                        f8 f8Var = (f8) e8Var.f45226n.get(i11, null);
                        if (f8Var != null) {
                            if (i7 == -1) {
                                i7 = f8Var.h;
                            }
                            i10 = f8Var.h;
                        }
                    }
                    if (i7 >= 0 && i10 >= 0) {
                        h8Var.P = i7;
                        h8Var.Q = i10;
                        h8Var.B0();
                        h8Var.u0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.cc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f52475b).getSwipeBack().b(true);
                return;
            case 2:
                if (((z21) this.f52475b).f52425a.getImageReceiver().B() != null && !((z21) this.f52475b).f52425a.getImageReceiver().B().f41003k0) {
                    ((z21) this.f52475b).f52425a.getImageReceiver().B().N(0, false, false);
                    ((z21) this.f52475b).f52425a.getImageReceiver().B().H(false);
                    return;
                }
                return;
            case 3:
                vf.c.t((Context) this.f52475b, org.telegram.messenger.id.M0(2131745258, null));
                return;
            default:
                ((w91) this.f52475b).L0(true);
                return;
        }
    }
}

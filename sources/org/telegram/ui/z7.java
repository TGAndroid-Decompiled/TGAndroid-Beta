package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z7 implements View.OnClickListener {
    public final int f52495a;
    public final Object f52496b;

    public z7(Object obj, int i7) {
        this.f52495a = i7;
        this.f52496b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52495a) {
            case 0:
                e8 e8Var = (e8) this.f52496b;
                h8 h8Var = e8Var.f45236y;
                if (e8Var.f45231n != null && h8Var.G) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < e8Var.d; i11++) {
                        f8 f8Var = (f8) e8Var.f45231n.get(i11, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f52496b).getSwipeBack().b(true);
                return;
            case 2:
                if (((z21) this.f52496b).f52445a.getImageReceiver().B() != null && !((z21) this.f52496b).f52445a.getImageReceiver().B().f40984k0) {
                    ((z21) this.f52496b).f52445a.getImageReceiver().B().N(0, false, false);
                    ((z21) this.f52496b).f52445a.getImageReceiver().B().H(false);
                    return;
                }
                return;
            case 3:
                vf.c.t((Context) this.f52496b, org.telegram.messenger.hd.M0(2131745256, null));
                return;
            default:
                ((v91) this.f52496b).L0(true);
                return;
        }
    }
}

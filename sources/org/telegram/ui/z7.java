package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z7 implements View.OnClickListener {
    public final int f52453a;
    public final Object f52454b;

    public z7(Object obj, int i7) {
        this.f52453a = i7;
        this.f52454b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52453a) {
            case 0:
                e8 e8Var = (e8) this.f52454b;
                h8 h8Var = e8Var.f45327y;
                if (e8Var.f45322n != null && h8Var.G) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < e8Var.d; i11++) {
                        f8 f8Var = (f8) e8Var.f45322n.get(i11, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f52454b).getSwipeBack().b(true);
                return;
            case 2:
                if (((b31) this.f52454b).f43869a.getImageReceiver().B() != null && !((b31) this.f52454b).f43869a.getImageReceiver().B().f31834k0) {
                    ((b31) this.f52454b).f43869a.getImageReceiver().B().N(0, false, false);
                    ((b31) this.f52454b).f43869a.getImageReceiver().B().H(false);
                    return;
                }
                return;
            case 3:
                vf.c.t((Context) this.f52454b, org.telegram.messenger.id.M0(2131745255, null));
                return;
            default:
                ((y91) this.f52454b).L0(true);
                return;
        }
    }
}

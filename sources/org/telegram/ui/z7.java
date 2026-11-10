package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z7 implements View.OnClickListener {
    public final int f52308a;
    public final Object f52309b;

    public z7(Object obj, int i7) {
        this.f52308a = i7;
        this.f52309b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52308a) {
            case 0:
                e8 e8Var = (e8) this.f52309b;
                h8 h8Var = e8Var.f45201y;
                if (e8Var.f45196n != null && h8Var.G) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < e8Var.d; i11++) {
                        f8 f8Var = (f8) e8Var.f45196n.get(i11, null);
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
                org.telegram.ui.Components.bc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f52309b).getSwipeBack().b(true);
                return;
            case 2:
                if (((c31) this.f52309b).f44210a.getImageReceiver().B() != null && !((c31) this.f52309b).f44210a.getImageReceiver().B().f40976k0) {
                    ((c31) this.f52309b).f44210a.getImageReceiver().B().N(0, false, false);
                    ((c31) this.f52309b).f44210a.getImageReceiver().B().H(false);
                    return;
                }
                return;
            case 3:
                vf.c.t((Context) this.f52309b, org.telegram.messenger.id.M0(2131745255, null));
                return;
            default:
                ((z91) this.f52309b).L0(true);
                return;
        }
    }
}

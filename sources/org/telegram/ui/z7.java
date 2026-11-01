package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z7 implements View.OnClickListener {
    public final int f43838a;
    public final Object f43839b;

    public z7(Object obj, int i10) {
        this.f43838a = i10;
        this.f43839b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43838a) {
            case 0:
                e8 e8Var = (e8) this.f43839b;
                h8 h8Var = e8Var.f36775y;
                if (e8Var.f36770n != null && h8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < e8Var.d; i12++) {
                        f8 f8Var = (f8) e8Var.f36770n.get(i12, null);
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
                        h8Var.B0();
                        h8Var.u0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.wb.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f43839b).getSwipeBack().b(true);
                return;
            case 2:
                if (((o41) this.f43839b).f40040a.getImageReceiver().B() != null && !((o41) this.f43839b).f40040a.getImageReceiver().B().f25144k0) {
                    ((o41) this.f43839b).f40040a.getImageReceiver().B().N(0, false, false);
                    ((o41) this.f43839b).f40040a.getImageReceiver().B().H(false);
                    return;
                }
                return;
            case 3:
                gf.f.r((Context) this.f43839b, org.telegram.messenger.dd.L0(2131745273, null));
                return;
            default:
                ((nb1) this.f43839b).L0(true);
                return;
        }
    }
}

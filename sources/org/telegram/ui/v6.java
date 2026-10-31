package org.telegram.ui;

import android.content.Context;
public final class v6 extends org.telegram.ui.Components.ic {
    public final w6 f42635e0;

    public v6(w6 w6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.ic.W, 0, org.telegram.ui.Components.ic.f26951a0);
        this.f42635e0 = w6Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        y6 y6Var = (y6) this.f42635e0.f42883f;
        if (!z10) {
            y6Var.f43717b.l1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < y6Var.f43724f0.size()) {
                u6 u6Var = (u6) y6Var.f43724f0.get(i12);
                if (u6Var != null && u6Var.f7680a == 11 && u6Var.f42016f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            y6Var.f43717b.e1(new i2.w(i11, 7), 0, true);
        } else {
            y6Var.f43717b.l1();
        }
    }
}

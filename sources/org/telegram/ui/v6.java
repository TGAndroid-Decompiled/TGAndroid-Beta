package org.telegram.ui;

import android.content.Context;
public final class v6 extends org.telegram.ui.Components.ed {
    public final x6 f41454e0;

    public v6(x6 x6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.ed.W, 0, org.telegram.ui.Components.ed.f25666a0);
        this.f41454e0 = x6Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        z6 z6Var = this.f41454e0.f42624e;
        if (!z10) {
            z6Var.f43332b.i1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < z6Var.f43331a0.size()) {
                u6 u6Var = (u6) z6Var.f43331a0.get(i12);
                if (u6Var != null && u6Var.f44098a == 11 && u6Var.f40970f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            z6Var.f43332b.d1(new i2.w(i11, 3), 0, true);
        } else {
            z6Var.f43332b.i1();
        }
    }
}

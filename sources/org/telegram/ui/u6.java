package org.telegram.ui;

import android.content.Context;
public final class u6 extends org.telegram.ui.Components.gd {
    public final w6 f42385e0;

    public u6(w6 w6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.gd.W, 0, org.telegram.ui.Components.gd.f26688a0);
        this.f42385e0 = w6Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        y6 y6Var = this.f42385e0.f43138e;
        if (!z10) {
            y6Var.f44293b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < y6Var.f44292a0.size()) {
                t6 t6Var = (t6) y6Var.f44292a0.get(i12);
                if (t6Var != null && t6Var.f17129a == 11 && t6Var.f41908f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            y6Var.f44293b.e1(new i2.w(i11, 7), 0, true);
        } else {
            y6Var.f44293b.j1();
        }
    }
}

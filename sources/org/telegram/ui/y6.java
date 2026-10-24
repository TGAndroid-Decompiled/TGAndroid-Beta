package org.telegram.ui;

import android.content.Context;
public final class y6 extends org.telegram.ui.Components.bd {
    public final a7 f43762e0;

    public y6(a7 a7Var, Context context) {
        super(context, 11, org.telegram.ui.Components.bd.W, 0, org.telegram.ui.Components.bd.f24965a0);
        this.f43762e0 = a7Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        c7 c7Var = this.f43762e0.e;
        if (!z10) {
            c7Var.f36235b.l1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < c7Var.f36234a0.size()) {
                x6 x6Var = (x6) c7Var.f36234a0.get(i12);
                if (x6Var != null && x6Var.f44712a == 11 && x6Var.f43477f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            c7Var.f36235b.f1(new i2.v(i11, 7), 0, true);
        } else {
            c7Var.f36235b.l1();
        }
    }
}

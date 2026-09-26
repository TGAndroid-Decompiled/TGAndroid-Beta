package org.telegram.ui;

import android.content.Context;
public final class v6 extends org.telegram.ui.Components.dd {
    public final x6 f38651e0;

    public v6(x6 x6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.dd.W, 0, org.telegram.ui.Components.dd.f23592a0);
        this.f38651e0 = x6Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        z6 z6Var = this.f38651e0.e;
        if (!z10) {
            z6Var.f40348b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < z6Var.f40347a0.size()) {
                t6 t6Var = (t6) z6Var.f40347a0.get(i12);
                if (t6Var != null && t6Var.f15715a == 11 && t6Var.f37974f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            z6Var.f40348b.e1(new i2.w(i11, 7), 0, true);
        } else {
            z6Var.f40348b.j1();
        }
    }
}

package org.telegram.ui;

import android.content.Context;
public final class y6 extends org.telegram.ui.Components.dd {
    public final a7 f43316e0;

    public y6(a7 a7Var, Context context) {
        super(context, 11, org.telegram.ui.Components.dd.W, 0, org.telegram.ui.Components.dd.f25559a0);
        this.f43316e0 = a7Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        c7 c7Var = this.f43316e0.e;
        if (!z10) {
            c7Var.f35809b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < c7Var.f35808a0.size()) {
                x6 x6Var = (x6) c7Var.f35808a0.get(i12);
                if (x6Var != null && x6Var.f44291a == 11 && x6Var.f42985f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            c7Var.f35809b.e1(new i2.v(i11, 7), 0, true);
        } else {
            c7Var.f35809b.j1();
        }
    }
}
